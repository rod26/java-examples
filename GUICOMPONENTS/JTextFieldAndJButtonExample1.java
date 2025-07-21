import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldAndJButtonExample1 extends JFrame {
    private JPanel panel;
    private JTextField textField;
    private JButton button;

    public JTextFieldAndJButtonExample1() {
        setTitle("JTextField and JButton Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel for text field and button
        panel = new JPanel();

        // Create text field and button
        textField = new JTextField(20);
        button = new JButton("Click Me");

        // Add action listener to button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                System.out.println("You typed: " + text);
            }
        });

        // Add text field and button to panel
        panel.add(textField);
        panel.add(button);

        // Add panel to frame
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        JTextFieldAndJButtonExample1 frame = new JTextFieldAndJButtonExample1();
    }
}