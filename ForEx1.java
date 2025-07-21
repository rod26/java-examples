import java.util.Scanner;

public class ForEx1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number to display its multiplication table: ");
    int num = input.nextInt();

    for (int i = 1; i <= 10; i++) {
      int product = num * i;
      System.out.println(num + " x " + i + " = " + product);
    }
  }
}