public class Unit {
    private String  name;
    private char levelTech;
    private int weight;
    private String code ;
    private char move;
    private int valueElect;
    private int valueAtt;
    private int valueDef;
    private SpaceSystem spaceSystem;
    private Sector sector;

    public Unit(String name, char levelTech, int weight, String code, char move, int valueElect, int valueAtt, int valueDef) {
        this.name = name;
        this.levelTech = levelTech;
        this.weight = weight;
        this.code = code;
        this.move = move;
        this.valueElect = valueElect;
        this.valueAtt = valueAtt;
        this.valueDef = valueDef;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getLevelTech() {
        return levelTech;
    }

    public void setLevelTech(char levelTech) {
        this.levelTech = levelTech;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public char getMove() {
        return move;
    }

    public void setMove(char move) {
        this.move = move;
    }

    public int getValueElect() {
        return valueElect;
    }

    public void setValueElect(int valueElect) {
        this.valueElect = valueElect;
    }

    public int getValueAtt() {
        return valueAtt;
    }

    public void setValueAtt(int valueAtt) {
        this.valueAtt = valueAtt;
    }

    public int getValueDef() {
        return valueDef;
    }

    public void setValueDef(int valueDef) {
        this.valueDef = valueDef;
    }

    public Sector getSector() { return sector; }

    public void setSector(Sector sector) { this.sector = sector; }

    public SpaceSystem getSpaceSystem() { return spaceSystem; }

    public void setSpaceSystem(SpaceSystem spaceSystem) { this.spaceSystem = spaceSystem; }

    //renvoie la possibilité de se déplacer sur un secteur
    public boolean isMoveUnitPossible(Sector _sector, SpaceSystem _spaceSystem)
    {
        for (int i=0; i<= 10; i++)
        {
            switch (this.move)
            {
                case 'S':
                    return true;
                case 'P':
                    if (this.spaceSystem.getName() != _spaceSystem.getName())
                    {
                        return true;
                    }
                    else
                    {
                        return  false;
                    }
                case 'O':
                    if (this.spaceSystem.getName() == _spaceSystem.getName())
                    {
                        if ((this.sector.getType() == _sector.getType() && _sector.getType().equals("vide"))
                                || (this.sector.getType() == _sector.getType() && _sector.getType().equals("atmospherique")))
                        {
                            return true;
                        }
                        else
                        {
                            return  false;
                        }
                    }
                    else
                    {
                        return  false;
                    }
                case 'V':
                    if (this.spaceSystem.getName() == _spaceSystem.getName())
                    {
                        if ((this.sector.getType() == _sector.getType() && _sector.getType().equals("vide"))
                                || (this.sector.getType() == _sector.getType() && _sector.getType().equals("atmospherique")))
                        {
                            return true;
                        }
                        else
                        {
                            return  false;
                        }
                    }
                    else
                    {
                        return  false;
                    }
                case 'A':
                    break;
                default :
                    break;
            }
        }
        return false;
    }
}
