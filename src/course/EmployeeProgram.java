package course;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();


        System.out.print("Enter the number of Employees");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee  #" + i + " data:");
            System.out.print("Outsourced (y/n) ?");
            char c = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hour = sc.nextInt();
            System.out.print("value per Hour?");
            double payPerHour = sc.nextDouble();
            if (c == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(name, hour, payPerHour, additionalCharge);
                list.add(emp);
            } else {
                Employee emp = new Employee(name, hour, payPerHour);
                list.add(emp);
            }
        }
        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee emp : list) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }
        sc.close();
    }
}
