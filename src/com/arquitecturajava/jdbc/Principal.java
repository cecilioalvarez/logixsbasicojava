package com.arquitecturajava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal {

    public static void main(String[] args) {

        // Open a connection
        try (Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from PERSONAS");) {
            while (rs.next()) {
                // Display values
                System.out.print(rs.getString("nombre"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

       
    }

}
