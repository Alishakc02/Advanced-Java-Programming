import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SumAndDifferenceCalculator extends JFrame {
  private JTextField num1Field, num2Field;
  private JLabel resultLabel;

  public SumAndDifferenceCalculator() {
  setTitle("Sum and Difference Calculator");
  setLayout(new FlowLayout());

  num1Field = new JTextField(10);
  num2Field = new JTextField(10);
  resultLabel = new JLabel("Result");

  JButton calculateButton = new JButton("Calculate");
  calculateButton.addMouseListener(new MouseAdapter() {
  @Override
  public void mousePressed(MouseEvent e) {
  try {
  int num1 = Integer.parseInt(num1Field.getText());
  int num2 = Integer.parseInt(num2Field.getText());
  resultLabel.setText("Sum: " + (num1 + num2));
  } catch (NumberFormatException ex) {
  resultLabel.setText("Invalid input");
  }
  }

  @Override
  public void mouseReleased(MouseEvent e) {
  try {
  int num1 = Integer.parseInt(num1Field.getText());
  int num2 = Integer.parseInt(num2Field.getText());
  resultLabel.setText("Difference: " + (num1 - num2));
  } catch (NumberFormatException ex) {
  resultLabel.setText("Invalid input");
  }
  }
  });

  add(new JLabel("Number 1:"));
  add(num1Field);
  add(new JLabel("Number 2:"));
  add(num2Field);
  add(calculateButton);
  add(resultLabel);

  setSize(300, 200);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setVisible(true);
  }

  public static void main(String[] args) {
  new SumAndDifferenceCalculator();
  }
}
