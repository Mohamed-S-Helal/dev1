import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PyramidCsvDAO {
    List<Pyramid> pyramids = new ArrayList<>();
    List<String> lines = new ArrayList<>();
    String l;

    public PyramidCsvDAO(String path) {
        try{
            BufferedReader br = Files.newBufferedReader(Paths.get(path));
            br.readLine();
            while ((l = br.readLine()) != null){
                lines.add(l);
            }

            List<String> badData = Arrays.asList("","-","_","?",null);
            for (String line: lines){
                String[] row = line.split(",");

                boolean missing = false;
                for (String cell : row){
                    if (badData.contains(cell))
                    missing = true;
                }

                if (!missing){
                pyramids.add(new Pyramid(row[0], row[2], row[3], row[4], row[5], row[6], row[7], row[8], row[9], row[10], row[11], row[12], row[14]));
            }
        }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public List<Pyramid> getPyramids() {
        return pyramids;
    }



}
