import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MultiplyAndDivideCalculator extends JFrame {

    private JTextField num1Field, num2Field, resultField;

    public MultiplyAndDivideCalculator() {

        setTitle("Multiply and Divide Calculator");
        setLayout(new FlowLayout());

        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        resultField = new JTextField(15);
        resultField.setEditable(false);

        add(new JLabel("Number 1:"));
        add(num1Field);

        add(new JLabel("Number 2:"));
        add(num2Field);

        add(new JLabel("Result:"));
        add(resultField);

        // Add key listener using KeyAdapter
        addKeyListener(new KeyAdapter() {

            // Multiply when key is pressed
            @Override
            public void keyPressed(KeyEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    resultField.setText("Product: " + (num1 * num2));
                } catch (Exception ex) {
                    resultField.setText("Invalid input");
                }
            }

            // Divide when key is released
            @Override
            public void keyReleased(KeyEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    resultField.setText("Division: " + (num1 / num2));
                } catch (Exception ex) {
                    resultField.setText("Invalid input");
                }
            }
        });

        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setFocusable(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MultiplyAndDivideCalculator();
    }
}
