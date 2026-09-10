public class SalariedEmployee extends Employee {
    private double weeklySalary;
    
    // Constructor
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }
    
    // Getters
    public double getWeeklySalary() {
        return weeklySalary;
    }
    
    // Setters
    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    
    // Override print
    @Override
    public void print() {
        super.print();
        System.out.println("Weekly Salary: $" + weeklySalary);
        System.out.println();
    }
}