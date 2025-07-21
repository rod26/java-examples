public class Constructor5 {
  String name;
  int age;
  String department;
  double salary;

  public Constructor5(String name, int age, String department, double salary) {
    this.name = name;
    this.age = age;
    this.department = department;
    this.salary = salary;
  }

  public void printDetails() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Department: " + department);
    System.out.println("Salary: " + salary);
  }

  public static void main(String[] args) {
    Constructor5 employee1 = new Constructor5("Alice", 25, "Sales", 50000.0);
    Constructor5 employee2 = new Constructor5("Bob", 30, "Marketing", 60000.0);

    employee1.printDetails();
    employee2.printDetails();
  }
}