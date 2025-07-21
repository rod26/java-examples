import javax.swing.JOptionPane;

public class JOptionEx1 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "What is your name?");
        JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
    }
}