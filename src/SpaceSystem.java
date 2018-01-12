import java.util.*;

public class SpaceSystem {
    private String name ;
    private char lvl_tech;
    private int wealth;
    private ArrayList<Sector> theSectors;

    public SpaceSystem(String name, char lvl_tech, int wealth){
        this.name = name;
        this.lvl_tech = lvl_tech;
        this.wealth = wealth;
        theSectors = new ArrayList() ;
    }

    public SpaceSystem(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getLvl_tech() {
        return lvl_tech;
    }

    public void setLvl_tech(char lvl_tech) {
        this.lvl_tech = lvl_tech;
    }

    public int getWealth() {
        return wealth;
    }

    public void setWealth(int wealth) {
        this.wealth = wealth;
    }

    public ArrayList<Sector> getTheSectors() {
        return theSectors;
    }

    public void setTheSectors(ArrayList<Sector> theSectors) {
        this.theSectors = theSectors;
    }

    public void addSector(Sector aSector){
        theSectors.add(aSector);
    }



}
