import java.awt.*;

public class Cercle {

    public void paintComponent(Graphics g, int x, int y, int largeur, int hauteur, Color color, int trait){
        //cercle
        Graphics2D g2D = (Graphics2D) g;

        //largeur du trait
        g2D.setStroke(new java.awt.BasicStroke(trait));
        //couleur du cercle
        g2D.setColor(color);
        //dessin du cercle
        g2D.drawOval(x, y, largeur, hauteur);
    }
}
