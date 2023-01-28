package classes;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    //  Initiate Number Buttons
    private JButton buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven,
            buttonEight, buttonNine, buttonZero;

    //  Initiate Calculation Buttons
    private JButton buttonAddition, buttonSubtraction, buttonMultiplication, buttonDivision;

    //  Initiate Calculator Display
    private JTextField textDisplay;

    public void actionPerformed(ActionEvent e) {

    }
}
