
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class BufferedReaderEx3
{ 

    public static void main(String[] psau){
		
 		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        try {
            System.out.print("Enter a number (or 'exit' to quit): ");
            String line;
            while ((line = reader.readLine()) != null && !line.equals("exit")) {
                int number = Integer.parseInt(line);
                //sum += number;
                sum = sum+number;

                System.out.print("Enter another number (or 'exit' to quit): ");
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        
        System.out.println("The sum is: " + sum);



  }
}


