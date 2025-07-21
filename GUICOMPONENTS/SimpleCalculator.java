import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {
    private JPanel panel;
    private JTextField display;
    private JButton[] buttons;
    private String[] buttonLabels = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};
    private String operand1 = "";
    private String operator = "";
    private String operand2 = "";
    private boolean hasDecimal = false;

    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create display text field
        display = new JTextField();
        display.setEditable(false);

        // Create panel for buttons
        panel = new JPanel(new GridLayout(4, 4));
        buttons = new JButton[buttonLabels.length];

        // Add action listener to buttons
        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String label = ((JButton) e.getSource()).getText();
                    if (label.matches("[0-9.]")) {
                        if (operator.isEmpty()) {
                            operand1 += label;
                            display.setText(operand1);
                        } else {
                            operand2 += label;
                            display.setText(operand2);
                        }
                        if (label.equals(".")) {
                            hasDecimal = true;
                        }
                    } else if (label.matches("[/*\\-+\\=]")) {
                        if (label.equals("=")) {
                            if (!operand2.isEmpty()) {
                                double result = calculate();
                                operand1 = String.valueOf(result);
                                operator = "";
                                operand2 = "";
                                display.setText(String.valueOf(result));
                            }
                        } else {
                            operator = label;
                            hasDecimal = false;
                        }
                    }
                }
            });
            panel.add(buttons[i]);
        }

        // Add display text field and panel to frame
        add(display, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    private double calculate() {
        double num1 = Double.parseDouble(operand1);
        double num2 = Double.parseDouble(operand2);
        double result = 0.0;
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
        return result;
    }

    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
    }
}