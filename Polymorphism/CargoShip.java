public class CargoShip extends Ship {
    private int cargoCapacity;
    
    // Constructor
    public CargoShip(String name, String yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }
    
    // Getters
    public int getCargoCapacity() {
        return cargoCapacity;
    }
    
    // Setters
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
    
    // Override print
    @Override
    public void print() {
        System.out.println("Ship Name: " + name);
        System.out.println("Cargo Capacity: " + cargoCapacity + " tons");
    }
}