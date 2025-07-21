import javax.swing.JOptionPane;

public class JOptionEx2 {
    public static void main(String[] args) {
        String num1Str = JOptionPane.showInputDialog(null, "Enter the first number:");
        String num2Str = JOptionPane.showInputDialog(null, "Enter the second number:");
        
        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);
        
        double sum = num1 + num2;
        
        JOptionPane.showMessageDialog(null, "The sum is " + sum);
    }
}