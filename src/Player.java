import java.util.ArrayList;
import java.util.*;
public class Player {
    private String name;
    private String type;
    private int point;
    private int money;
    private List<Unit> listUnit = new ArrayList<Unit>();

    public Player(String name, String type, int point, int money) {
        this.name = name;
        this.type = type;
        this.point = point;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public List<Unit> getListUnit() {
        return listUnit;
    }

    public void setListUnit(List<Unit> listUnit) {
        this.listUnit = listUnit;
    }
}
