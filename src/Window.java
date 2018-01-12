import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Window extends JFrame {
    public Window(){
        this.setTitle("Ma premi�re fen�tre Java");
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setContentPane(new Panel());

        this.setVisible(true);

    }
}
