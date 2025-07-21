import java.util.Scanner;

public class SwitchEx1 {
    public static void main(String[] args) {
        Scanner nacpil = new Scanner(System.in);
        
        System.out.println("Enter a number between 1 and 5:");
        int num = nacpil.nextInt();
        
        switch(num) {
            case 1:
                System.out.println("You entered one.");
                break;
            case 2:
                System.out.println("You entered two.");
                break;
            case 3:
                System.out.println("You entered three.");
                break;
            case 4:
                System.out.println("You entered four.");
                break;
            case 5:
                System.out.println("You entered five.");
                break;
            
        }
        
        scanner.close();
    }
}