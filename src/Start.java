import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Start extends JFrame{
    private JPanel panel1;
    private JTextField nomDuJoueursFedererTextField;
    private JTextField nomDuJoueurVikingTextField;
    private JButton validButton;

    public Start(SpaceSystem _SpaceSystem) {
        this.setTitle("Start game");
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setSize(500,500);
        this.setContentPane(panel1);
        this.setVisible(true);

        validButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nameFederer = nomDuJoueursFedererTextField.getText();
                String nameViking = nomDuJoueurVikingTextField.getText();
                Window systeme3 = new Window(nameFederer, nameViking, _SpaceSystem);
            }
        });
    }
}
