import java.awt.*;

public class DemiCercle {
    public void paintComponent(Graphics g, int x, int y, int largeur, int hauteur, int startAngle, int finalAngle, Color color, int trait){
        //cercle
        Graphics2D g2D = (Graphics2D) g;

        //largeur du trait
        g2D.setStroke(new java.awt.BasicStroke(trait));
        //couleur
        g2D.setColor(color);
        //dessin de l'arc
        g2D.drawArc(x, y,largeur, hauteur,startAngle,finalAngle);
        //dessin de la ligne
        g2D.drawLine(x,y+hauteur/2, x+largeur, y+hauteur/2);
    }
}
