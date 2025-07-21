// Derived class (Child)
class Car extends Vehicle {
    private int doors;

    // Constructor
    public Car(String brand, int speed, int doors) {
        super(brand, speed); // Calls the constructor of the parent class
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    // Method overriding (Polymorphism)
    @Override
    public void stop() {
        System.out.println(getBrand() + " (car) with " + doors + " doors is stopping.");
    }
}