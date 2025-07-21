import java.util.Scanner;

class Mj {

  public static void main(String[] args) {

    Scanner bsit2c =new Scanner(System.in);

    Joan ondis = new Joan();    
    
    System.out.println("Ang nick name niya ay "+ondis.nickName+" at ang edad niya ay "+ondis.age);
    System.out.println("Pakipasok ang unang numero: ");
    int numero1=bsit2c.nextInt();

     System.out.println("Pakipasok ang pangalawang numero: ");
    int numero2=bsit2c.nextInt();


    ondis.getSum(numero1,numero2);

  }


}