package com.arquitecturajava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal {

    public static void main(String[] args) {

        // Open a connection
        try (Connection conn =getConexion("mySQL");
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

    private static Connection getConexion(String tipoBaseDatos) throws SQLException {

        if (tipoBaseDatos.equals("mySQL")) {
            return  DriverManager.getConnection("jdbc:mysql://localhost:3306/logixs", "root", "");

        }else {

           return  DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
        }

      

    }

}
