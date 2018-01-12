public class Link {
    private String type;
    private Sector Sector1;
    private Sector Sector2;


    public Link(String type, Sector Sector1, Sector Sector2){
        this.type = type;
        this.Sector1 = Sector1;
        this.Sector2 = Sector2;
    }

    public Link(){}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Sector getSector1() {
        return Sector1;
    }

    public void setSector1(Sector sector1) {
        Sector1 = sector1;
    }

    public Sector getSector2() {
        return Sector2;
    }

    public void setSector2(Sector sector2) {
        Sector2 = sector2;
    }
}
