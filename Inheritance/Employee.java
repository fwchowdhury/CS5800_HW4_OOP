public class Employee {
    protected String firstName;
    protected String lastName;
    protected String socialSecurityNumber;
    
    // Constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    // Getters
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    
    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    // Print
    public void print() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("SSN: " + socialSecurityNumber);
    }
}