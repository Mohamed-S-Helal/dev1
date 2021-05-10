class Pyramid{
    private String pharaoh;
    private String modern_name;
    private String dynasty;
    private String site;
    private String base1;
    private String base2;
    private String height;
    private String slope;
    private String volume;
    private String latitude;
    private String longitude;
    private String type;
    private String material;



    public Pyramid(String pharaoh, String modern_name, String dynasty, String site, String base1, String base2, String height, String slope, String volume, String latitude, String longitude, String type, String material) {
        this.pharaoh = pharaoh;
        this.modern_name = modern_name;
        this.dynasty = dynasty;
        this.site = site;
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.slope = slope;
        this.volume = volume;
        this.latitude = latitude;
        this.longitude = longitude;
        this.type = type;
        this.material = material;
    }

    public String getSite() {
        return site;
    }

    public String getBase1() {
        return base1;
    }
    public String getBase2() {
        return base2;
    }
    public String getDynasty() {
        return dynasty;
    }
    public String getHeight() {
        return height;
    }
    public String getLatitude() {
        return latitude;
    }
    public String getLongitude() {
        return longitude;
    }
    public String getMaterial() {
        return material;
    }
    public String getModern_name() {
        return modern_name;
    }
    public String getPharaoh() {
        return pharaoh;
    }
    public String getSlope() {
        return slope;
    }
    public String getType() {
        return type;
    }
    public String getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Pyramid details:\n"+"pharaoh: "+pharaoh+"\n"+"modern_name: "+modern_name+"\n"+"dynasty: "+dynasty+"\n"+"site: "+site+"base1: "+base1+"\n"+"base2: "+base2+"\n"+"height: "+height+"\n"+"slope: "+slope+"\n"+"volume: "+volume+"\n"+"latitude: "+latitude+"\n"+"longitude: "+longitude+"\n"+"type: "+type+"\n"+"material: "+material;
    }

}