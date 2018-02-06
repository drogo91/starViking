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

    public MouseListener ML = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            int m_x = e.getX();
            int m_y = e.getY();

            //on trace tous les secteurs
            for (int i=0; i < SS.getAllTheSectors().size(); i++)
            {
                if(SS.getTheSectors(i).getType().equals("Atmospherique"))
                {
                    //contains(SS.getTheSectors(i).getY(), SS.getTheSectors(i).getLargeur());
                    hauteur = SS.getTheSectors(i).getLargeur()/2;
                }
                else
                {
                    hauteur = SS.getTheSectors(i).getLargeur();
                }

                if(m_x >= SS.getTheSectors(i).getX()
                        && m_x <= SS.getTheSectors(i).getX()+SS.getTheSectors(i).getLargeur()
                        //&& contains(SS.getTheSectors(i).getY(), SS.getTheSectors(i).getLargeur()))
                        && m_y >= SS.getTheSectors(i).getY()
                        && m_y <= SS.getTheSectors(i).getY()+hauteur)
                {
                    //ici on a clické sur le secteur
                    System.out.println("click secteur " + SS.getTheSectors(i).getType());
                }
            }
            /*
            if(m_x >= SS.getTheSectors(sector).getX()
                    && m_x <= SS.getTheSectors(sector).getX()+SS.getTheSectors(sector).getLargeur()
                    && m_y >= SS.getTheSectors(sector).getY()
                    && m_y <= SS.getTheSectors(sector).getY()+SS.getTheSectors(sector).getLargeur())
            {
                //ici on a clické sur le secteur
                System.out.println("click secteur " + SS.getTheSectors(sector).getType());
            }*/
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
            System.out.println("getLocation()"+System.getProperty("user.dir"));

            //Pour une image de fond
            g.drawImage(img, 0, 0, this.getWidth()/2, this.getHeight(), this);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            //System.getProperty("user.dir") -> récupère le chemin du projet
            Image img = ImageIO.read(new File(System.getProperty("user.dir")+"/image/map1_systeme3.jpg"));
            System.out.println("getLocation()"+System.getProperty("user.dir"));

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

        //Cercle c1 = new Cercle();       //lune
        //c1.paintComponent(g, SS.getTheSectors(0).getX(), SS.getTheSectors(0).getY(), 80, 80, java.awt.Color.red, 8);
/*
        Cercle c1 = new Cercle();       //lune
        //c1.paintComponent(g, 18, 218, 80, 80, java.awt.Color.red, 8);
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
        dc2.paintComponent(g,100, 90, 120, 125, -180, 180, java.awt.Color.orange, 8);*/

        //image d'unité
        try {
            Image img = ImageIO.read(new File(System.getProperty("user.dir")+"/image/Viking_unit1.jpg"));
            g.drawImage(img, 18, 218, 75, 75, this);
        } catch (IOException e) {
            e.printStackTrace();
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
}
