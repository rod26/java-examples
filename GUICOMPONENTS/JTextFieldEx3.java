import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JTextFieldEx3 extends JFrame {
    private JTextField textField;
    private JTextField textField2;

    public JTextFieldEx3() {
        setTitle("Text Input Example");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel for input field
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        Font font = new Font("Arial", Font.BOLD, 34);

        textField = new JTextField(20);
        textField.setForeground(Color.GRAY);
        textField.setText("Enter text here");
        textField.setFont(font);



        textField2 = new JTextField(20);
        textField2.setForeground(Color.GRAY);
        textField2.setText("Enter text here");


        textField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals("Enter text here")) {
                    textField.setText("");
                    textField.setForeground(Color.RED);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setForeground(Color.YELLOW);
                    textField.setText("Enter text here");
                }
            }
        });

        inputPanel.add(textField);
        inputPanel.add(textField2);

        // Add input panel to frame
        add(inputPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        JTextFieldEx3 frame = new JTextFieldEx3();
    }
}
