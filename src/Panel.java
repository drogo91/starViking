import java.awt.*;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.*;

public class Panel extends JPanel {

    private SpaceSystem SS;
    private int hauteur;
    private int origin = 0;

    public MouseListener ML = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            int m_x = e.getX();
            int m_y = e.getY();

            for (int i=0; i < SS.getAllTheSectors().size(); i++)
            {
                if(SS.getTheSectors(i).getType().equals("Atmospherique") && SS.getTheSectors(i).getAngleDebut() == -180)
                {
                    //contains(SS.getTheSectors(i).getY(), SS.getTheSectors(i).getLargeur());
                    hauteur = SS.getTheSectors(i).getLargeur()/2;
                    origin = SS.getTheSectors(i).getLargeur();      //sert à décaler le bouton du Sud
                }
                else
                {
                    origin=0;
                    hauteur = SS.getTheSectors(i).getLargeur();
                }

                if(m_x >= SS.getTheSectors(i).getX()
                        && m_x <= SS.getTheSectors(i).getX()+SS.getTheSectors(i).getLargeur()
                        //&& contains(SS.getTheSectors(i).getY(), SS.getTheSectors(i).getLargeur()))
                        && m_y >= SS.getTheSectors(i).getY()+origin
                        && m_y <= SS.getTheSectors(i).getY()+origin+hauteur)
                {
                    //ici on a clické sur le secteur
                    System.out.println("click secteur " + SS.getTheSectors(i).getType());

                    //si on click sur une unité on vérifie tous ses déplacements possibles
                    /*for (int j=0; j <= SS.getAllTheSectors().size(); j++)
                    {
                        if (SS.getTheSectors(j).getUnite() != null)
                        {

                        }
                    }*/

                }
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    };

    public void paintComponent(Graphics g){

        //on active l'écoute de la souris
        addMouseListener(ML);

        //image de fond
        try {
            //System.getProperty("user.dir") -> récupère le chemin du projet
            Image img = ImageIO.read(new File(System.getProperty("user.dir")+"/image/map1_systeme3.jpg"));

            //Pour une image de fond
            g.drawImage(img, 0, 0, this.getWidth()/2, this.getHeight(), this);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            //System.getProperty("user.dir") -> récupère le chemin du projet
            Image img = ImageIO.read(new File(System.getProperty("user.dir")+"/image/map1_systeme6.png"));

            //Pour une image de fond
            g.drawImage(img, 400, 0, this.getWidth()/2, this.getHeight(), this);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //on trace tous les secteurs
        for (int i=0; i < SS.getAllTheSectors().size(); i++)
        {
            drawSector(i, g);
        }

        //drawUnit(g, SS);

        //on trace toutes les unitées
        for (int k=0; k < SS.getAllTheSectors().size(); k++)
        {
            if (SS.getTheSectors(k).getUnite() != null)
            {
                System.out.println("k :"+k+ " "+ !SS.getTheSectors(k).getUnite().getName().equals(""));
                //image d'unité
                try {
                    Image img = ImageIO.read(new File(System.getProperty("user.dir")+"/image/"+SS.getTheSectors(k).getUnite().getName()));
                    g.drawImage(img, SS.getTheSectors(k).getX(), SS.getTheSectors(k).getY(), SS.getTheSectors(k).getLargeur(), SS.getTheSectors(k).getLargeur(), this);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void drawSector(int sector, Graphics g)
    {
        switch (SS.getTheSectors(sector).getType())
        {
            case "Vide":
                Cercle c = new Cercle();       //lune, asteroids, starcities
                c.paintComponent(g, SS.getTheSectors(sector).getX(), SS.getTheSectors(sector).getY(), SS.getTheSectors(sector).getLargeur(), SS.getTheSectors(sector).getLargeur(), SS.getTheSectors(sector).getCouleur(), SS.getTheSectors(sector).getTrait());
                break;
            case "Atmospherique":
                DemiCercle dc = new DemiCercle();
                dc.paintComponent(g, SS.getTheSectors(sector).getX(), SS.getTheSectors(sector).getY(), SS.getTheSectors(sector).getLargeur(), SS.getTheSectors(sector).getLargeur(), SS.getTheSectors(sector).getAngleDebut(), SS.getTheSectors(sector).getAngleFin(), SS.getTheSectors(sector).getCouleur(), SS.getTheSectors(sector).getTrait());
                break;
            case "DeepSpace":
                Carre car = new Carre();       //deep space bas
                car.paintComponent(g, SS.getTheSectors(sector).getX(), SS.getTheSectors(sector).getY(), SS.getTheSectors(sector).getLargeur(), SS.getTheSectors(sector).getLargeur(), SS.getTheSectors(sector).getCouleur(), SS.getTheSectors(sector).getTrait());
                break;
        }
    }

    public Panel(SpaceSystem _system)
    {
        this.SS = _system;
    }

    public void moveUnit(SpaceSystem SS, Sector sector)
    {

    }
}
