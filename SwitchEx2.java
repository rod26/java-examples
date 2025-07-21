import java.util.Scanner;

public class SwitchEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] array = {1, 2, 3, 4, 5};
        
        while (true) {
            System.out.println("1. Print array");
            System.out.println("2. Sum elements");
            System.out.println("3. Find max");
            System.out.println("4. Quit");
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            
            switch(choice) {
                case 1:
                    System.out.println("Array:");
                    for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    int sum = 0;
                    for (int i = 0; i < array.length; i++) {
                        //sum += array[i];
                        sum =sum+ array[i];
                    }
                    System.out.println("Sum: " + sum);
                    break;
                case 3:
                    int max = 0;
                    
                    //LAMAN NG ARRAY (1,2,3,4,5)
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] > max) {
                            max = array[i];
                        }
                    }
                    System.out.println("Max: " + max);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}



