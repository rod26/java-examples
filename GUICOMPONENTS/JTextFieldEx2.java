import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JTextFieldEx2 extends JFrame {
    private JTextField textField;

    public JTextFieldEx2() {
        setTitle("Text Input Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel for input field
        JPanel inputPanel = new JPanel();

        textField = new JTextField(20);
        inputPanel.add(textField);

        // Add input panel to frame
        add(inputPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        JTextFieldEx2 frame = new JTextFieldEx2();
    }
}
