public class Unit {
    public String  name;
    public String type;
    public String mod_type;
    public int mod_nbr;
    public boolean capital;
    public int x;
    public int y;
    public ArrayList<Link> theLinks;

    public Sector (char wealth, String type, String mod_type, int mod_nbr,boolean capital){
        this.wealth = wealth;
        this.type = type;
        this.mod_type = mod_type;
        this.mod_nbr = mod_nbr;
        this.capital = capital;
        theLinks = new ArrayList<Link>();
    }
}
