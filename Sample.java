import java.util.Scanner;
public class Sample {



 static void checkAge(int age) {
  if (age < 18) {
    System.out.println("Access denied - You are not old enough!"); 
  
  } else {
    System.out.println("Access granted - You are old enough!"); 
  }
  
} 

public static void main(String[] args) { 
  for (int i = 0; i <= 10; i = i + 5) {
    System.out.println(i);
  }  
   } 
}
