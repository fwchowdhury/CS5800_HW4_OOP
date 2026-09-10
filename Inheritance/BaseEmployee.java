public class BaseEmployee extends Employee {
    private double baseSalary;
    
    // Constructor
    public BaseEmployee(String firstName, String lastName, String socialSecurityNumber, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.baseSalary = baseSalary;
    }
    
    // Getters
    public double getBaseSalary() {
        return baseSalary;
    }
    
    // Setters
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    // Override print
    @Override
    public void print() {
        super.print();
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println();
    }
}