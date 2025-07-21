import java.util.Scanner;

class Second {

  public static void main(String[] args) {

    Scanner mark= new Scanner(System.in);
    Elsisura bsit2a = new Elsisura();

    System.out.println("Ibigay ang unang numero");
    int numeroUno=mark.nextInt();

    System.out.println("Ibigay ang pangalawang numero");
    int numeroDos=mark.nextInt();

    bsit2a.kuninAngSum(numeroUno,numeroDos);


  }
}