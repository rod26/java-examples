public class Constructor2 {
  String make;
  String model;
  int year;

  public Constructor2(String a, String b, int c) {
    this.make = a;
    this.model = b;
    this.year = c;
  }

  public void printDetails() {
    System.out.println("Make: " + make);
    System.out.println("Model: " + model);
    System.out.println("Year: " + year);
  }

  public static void main(String[] args) {
    Constructor2  myCar = new Constructor2("Toyota", "Corolla", 2021);
    myCar.printDetails();
  }
}