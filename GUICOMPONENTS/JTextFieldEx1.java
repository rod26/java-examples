import javax.swing.*;

public class JTextFieldEx1 extends JFrame {
  
  public JTextFieldEx1() {
    setTitle("My Frame");
    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JTextField textField = new JTextField("Type something here", 20);
    add(textField);
    pack();

    setVisible(true);
  }

  public static void main(String[] args) {
    JTextFieldEx1 frame = new JTextFieldEx1();
  }
}
