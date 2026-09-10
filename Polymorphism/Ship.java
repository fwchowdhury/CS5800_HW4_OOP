public class Ship {
    protected String name;
    protected String yearBuilt;
    
    // Constructor
    public Ship(String name, String yearBuilt) {
        this.name = name;
        this.yearBuilt = yearBuilt;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public String getYearBuilt() {
        return yearBuilt;
    }
    
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }
    
    // Print
    public void print() {
        System.out.println("Ship Name: " + name);
        System.out.println("Year Built: " + yearBuilt);
    }
}