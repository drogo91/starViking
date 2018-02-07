import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {

    private SpaceSystem SS;
    private JPanel pan = new JPanel();
    //private JButton bouton = new JButton("coucou");

    public Window(String nameViking, String nameFederer, SpaceSystem _SS){

        this.SS = _SS;
        this.setTitle(SS.getName());
        this.setSize(800, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setContentPane(new Panel(SS));
        this.setBackground(Color.black);
        this.setVisible(true);

        String typeViking = "viking";
        int pointViking = 0;
        int moneyViking = 60;
        String typeFederer = "federer";
        int pointFederer = 0;
        int moneyFederer = 0;
        Player viking = new Player(nameViking, typeViking, pointViking, moneyViking);
        Player federer = new Player(nameFederer, typeFederer, pointFederer, moneyFederer);

        boolean BtLabel = true;
        JPanel pan = new JPanel();
        Button bouton = new Button();
        bouton.setLabel(viking.getName());
        pan.add(bouton);
        this.add(pan);

        bouton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(bouton.getLabel() == viking.getName()) {
                    bouton.setLabel(federer.getName());
                }
                else
                {
                    bouton.setLabel(viking.getName());
                }
            }
        });




    }
}
