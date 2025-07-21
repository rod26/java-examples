public class Constructor3 {
  String name;
  int age;

  public Constructor3(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void sayHello() {
    System.out.println("Hello, my name is " 
      + name + " and I am " + age + " years old.");
  }

  public static void main(String[] args) {
    Constructor3 person1 = new Constructor3("Alice", 25);
    Constructor3 person2 = new Constructor3("Bob", 30);

    person1.sayHello();
    person2.sayHello();
  }
}