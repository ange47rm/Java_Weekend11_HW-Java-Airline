public class Pilot extends CabinCrew{

    private String licenseNumber;

    public Pilot (String name, RankType rank, String licenseNumber){
        super (name, rank);
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber(){
        return this.licenseNumber;
    }

    public String flyPlane(){
        return "The plane takes off and flies away...";
    }


}
