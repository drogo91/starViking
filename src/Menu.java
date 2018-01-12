import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame{
    private JPanel panel1;
    private JButton startGameButton;
    private JButton exitButton;
    private JButton tutorialButton;

    public Menu() {
        this.setTitle("a");
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setSize(500,500);
        this.setContentPane(panel1);
        this.setVisible(true);

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        startGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Window systeme3 = new Window();

            }
        });
        tutorialButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
