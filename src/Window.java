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
        this.setResizable(false);
        this.setContentPane(new Panel(SS));
        this.setBackground(Color.black);
        this.setVisible(true);
    }
}
