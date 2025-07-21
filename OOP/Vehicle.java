// Base class (Parent)
class Vehicle {
    private String brand;
    private int speed;

    // Constructor
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Encapsulation: Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Polymorphism: A common method for all vehicles
    public void start() {
        System.out.println(brand + " is starting with speed " + speed + " km/h");
    }

    // Overridden by subclasses
    public void stop() {
        System.out.println(brand + " is stopping.");
    }
}