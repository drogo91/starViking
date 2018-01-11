public class Link {
    public String type;
    public Sector Sector1;
    public Sector Sector2;

    public Link(String type, Sector Sector1, Sector Sector2){
        this.type = type;
        this.Sector1 = Sector1;
        this.Sector2 = Sector2;
    }

    public String get_type(){
        return type;
    }
    public Sector get_Sector1(){
        return Sector1;
    }
    public Sector get_Sector2(){
        return Sector2;
    }
}
