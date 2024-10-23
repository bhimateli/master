package com.example.dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDB {

    private static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";  // Replace with your DB details
    private static final String USER = "your_username";
    private static final String PASSWORD = "your_password";
    private static Connection  connection;

    public void connectDB()  {

        try {
            // Step 1: Load the Oracle JDBC driver (optional in newer versions)
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Step 2: Establish the connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            if (connection != null) {
                System.out.println("Connected to the Oracle database successfully!");
            } else {
                System.out.println("Failed to make connection to the Oracle database.");
            }

        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Oracle JDBC Driver not found: " + e.getMessage());
        } finally {
            // Step 3: Close the connection (in a real-world application, do this in a try-with-resources block)
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }
}
