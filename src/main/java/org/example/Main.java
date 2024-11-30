package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeData data = new EmployeeData();
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("\nEmployee Management System");
                System.out.println("1. Add Employee");
                System.out.println("2. View Employee by ID");
                System.out.println("3. View All Employees");
                System.out.println("4. Update Employee");
                System.out.println("5. Delete Employee");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        addEmployee(data, scanner);
                        break;
                    case 2:
                        System.out.print("Enter Employee ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        viewEmployeeById(data, id);
                        break;
                    case 3:
                        viewAllEmployees(data);
                        break;
                    case 4:
                        updateEmployee(data, scanner);
                        break;
                    case 5:
                        System.out.print("Enter Employee ID to delete: ");
                        int deleteId = scanner.nextInt();
                        scanner.nextLine();
                        deleteEmployee(data, deleteId);
                        break;
                    case 6:
                        System.out.println("Exiting Employee Management System. Goodbye!");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addEmployee(EmployeeData data, Scanner scanner) throws ParseException {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee position: ");
        String position = scanner.nextLine();

        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter hire date (YYYY-MM-DD): ");
        String hireDateStr = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date hireDate = sdf.parse(hireDateStr);

        Employee employee = new Employee(name, position, salary, hireDate);
        data.createEmployee(employee);
        System.out.println("Employee added successfully!");
    }

    private static void viewEmployeeById(EmployeeData data, int id) {
        Employee employee = data.getEmployeeById(id);
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    private static void viewAllEmployees(EmployeeData data) {
        System.out.println("All Employees:");
        data.getAllEmployees().forEach(System.out::println);
    }

    private static void updateEmployee(EmployeeData data, Scanner scanner) throws ParseException {
        System.out.print("Enter the Employee ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Employee employee = data.getEmployeeById(id);
        if (employee != null) {
            System.out.print("Enter new name (leave blank to keep current): ");
            String name = scanner.nextLine();
            if (!name.isBlank()) {
                employee.setName(name);
            }

            System.out.print("Enter new position (leave blank to keep current): ");
            String position = scanner.nextLine();
            if (!position.isBlank()) {
                employee.setPosition(position);
            }

            System.out.print("Enter new salary (leave blank to keep current): ");
            String salaryInput = scanner.nextLine();
            if (!salaryInput.isBlank()) {
                double salary = Double.parseDouble(salaryInput);
                employee.setSalary(salary);
            }

            System.out.print("Enter new hire date (YYYY-MM-DD, leave blank to keep current): ");
            String hireDateStr = scanner.nextLine();
            if (!hireDateStr.isBlank()) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                java.util.Date hireDate = sdf.parse(hireDateStr);
                employee.setHireDate(hireDate);
            }

            data.updateEmployee(employee);
            System.out.println("Employee updated successfully!");
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    private static void deleteEmployee(EmployeeData data, int id) {
        data.deleteEmployee(id);
        System.out.println("Employee with ID " + id + " deleted successfully!");
    }
}
