package com.louiseeo;

import java.util.List;
import java.util.Scanner;

import com.louiseeo.model.Employee;
import com.louiseeo.model.SalariedEmployee;
import com.louiseeo.model.HourlyEmployee;
import com.louiseeo.service.FileHandler;

/**
 * This program is a menu program that adds, views, and saves employee records.
 * It supports employee type either Salaried or Hourly, calculates earnings, and
 * uses JSON to persist files.
 * 
 * @author louiseeo
 */
public class PayrollSystem {
    static Scanner sc = new Scanner(System.in);
    private static FileHandler fh = new FileHandler();
    static List<Employee> employees = fh.getEmployee();

    public static void main(String[] args) {

        int choice = 0;
        while (true) {
            System.out.println("""
                    Welcome to Payroll System!
                    [1] Add Employee
                    [2] View All Employees
                    [3] Save Records
                    [4] Exit
                    """);
            System.out.print("Choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Enter a number from 1 to 4.\n");
                sc.nextLine();
                continue;
            }

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewEmployees();
                    break;
                case 3:
                    fh.saveToFile();
                    break;
                case 4:
                    fh.saveToFile(); // save file if user forgot to save
                    System.out.println("Thank you for using the Payroll System!");
                    System.out.println("Now exiting program....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input! Enter number from 1 to 4.\n");
                    break;
            }

        }
    }

    /**
     * Prompts the user to add a new employee.
     * User will select type(SALARIED or HOURLY) and provides
     * needed details. The new employee is added to the employee list.
     */
    public static void addEmployee() {
        while (true) {
            int typeChoice = 0;
            System.out.println("""
                    Choose Employee Type:
                    [1] Salaried
                    [2] Hourly
                    """);
            System.out.print("Choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Enter 1 or 2 only\n");
                sc.nextLine();
                continue;
            }

            typeChoice = sc.nextInt();
            sc.nextLine();

            if (typeChoice == 1) {
                System.out.print("Enter Employee Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Employee ID: ");
                String id = sc.nextLine();

                System.out.print("Enter Base Salary: ");
                double base = sc.nextDouble();

                System.out.print("Enter Salary Bonus: ");
                double bonus = sc.nextDouble();
                sc.nextLine();

                SalariedEmployee emp = new SalariedEmployee(name, id, base, bonus);
                employees.add(emp);

                System.out.println("\nEmployee successfully added!\n");
                break;

            } else if (typeChoice == 2) {
                System.out.print("Enter Employee Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Employee ID: ");
                String id = sc.nextLine();

                System.out.print("Enter Hours Worked: ");
                int hours = sc.nextInt();

                System.out.print("Enter Hourly Rate: ");
                double rate = sc.nextDouble();
                sc.nextLine();

                HourlyEmployee emp = new HourlyEmployee(name, id, hours, rate);
                employees.add(emp);

                System.out.println("\nEmployee successfully added!\n");
                break;

            } else {
                System.out.println("Invalid input! Enter 1 or 2 only\n");
                continue;
            }
        }
    }

    /**
     * Displays all the employees saved with their details,
     * and calculated earnings. Informs user if no employees exist.
     */
    public static void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found!\n");
            return;
        }

        System.out.println("----------- EMPLOYEE RECORDS ------------\n");

        for (Employee emp : employees) {
            System.out.print(emp.toString());
            System.out.printf("Earnings: Php %.2f\n\n", emp.calculateEarnings());

        }

        System.out.println("-----------------------------------------");
    }
}