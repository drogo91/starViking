import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Panel extends JPanel {
    public void paintComponent(Graphics g){

        //image de fond
        try {
            //System.getProperty("user.dir") -> récupère le chemin du projet
            Image img = ImageIO.read(new File(System.getProperty("user.dir")+"/image/map1_systeme3.jpg"));
            System.out.println("getLocation()"+System.getProperty("user.dir"));

            //Pour une image de fond
            g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Cercle c1 = new Cercle();       //lune
        c1.paintComponent(g, 18, 218, 80, 80, java.awt.Color.red, 8);
        Cercle c2 = new Cercle();       //satellite
        c1.paintComponent(g, 188, 353, 90, 90, java.awt.Color.green, 8);
        Cercle c3 = new Cercle();       //asteroide
        c1.paintComponent(g, 155, 255, 90, 90, java.awt.Color.green, 8);
        Carre car1 = new Carre();       //deep space haut
        car1.paintComponent(g, 263, 13, 75, 75, java.awt.Color.yellow, 6);
        Carre car2 = new Carre();       //deep space milieu
        car2.paintComponent(g, 300, 120, 75, 75, java.awt.Color.yellow, 6);
        Carre car3 = new Carre();       //deep space bas
        car3.paintComponent(g, 290, 241, 75, 75, java.awt.Color.yellow, 6);

        DemiCercle dc1 = new DemiCercle();
        dc1.paintComponent(g,100, 85, 120, 125, 0, 180, java.awt.Color.blue, 8);
        DemiCercle dc2 = new DemiCercle();
        dc2.paintComponent(g,100, 90, 120, 125, -180, 180, java.awt.Color.orange, 8);

        //image d'unité
        try {
            Image img = ImageIO.read(new File(System.getProperty("user.dir")+"/image/Viking_unit1.jpg"));
            g.drawImage(img, 18, 218, 75, 75, this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

