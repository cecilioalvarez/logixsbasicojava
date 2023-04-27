package com.arquitecturajava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal4 {
    public static void main(String[] args) {
        OrdenadorAR o = new OrdenadorAR(1, "modelo1", 500);
        insertarOrdenador(o);

    }

    public static void insertarOrdenador(OrdenadorAR ordenador) {

        String consultaSQL= "insert into Ordenador (numero,modelo,precio) values ("+ordenador.getNumero()+",'"+ ordenador.getModelo()+"',"+ ordenador.getPrecio()+")";
        System.out.println(consultaSQL);
        consultaModificacion(consultaSQL);
    }

    private static void consultaModificacion(String sql) {

        try (Connection conexion = getConexion("mySQL");
                Statement sentencia = conexion.createStatement();) {
            sentencia.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("ha ocurrido un error");
            System.out.println(e.getMessage());
        }

    }

    private static Connection getConexion(String tipoBaseDatos) throws SQLException {

        if (tipoBaseDatos.equals("mySQL")) {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/logixs", "root", "");

        } else {

            return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
        }

    }
}
