package org.example;

import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        EmployeeData data = new EmployeeData();

        try {
            // Create an employee
            Employee emp1 = new Employee("Aidana Kokumova", "Developer", 70000, new SimpleDateFormat("yyyy-MM-dd").parse("2022-01-15"));
            data.createEmployee(emp1);

            // Read by ID
            Employee fetchedEmp = data.getEmployeeById(1);
            System.out.println("Fetched Employee: " + fetchedEmp);

            // Read all employees
            System.out.println("All Employees:");
            data.getAllEmployees().forEach(System.out::println);

            // Update employee
            fetchedEmp.setPosition("Senior Developer");
            fetchedEmp.setSalary(80000);
            data.updateEmployee(fetchedEmp);
            System.out.println("Updated Employee: " + data.getEmployeeById(1));

            // Delete employee
            data.deleteEmployee(1);
            System.out.println("All Employees After Deletion:");
            data.getAllEmployees().forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
