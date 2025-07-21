import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StringToIntConverter extends JFrame {
    private JPanel panel;
    private JTextField textField;
    private JButton button;
    private JLabel label;

    public StringToIntConverter() {
        setTitle("String to Int Converter");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel for text field, button, and label
        panel = new JPanel();

        // Create text field and button
        textField = new JTextField(20);
        button = new JButton("Convert");

        // Create label for displaying result
        label = new JLabel("Enter a number and click Convert");

        // Add action listener to button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                try {
                    int result = Integer.parseInt(input);
                    label.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    label.setText("Invalid input: " + input);
                }
            }
        });

        // Add text field, button, and label to panel
        panel.add(textField);
        panel.add(button);
        panel.add(label);

        // Add panel to frame
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        StringToIntConverter frame = new StringToIntConverter();
    }
}