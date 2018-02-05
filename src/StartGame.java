import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StartGame extends JFrame {
    private JButton valide = new JButton("valide");

    public StartGame(){
        this.setTitle("Start game");
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);

        JPanel pan = new JPanel();
        pan.setBackground(Color.white);
        this.setContentPane(pan);
        valide.setBounds(15,15,25, 15);
        pan.add(valide);
        //valide.si
        valide.setLocation(15, 20);
        this.setContentPane(valide);
        this.setVisible(true);


    }
    public void paintComponent(Graphics g){
        g.drawString("Enter your name", 50, 50);

    }

}
