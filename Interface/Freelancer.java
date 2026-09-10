public class Freelancer implements Payable {
    private String firstName;
    private String lastName;
    private double hourlyRate;
    private double hoursWorked;
    
    // Constructor
    public Freelancer(String firstName, String lastName, double hourlyRate, double hoursWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        setHourlyRate(hourlyRate);
        setHoursWorked(hoursWorked);
    }
    
    // Getters
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public double getHourlyRate() {
        return hourlyRate;
    }
    
    public double getHoursWorked() {
        return hoursWorked;
    }
    
    // Setters with validation
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) {
            this.hourlyRate = 0;
        } else {
            this.hourlyRate = hourlyRate;
        }
    }
    
    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked < 0) {
            this.hoursWorked = 0;
        } else {
            this.hoursWorked = hoursWorked;
        }
    }
    
    // Calculate payment with overtime
    @Override
    public double calculatePayment() {
        if (hoursWorked <= 40) {
            return hourlyRate * hoursWorked;
        } else {
            double regularPay = hourlyRate * 40;
            double overtimePay = hourlyRate * 1.5 * (hoursWorked - 40);
            return regularPay + overtimePay;
        }
    }
    
    @Override
    public String getPayeeName() {
        return firstName + " " + lastName;
    }
    
    // Print function
    public void print() {
        System.out.println("Freelancer: " + getPayeeName());
        System.out.println("Payment: $" + String.format("%.2f", calculatePayment()));
    }
}