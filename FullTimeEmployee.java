
package payrollmanagement;

public class FullTimeEmployee extends Employee {

    private double monthlySalary;

    public FullTimeEmployee(int id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Employee Type: Full Time");
        System.out.println("Monthly Salary: " + calculateSalary());
    }
}

