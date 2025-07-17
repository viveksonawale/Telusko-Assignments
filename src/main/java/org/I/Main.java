package org.I;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Employee Name: ");
        String empName = scanner.nextLine();
        System.out.println("Enter House Worked: ");
        double hoursWorked = scanner.nextDouble();
        System.out.println("Enter the Hourly Rate: ");
        double hourlyRate = scanner.nextInt();

        double regularHours = 40;
        double overtimeRate = 1.5;
        double totalPay;
        if (hoursWorked <= regularHours) {
            totalPay = hoursWorked * hourlyRate;
        } else {
            double overtimeHours = hoursWorked - regularHours;
            totalPay = (regularHours * hourlyRate) + (overtimeHours * hourlyRate * overtimeRate);
        }

        // Output
        System.out.println("\nPayroll Summary:");
        System.out.println("Employee Name: " + empName);
        System.out.println("Total Hours Worked: " + hoursWorked);
        System.out.println("Total Pay: ₹" + totalPay);
    }
}
