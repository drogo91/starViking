import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Start extends JFrame{
    private JPanel startGame;
    private JButton valideButton;
    private JTextField choiceYourNameVikingTextField;
    private JTextField choiceYourNameFedererTextField;
    private JButton returnButton;
    private String nameFederer;
    private String nameViking;

    public Start() {
        this.setTitle("a");
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setSize(1000,700);
        this.setContentPane(startGame);
        this.setVisible(true);
        choiceYourNameVikingTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        valideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameFederer = choiceYourNameFedererTextField.toString();
                nameViking = choiceYourNameVikingTextField.toString();
                //Window game = new Window(String nameFederer, String nameViking);

            }
        });
        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startGame.setVisible(false);
                Menu start = new Menu();
            }
        });
    }
}
