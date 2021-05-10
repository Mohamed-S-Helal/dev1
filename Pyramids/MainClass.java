class MainClass{
    public static void main(String[] args) {
        PyramidCsvDAO dao = new PyramidCsvDAO("pyramids.csv");
        dao.getPyramids().forEach(System.out::println);
    }
}