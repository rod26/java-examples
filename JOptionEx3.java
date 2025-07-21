import javax.swing.JOptionPane;

public class JOptionEx3 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        String ageStr = JOptionPane.showInputDialog("What is your age?");
        
        int age = Integer.parseInt(ageStr);
        int ageIn5Years = age + 5;
        
        JOptionPane.showMessageDialog(null, "Hello " + name + ", you will be " + ageIn5Years + " in 5 years!");
    }
}