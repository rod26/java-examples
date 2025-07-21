import java.util.Scanner;

public class ForEx2 {
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of integers to sum: ");
      int count = input.nextInt();
      int sum = 0;
      
      for (int i = 1; i <= count; i++) {
         System.out.print("Enter integer " + i + ": ");
         int num = input.nextInt();
         sum += num;
      }
      
      System.out.println("The sum of the " + count + " integers is: " + sum);
      input.close();
   }
}