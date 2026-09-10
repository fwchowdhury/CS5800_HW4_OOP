public class VendorInvoice implements Payable {
    private String vendorName;
    private String invoiceNumber;
    private double amountDue;
    
    // Constructor
    public VendorInvoice(String vendorName, String invoiceNumber, double amountDue) {
        this.vendorName = vendorName;
        this.invoiceNumber = invoiceNumber;
        setAmountDue(amountDue);
    }
    
    // Getters
    public String getVendorName() {
        return vendorName;
    }
    
    public String getInvoiceNumber() {
        return invoiceNumber;
    }
    
    public double getAmountDue() {
        return amountDue;
    }
    
    // Setters with validation
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
    
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }
    
    public void setAmountDue(double amountDue) {
        if (amountDue < 0) {
            this.amountDue = 0;
        } else {
            this.amountDue = amountDue;
        }
    }
    
    @Override
    public double calculatePayment() {
        return amountDue;
    }
    
    @Override
    public String getPayeeName() {
        return vendorName;
    }
    
    // Print function
    public void print() {
        System.out.println("Vendor: " + vendorName);
        System.out.println("Invoice #: " + invoiceNumber);
        System.out.println("Amount Due: $" + String.format("%.2f", calculatePayment()));
    }
}