import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

import com.sun.prism.BasicStroke;
import com.sun.prism.paint.Color;

import java.awt.Image;
import java.awt.Stroke;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Font;

public class Panel extends JPanel {
    public void paintComponent(Graphics g){
        //Vous verrez cette phrase chaque fois que la m�thode sera invoqu�e
        System.out.println("Je suis ex�cut�e !");

        try {
            //System.getProperty("user.dir") -> r�cup�re le chemin du projet
            Image img = ImageIO.read(new File(System.getProperty("user.dir")+"/Images/map1_systeme3.jpg"));
            //g.drawImage(img, 0, 0, this);
            //Pour une image de fond
            g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Graphics2D g2 = (Graphics2D) g;
        //g2.setStroke(new Stroke(14,BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL));

        //X, Y, largeur, hauteur	fillOval -> rond plein / drawOval -> rond vide (cercle)
        g.setColor(java.awt.Color.red);
        //g.fillOval(20, 220, 75, 75);
        g.drawOval(20, 220, 75, 75);

    }
}