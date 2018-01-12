import java.util.*;

public class Sector {
    private char wealth;
    private String type;
    private String mod_type;
    private int mod_nbr;
    private boolean capital;
    private int x;
    private int y;
    private ArrayList<Link> theLinks;

    public Sector (char wealth, String type, String mod_type, int mod_nbr,boolean capital){
        this.wealth = wealth;
        this.type = type;
        this.mod_type = mod_type;
        this.mod_nbr = mod_nbr;
        this.capital = capital;
        theLinks = new ArrayList<Link>();
    }

    public Sector(){}

    public char getWealth() {
        return wealth;
    }

    public void setWealth(char wealth) {
        this.wealth = wealth;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMod_type() {
        return mod_type;
    }

    public void setMod_type(String mod_type) {
        this.mod_type = mod_type;
    }

    public int getMod_nbr() {
        return mod_nbr;
    }

    public void setMod_nbr(int mod_nbr) {
        this.mod_nbr = mod_nbr;
    }

    public boolean isCapital() {
        return capital;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ArrayList<Link> getTheLinks() {
        return theLinks;
    }

    public void setTheLinks(ArrayList<Link> theLinks) {
        this.theLinks = theLinks;
    }

    // methodes

    public void addLink(Link aLink){
        theLinks.add(aLink);
    }



}
