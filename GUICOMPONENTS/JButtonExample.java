import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonExample {
    public static void main(String[] args) {
        // Create a new JFrame with a title
        JFrame frame = new JFrame("JButton Example");
         
        // Create two JButtons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        // Add an ActionListener to each button
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Pinindot si button 1!");
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Pinindot si button 2!");
            }
        });

        // Create a new FlowLayout object and set it as the JFrame's layout manager
        FlowLayout layout = new FlowLayout();
        frame.setLayout(layout);

        // Add the buttons to the JFrame
        frame.add(button1);
        frame.add(button2);

        // Set the size of the window
        frame.setSize(300, 200);

        // Set the JFrame to exit on close and make it visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}