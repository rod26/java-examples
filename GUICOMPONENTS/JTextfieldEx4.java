import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class JTextfieldEx4 extends JFrame {
    private JPasswordField passwordField;

    public JTextfieldEx4() {
        setTitle("Password Input Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel for input field
        JPanel inputPanel = new JPanel();

        passwordField = new JPasswordField(20);
        inputPanel.add(passwordField);

        // Add input panel to frame
        add(inputPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        JTextfieldEx4 frame = new JTextfieldEx4();
    }
}
