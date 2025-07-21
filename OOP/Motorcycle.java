// Another Derived class (Child)
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    // Constructor
    public Motorcycle(String brand, int speed, boolean hasSidecar) {
        super(brand, speed); // Calls the constructor of the parent class
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    // Method overriding (Polymorphism)
    @Override
    public void stop() {
        System.out.println(getBrand() + " (motorcycle) with a sidecar: " + hasSidecar + " is stopping.");
    }
}