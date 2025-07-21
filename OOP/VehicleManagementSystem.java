// Main class to test the program
public class VehicleManagementSystem {
    public static void main(String[] args) {
        // Creating instances of Car and Motorcycle
        Vehicle car = new Car("Toyota", 120, 4);
        Vehicle motorcycle = new Motorcycle("Harley Davidson", 100, true);

        // Calling methods
        car.start();
        car.stop();

        motorcycle.start();
        motorcycle.stop();
    }
}