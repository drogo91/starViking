import java.util.*;

public class System {
    public String name ;
    public char lvl_tech;
    public int wealth;
    public ArrayList<Sector> theSectors;

    public System(String name, char lvl_tech, int wealth){
        this.name = name;
        this.lvl_tech = lvl_tech;
        this.wealth = wealth;
        theSectors = new ArrayList() ;
    }

    public String get_name(){
        return this.name;
    }

    public char get_lvl_tech(){
        return this.lvl_tech;
    }
    public int get_wealth(){
        return this.wealth;
    }

    public void addSector(Sector aSector){
        theSectors.add(aSector);
    }



}
