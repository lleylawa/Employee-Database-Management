# **Employee Database Management**

This project is a simple **Java application** that interacts with a **relational database** to manage employee data. Using **JDBC (Java Database Connectivity)**, the application performs **CRUD (Create, Read, Update, Delete)** operations on an `employee` table in the database. The system is designed to demonstrate the following concepts:
- Object-relational mapping using the `Employee` class.
- Modular and reusable database access using the `EmployeeData` class.
- Safe database interactions using prepared statements.

### **Features**
1. Add new employees to the database.
2. Retrieve employee details by their ID.
3. View all employees.
4. Update an employee’s details.
5. Delete employees by their ID.

---

## **Instructions to Run the Program**

### **1. Database Setup**
1. **Install PostgreSQL**:
   Ensure PostgreSQL is installed on your system and the server is running.
   
2. **Create Database**:
   Open a PostgreSQL client (like `psql` or pgAdmin) and run:
   ```sql
   CREATE DATABASE employee_db;
   ```

3. **Create Table**:
   Switch to the `employee_db` database:
   ```sql
   \c employee_db
   ```
   Then create the `employee` table using:
   ```sql
   CREATE TABLE employee (
       id SERIAL PRIMARY KEY,
       name VARCHAR(255) NOT NULL,
       position VARCHAR(255) NOT NULL,
       salary DOUBLE PRECISION NOT NULL,
       hire_date DATE NOT NULL
   );
   ```

4. **Insert Sample Data (Optional)**:
   Populate the table with sample data:
   ```sql
   INSERT INTO employee (name, position, salary, hire_date)
   VALUES 
    ('Meerim Sarbalieva', 'Software Engineer', 75000.00, '2022-05-15'),
    ('Mukhammed Bekten uly', 'Product Manager', 95000.00, '2021-11-20'),
    ('Kamila Zhooshbaeva', 'Data Analyst', 65000.00, '2023-02-10')
   ```

---

### **2. Java Setup**
1. **Install Java**:
   Ensure that Java JDK 8 or later is installed on your system.

2. **Add JDBC Dependency**:
   If using Maven, add the PostgreSQL JDBC driver dependency to your `pom.xml`:
   ```xml
   <dependency>
       <groupId>org.postgresql</groupId>
       <artifactId>postgresql</artifactId>
       <version>42.6.0</version> <!-- Use the latest version -->
   </dependency>
   ```

3. **Configure Database Credentials**:
   Update the `EmployeeData` class with your PostgreSQL credentials:
   ```java
   private static final String URL = "jdbc:postgresql://localhost:5432/employee_db";
   private static final String USER = "postgres";
   private static final String PASSWORD = "leyla@2006";
   ```

## **Screenshots**

### **1. Database Before Running the Program**
A new table with no employees:
![Снимок экрана 2024-11-23 150826](https://github.com/user-attachments/assets/41a5b4c4-a0e6-4504-a289-0109e99747f1)

### **2. After Inserting Employees**
The table after inserting employee records:
![Снимок экрана 2024-11-23 150249](https://github.com/user-attachments/assets/bf23aecc-c399-48cd-abe4-d0fc571de085)

### **3. After Updating an Employee**
The table after updating a record:
![Снимок экрана 2024-11-23 150438](https://github.com/user-attachments/assets/cc27a2d0-ef82-4fd7-93ae-b4f598623ebe)

### **4. After Deleting an Employee**
The table after deleting a record:
![Снимок экрана 2024-11-23 150613](https://github.com/user-attachments/assets/2458823b-65ed-44fa-9eca-9514afb07665)

---

## **Code Files**
- **`Employee.java`**: Represents an employee with fields for `id`, `name`, `position`, `salary`, and `hireDate`.
- **`EmployeeData.java`**: Handles database operations such as create, read, update, and delete (CRUD) using JDBC.
- **`Main.java`**: Provides a test interface to demonstrate CRUD operations.

---
