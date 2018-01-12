public class Main {

    public static void main(String[] args) {
        SpaceSystem Systeme = new SpaceSystem();

        Sector moon = new Sector();
        Sector earth = new Sector();
        Sector asteroid = new Sector();

        Systeme.addSector(moon);
        Systeme.addSector(earth);
        Systeme.addSector(asteroid);

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

        Window fen = new Window();
    }

}
