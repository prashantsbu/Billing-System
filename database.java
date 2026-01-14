package Electricity.Billing.System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class database {

    private Connection connection;
    Statement statement;

    public database() {
        try {
            // Load MySQL JDBC Driver (optional for newer JDBC versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Bill_system",
                    "root",
                    "Prashant@70"
            );

            // Create statement
            statement = connection.createStatement();

            System.out.println("Database connected successfully.");

        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Failed to connect to the database.");
            e.printStackTrace();
        }
    }

    // Optional: Getter methods
    public Connection getConnection() {
        return connection;
    }

    public Statement getStatement() {

        return statement;
    }
}
