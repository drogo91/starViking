import java.util.*;

public class Sector {
    public char wealth;
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

    public char get_wealth(){
        return wealth;
    }

    public String get_type(){
        return type;
    }
    /*public void String get_mod_type(){
        return mod_type;
    }*/
    public int get_mod_nbr(){
        return mod_nbr;
    }
    public boolean get_capital(){
        return capital;
    }
    public void set_capital(boolean capital){
        this.capital = capital;
    }

    public int get_x(){
        return x;
    }

    public int get_y(){
        return y;
    }

    // methodes

    public void addLink(Link aLink){
        theLinks.add(aLink);
    }



}
