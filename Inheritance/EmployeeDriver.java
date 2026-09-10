public class EmployeeDriver {
    public static void main(String[] args) {
        // Salaried Employee
        SalariedEmployee emp1 = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        
        // Hourly Employees
        HourlyEmployee emp2 = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee emp3 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        
        // Commission Employees
        CommissionEmployee emp4 = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000);
        CommissionEmployee emp5 = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000);
        
        // Base Employees
        BaseEmployee emp6 = new BaseEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        BaseEmployee emp7 = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        
        // Print all employees
        emp1.print();
        emp2.print();
        emp3.print();
        emp4.print();
        emp5.print();
        emp6.print();
        emp7.print();
    }
}