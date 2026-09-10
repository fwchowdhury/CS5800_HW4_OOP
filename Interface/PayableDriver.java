import java.util.ArrayList;

public class PayableDriver {
    public static void main(String[] args) {
        ArrayList<Payable> payables = new ArrayList<>();
        
        // Add freelancers
        Freelancer freelancer1 = new Freelancer("Alex", "Johnson", 50, 45);
        Freelancer freelancer2 = new Freelancer("Sarah", "Williams", 35, 38);
        
        // Add vendor invoices
        VendorInvoice vendor1 = new VendorInvoice("Office Supplies Co", "INV-001", 1500);
        VendorInvoice vendor2 = new VendorInvoice("Tech Services Ltd", "INV-002", 2750);
        
        // Add to list
        payables.add(freelancer1);
        payables.add(freelancer2);
        payables.add(vendor1);
        payables.add(vendor2);
        
        // Process payments
        double totalPayout = 0;
        
        for (Payable p : payables) {
            if (p instanceof Freelancer) {
                ((Freelancer) p).print();
            } else if (p instanceof VendorInvoice) {
                ((VendorInvoice) p).print();
            }
            totalPayout += p.calculatePayment();
            System.out.println();
        }
        
        System.out.println("Total Payout for Period: $" + String.format("%.2f", totalPayout));
    }
}