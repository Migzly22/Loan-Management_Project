import java.sql.*;
import javax.swing.*;
import java.awt.*;

import javax.swing.JOptionPane;

public class Connector {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/lms";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";


    public Connection connectdb() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace(); // Print the exception stack trace to the console
            return null;
        }
    }
}