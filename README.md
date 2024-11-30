# Employee Management System

## Description

The Employee Management System is a Java-based console application designed to manage employee records. It supports CRUD operations (Create, Read, Update, Delete) on employee data stored in a PostgreSQL database. Users can add new employees, view details of an employee by their ID, list all employees, update employee details, and delete employee records. 

The application is built using JDBC for database connectivity and ensures a structured and user-friendly experience.

---

## Features

1. **Add Employee**: Create a new employee record with name, position, salary, and hire date.
2. **View Employee by ID**: Retrieve and display employee details using their unique ID.
3. **View All Employees**: List all employee records.
4. **Update Employee**: Modify employee details, including name, position, salary, and hire date.
5. **Delete Employee**: Remove an employee record by their ID.
6. **Exit**: Safely terminate the application.

---

## Prerequisites

1. **Java Development Kit (JDK)**: Ensure JDK 8 or higher is installed.
2. **PostgreSQL Database**:
   - Install PostgreSQL.
   - Create a database named `employee_db`.
   - Create a table named `employee` using the following schema:
     ```sql
     CREATE TABLE employee (
         id SERIAL PRIMARY KEY,
         name VARCHAR(255) NOT NULL,
         position VARCHAR(255) NOT NULL,
         salary NUMERIC(10, 2) NOT NULL,
         hire_date DATE NOT NULL
     );
     ```
3. **Java IDE or Compiler**: Use an IDE like IntelliJ IDEA, Eclipse, or a terminal-based Java compiler.
4. **PostgreSQL JDBC Driver**: Ensure the JDBC driver is available in your project dependencies.

---

## Setup and Running the Application

1. **Clone the Repository**:
```
https://github.com/lleylawa/Employee-Database-Management.git
```

3. **Database Configuration**:
   - Update the `URL`, `USER`, and `PASSWORD` fields in `EmployeeData.java` to match your PostgreSQL database credentials.

4. **Compile and Run**:
   - Open the project in your preferred IDE.
   - Run the Main class to start the application.
   - Follow the on-screen menu to perform operations on the employee database.

---

## Screenshots

### Add Employee
![image](https://github.com/user-attachments/assets/cb6d8007-9072-4a2a-b0ac-8901c0bd4c3e)

### View Employee by ID
![image](https://github.com/user-attachments/assets/b1a8fb77-37b6-4273-ba33-52cf3f118f6f)

### Viewing all Employers
![image](https://github.com/user-attachments/assets/9a24e437-2f67-490d-b0aa-410946cbc71d)

### Updating an Employee
![image](https://github.com/user-attachments/assets/b9d91cef-eb08-4ed3-bbd0-2b47f9edf990)

### Deleting an Employee
![image](https://github.com/user-attachments/assets/5ee97ae4-9fa6-4b41-9f45-d5befabf29a8)

### Result
![image](https://github.com/user-attachments/assets/0d769892-3c86-439a-8315-2b3f7bbb92a7)

---
