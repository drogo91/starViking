import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private SpaceSystem SS;
    private JPanel pan = new JPanel();
    //private JButton bouton = new JButton("coucou");

    public Window(SpaceSystem _SS){

        this.SS = _SS;
        this.setTitle(SS.getName());
        this.setSize(800, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setContentPane(new Panel(SS));
        this.setBackground(Color.black);
        this.setVisible(true);

        //on trace tous les boutons
        for (int i=0; i < SS.getAllTheSectors().size(); i++)
        {
            /*JFrame f = new JFrame();
            JButton bouton = new JButton("coucou");
            JPanel p = new JPanel();
            bouton.setLayout(null);
            bouton.setLocation(SS.getTheSectors(i).getX(), SS.getTheSectors(i).getY());
            //bouton.setBounds(SS.getTheSectors(i).getX(), SS.getTheSectors(i).getY(), SS.getTheSectors(i).getLargeur(), SS.getTheSectors(i).getLargeur());
            p.add(bouton);
            this.add(p);*/
            //f.setVisible(true);

            JButton bouton = new JButton("coucou");
            bouton.setLocation(SS.getTheSectors(i).getX(), SS.getTheSectors(i).getY());
            bouton.setLayout(null);
            pan.add(bouton);

            //bouton.setBounds(SS.getTheSectors(i).getX(), SS.getTheSectors(i).getY(), SS.getTheSectors(i).getLargeur(), SS.getTheSectors(i).getLargeur());
            //bouton.setVisible(true);
            //this.repaint();
        }
    }
}
