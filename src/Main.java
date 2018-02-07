import java.awt.*;

public class Main {

    public static void main(String[] args) {

        SpaceSystem Systeme = new SpaceSystem("map1_systeme3", 'A', 18);

        //paramètres du constructeur : char wealth, String type, /*String mod_type,*/ int mod_nbr,boolean capital, int _x, int _y, int _larg, Color _couleur, int _trait
        Sector moon = new Sector('C', "Vide", 0, false, 18, 218, 80, Color.RED, 8, 0, 0);
        Sector earthN = new Sector('B', "Atmospherique", 1, false, 100, 90, 122, Color.blue, 8, 0, 180);
        Sector earthS = new Sector('B', "Atmospherique", 1, true, 100, 95, 122, Color.orange, 8, -180, 180);
        Sector asteroid = new Sector('D', "Vide", 1, false, 155, 258, 90, Color.green, 8, 0, 0);        //rajouter le modificateur EW
        Sector planete = new Sector('D', "Vide", 0, false, 192, 358, 90, Color.green, 8, 0, 0);
        Sector deepSpace1 = new Sector('Z', "DeepSpace", 0, false, 268, 13, 75, Color.yellow, 6, 0, 0);
        Sector deepSpace2 = new Sector('Z', "DeepSpace", 0, false, 305, 120, 75, Color.yellow, 6, 0, 0);
        Sector deepSpace3 = new Sector('Z', "DeepSpace", 0, false, 295, 241, 75, Color.yellow, 6, 0, 0);

        Systeme.addSector(moon);
        Systeme.addSector(earthN);
        Systeme.addSector(earthS);
        Systeme.addSector(asteroid);
        Systeme.addSector(planete);
        Systeme.addSector(deepSpace1);
        Systeme.addSector(deepSpace2);
        Systeme.addSector(deepSpace3);

        Link l_moon_earthN = new Link();
        l_moon_earthN.setSector1(moon);
        l_moon_earthN.setSector2(earthN);
        l_moon_earthN.setType("orbite");

        Link l_earthN_deepSpace1 = new Link();
        l_earthN_deepSpace1.setSector1(earthN);
        l_earthN_deepSpace1.setSector2(deepSpace1);
        l_earthN_deepSpace1.setType("orbite");

        Link l_earthN_earthS = new Link();
        l_earthN_earthS.setSector1(earthN);
        l_earthN_earthS.setSector2(earthS);
        l_earthN_earthS.setType("atmospherique");

        Link l_asteroid_deepSpace2 = new Link();
        l_asteroid_deepSpace2.setSector1(asteroid);
        l_asteroid_deepSpace2.setSector2(deepSpace2);
        l_asteroid_deepSpace2.setType("orbite");

        Link l_planete_deepSpace3 = new Link();
        l_planete_deepSpace3.setSector1(planete);
        l_planete_deepSpace3.setSector2(deepSpace3);
        l_planete_deepSpace3.setType("orbite");

        //on ajoute les liens aux secteurs
        moon.addLink(l_moon_earthN);
        earthN.addLink(l_moon_earthN);
        earthN.addLink(l_earthN_deepSpace1);
        deepSpace1.addLink(l_earthN_deepSpace1);
        earthN.addLink(l_earthN_earthS);
        earthS.addLink(l_earthN_earthS);
        asteroid.addLink(l_asteroid_deepSpace2);
        deepSpace2.addLink(l_asteroid_deepSpace2);
        planete.addLink(l_planete_deepSpace3);
        deepSpace3.addLink(l_planete_deepSpace3);

        //on ajoute les joueurs
        //String name, String type, int point, int money, List<Unit> listUnit
        Player Viking = new Player("Viking", "Viking", 0, 60);

        //on ajoute les unités
        //String name, char levelTech, int weight, String code, char move, int valueElect, int valueAtt, int valueDef
        Unit V_unit2 = new Unit("Viking_unit2.png", 'C', 1, "RD", 'V', 3, 4, 4);
        Systeme.getTheSectors(0).setUnite(V_unit2);

        Menu fen = new Menu(Systeme);
    }

}
