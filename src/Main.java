import java.awt.*;

public class Main {

    public static void main(String[] args) {

        SpaceSystem Systeme = new SpaceSystem("map1_systeme3", 'A', 18);

        //paramètres du constructeur : char wealth, String type, /*String mod_type,*/ int mod_nbr,boolean capital, int _x, int _y, int _larg, Color _couleur, int _trait
        Sector moon = new Sector('C', "Vide", 0, false, 18, 218, 80, Color.RED, 8, 0, 0);
        Sector earthN = new Sector('B', "Atmospherique", 1, false, 100, 87, 122, Color.blue, 8, 0, 180);
        //Sector earthS = new Sector('B', "Atmospherique", 1, true, 100, 92, 122, Color.orange, 8, -180, 180);
        Sector asteroid = new Sector('D', "Vide", 1, false, 155, 255, 90, Color.green, 8, 0, 0);        //rajouter le modificateur EW
        Sector planete = new Sector('D', "Vide", 0, false, 188, 353, 90, Color.green, 8, 0, 0);
        Sector deepSpace1 = new Sector('Z', "DeepSpace", 0, false, 263, 13, 75, Color.yellow, 6, 0, 0);
        Sector deepSpace2 = new Sector('Z', "DeepSpace", 0, false, 300, 120, 75, Color.yellow, 6, 0, 0);
        Sector deepSpace3 = new Sector('Z', "DeepSpace", 0, false, 290, 241, 75, Color.yellow, 6, 0, 0);

        Systeme.addSector(moon);
        Systeme.addSector(earthN);
        //Systeme.addSector(earthS);
        Systeme.addSector(asteroid);
        Systeme.addSector(planete);
        Systeme.addSector(deepSpace1);
        Systeme.addSector(deepSpace2);
        Systeme.addSector(deepSpace3);
/*
        Panel panel = new Panel();
        panel.setSpaceSystem(Systeme);
        System.out.println("SpaceSystem : " + panel.afficher());

        System.out.println("Main _ moon : " + Systeme.getTheSectors(0).getX());*/
        /*
        Link l_moon_earth = new Link();
        l_moon_earth.setSector1(moon);
        l_moon_earth.setSector2(earth);

        Link l_moon_asteroid = new Link();
        l_moon_asteroid.setSector1(moon);
        l_moon_asteroid.setSector2(asteroid);

        moon.addLink(l_moon_earth);
        moon.addLink(l_moon_asteroid);
        earth.addLink(l_moon_earth);
        asteroid.addLink(l_moon_asteroid);
        */
        Menu fen = new Menu(Systeme);
    }

}
