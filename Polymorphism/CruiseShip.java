public class CruiseShip extends Ship {
    private int maxPassengers;
    
    // Constructor
    public CruiseShip(String name, String yearBuilt, int maxPassengers) {
        super(name, yearBuilt);
        this.maxPassengers = maxPassengers;
    }
    
    // Getters
    public int getMaxPassengers() {
        return maxPassengers;
    }
    
    // Setters
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
    
    // Override print
    @Override
    public void print() {
        System.out.println("Ship Name: " + name);
        System.out.println("Max Passengers: " + maxPassengers);
    }
}