package JDBC;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class JDBCConnection {

	public static void main(String[] args) {
		// fetch the db url, password and username of the my sql db
		String dbURL = "jdbc:mysql://localhost:3306/2607wiprodb";
		String username = "root";
		String password = "VikramVicky@2002";
		System.out.println("Program started...");
		
		try (Connection conn = DriverManager.getConnection(dbURL, username, password);
	             Statement stmt = conn.createStatement()) {
			stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS companydb");
            stmt.execute("USE companydb");
            
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS employees (" +
                    "id INT PRIMARY KEY, " +
                    "name VARCHAR(50), " +
                    "department VARCHAR(50), " +
                    "salary DOUBLE)");
            stmt.executeUpdate("DELETE FROM employees");

            // Insert records
            stmt.executeUpdate("REPLACE INTO employees (id, name, department, salary) VALUES " +
                    "(101, 'Alice', 'HR', 50000)," +
                    "(102, 'Bob', 'IT', 65000)," +
                    "(103, 'Charlie', 'Sales', 60000)");
            stmt.executeUpdate("DROP TABLE IF EXISTS employees");
            stmt.executeUpdate("CREATE TABLE employees (" +
                    "id INT PRIMARY KEY, " +
                    "name VARCHAR(50), " +
                    "department VARCHAR(50), " +
                    "salary DOUBLE)");

            // Update and delete
            stmt.executeUpdate("UPDATE employees SET salary = 70000 WHERE id = 102");
            stmt.executeUpdate("UPDATE employees SET department = 'Finance' WHERE name = 'Alice'");
            stmt.executeUpdate("DELETE FROM employees WHERE id = 103");
            stmt.executeUpdate("DELETE FROM employees WHERE department = 'Sales'");

            // Select and display data
            ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
            System.out.println("Final Employees Table:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " +
                                   rs.getString("name") + " - " +
                                   rs.getString("department") + " - " +
                                   rs.getDouble("salary"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
}
		

		
			
		
		   
