import javax.swing.*;
public class JFrameEx1 extends JFrame {
  public JFrameEx1() {
    setTitle("My Frame");
    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public static void main(String[] args) {
    JFrameEx1 frame = new JFrameEx1();
  }
}
