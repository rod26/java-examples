import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonClear, buttonEqual;
    private double num1 = 0, num2 = 0, result = 0;
    private String operator = "";

    public Calculator() {
        setTitle("Calculator");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 3));

        for (int i = 0; i < 9; i++) {
            JButton button = new JButton(String.valueOf(i + 1));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        buttonClear = new JButton("C");
        buttonClear.addActionListener(this);
        buttonPanel.add(buttonClear);

        buttonAdd = new JButton("+");
        buttonAdd.addActionListener(this);
        buttonPanel.add(buttonAdd);

        buttonSubtract = new JButton("-");
        buttonSubtract.addActionListener(this);
        buttonPanel.add(buttonSubtract);

        buttonMultiply = new JButton("*");
        buttonMultiply.addActionListener(this);
        buttonPanel.add(buttonMultiply);

        JButton button0 = new JButton("0");
        button0.addActionListener(this);
        buttonPanel.add(button0);

        buttonEqual = new JButton("=");
        buttonEqual.addActionListener(this);
        buttonPanel.add(buttonEqual);

        buttonDivide = new JButton("/");
        buttonDivide.addActionListener(this);
        buttonPanel.add(buttonDivide);

        add(buttonPanel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        String buttonValue = e.getActionCommand();
        switch (buttonValue) {
            case "C":
                textField.setText("");
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                operator = buttonValue;
                num1 = Double.parseDouble(textField.getText());
                textField.setText("");
                break;
            case "=":
                num2 = Double.parseDouble(textField.getText());
                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num1 / num2;
                        break;
                }
                textField.setText(String.valueOf(result));
                break;
            default:
                textField.setText(textField.getText() + buttonValue);
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setVisible(true);
    }
}