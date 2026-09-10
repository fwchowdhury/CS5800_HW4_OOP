public class CommissionEmployee extends Employee {
    private double commissionRate;
    private double grossSales;
    
    // Constructor
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSales) {
        super(firstName, lastName, socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }
    
    // Getters
    public double getCommissionRate() {
        return commissionRate;
    }
    
    public double getGrossSales() {
        return grossSales;
    }
    
    // Setters
    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
    
    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }
    
    // Override print
    @Override
    public void print() {
        super.print();
        System.out.println("Commission Rate: " + (commissionRate * 100) + "%");
        System.out.println("Gross Sales: $" + grossSales);
        System.out.println();
    }
}