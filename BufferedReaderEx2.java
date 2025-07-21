
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class BufferedReaderEx2
{ 

    public static void main(String[] psau){
		

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       
        try {
            System.out.println("Please enter the 1st number:");
            int number1 = Integer.parseInt(reader.readLine());

            System.out.println("Please enter the 2nd number:");
            int number2 = Integer.parseInt(reader.readLine());


            System.out.println("Ang kabuuan ay: " + (number1+number2));
        } catch (NumberFormatException | IOException e) {
            System.out.println("May mali sa program");
        }



  }
}


