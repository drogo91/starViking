public class Unit {
    private String  name;
    private char levelTech;
    private int weight;
    private String code ;
    private char move;
    private int valueElect;
    private int valueAtt;
    private int valueDef;

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
    public

}
