public class HourlyEmployee extends Employee {
    private double wage;
    private double hoursWorked;
    
    // Constructor
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }
    
    // Getters
    public double getWage() {
        return wage;
    }
    
    public double getHoursWorked() {
        return hoursWorked;
    }
    
    // Setters
    public void setWage(double wage) {
        this.wage = wage;
    }
    
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    // Override print
    @Override
    public void print() {
        super.print();
        System.out.println("Wage: $" + wage + "/hour");
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println();
    }
}