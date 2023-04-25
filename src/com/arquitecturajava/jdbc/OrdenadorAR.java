package com.arquitecturajava.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class OrdenadorAR {

    private int numero;
    private String modelo;
    private double precio;


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    public OrdenadorAR(int numero) {
        this.numero = numero;
    }

    public OrdenadorAR(int numero, String modelo, double precio) {
        this.numero = numero;
        this.modelo = modelo;
        this.precio = precio;
    }
    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numero;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrdenadorAR other = (OrdenadorAR) obj;
        if (numero != other.numero)
            return false;
        return true;
    }

    // su propia persistencia
    public void insertar() {

        String sql = "insert into Ordenador (numero,modelo,precio) values (" + getNumero() + ",'" + getModelo() + "',"
                + getPrecio() + ")";

        try (Connection conexion = DataBaseHelper.getConexion("mySQL");
                Statement sentencia = conexion.createStatement();) {
            sentencia.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("ha ocurrido un error");
            System.out.println(e.getMessage());
        }
    }

     // su propia persistencia
     public void borrar() {

        String sql = "delete from  Ordenador where numero=" +getNumero() ;
             

        try (Connection conexion = DataBaseHelper.getConexion("mySQL");
                Statement sentencia = conexion.createStatement();) {
            sentencia.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("ha ocurrido un error");
            System.out.println(e.getMessage());
        }
    }

}
