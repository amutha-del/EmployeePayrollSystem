
package payrollmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class PayrollApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== EMPLOYEE PAYROLL SYSTEM =====");
            System.out.println("1. Add Full-Time Employee");
            System.out.println("2. Add Part-Time Employee");
            System.out.println("3. View All Employees");
            System.out.println("4. Search Employee");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Monthly Salary: ");
                    double salary = sc.nextDouble();

                    employees.add(new FullTimeEmployee(id, name, salary));
                    System.out.println("Full-Time Employee Added!");
                    break;

                case 2:
                    System.out.print("Enter Employee ID: ");
                    int pid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String pname = sc.nextLine();

                    System.out.print("Enter Hours Worked: ");
                    int hours = sc.nextInt();

                    System.out.print("Enter Hourly Rate: ");
                    double rate = sc.nextDouble();

                    employees.add(new PartTimeEmployee(pid, pname, hours, rate));
                    System.out.println("Part-Time Employee Added!");
                    break;

                case 3:
                    if (employees.isEmpty()) {
                        System.out.println("No Employees Found!");
                    } else {
                        for (Employee e : employees) {
                            e.displayDetails();
                            System.out.println("----------------------");
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Employee e : employees) {
                        if (e.getEmployeeId() == searchId) {
                            e.displayDetails();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found!");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using Payroll System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}

