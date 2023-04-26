package com.arquitecturajava.jdbc2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    public OrdenadorAR() {
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

    public OrdenadorAR actualizar() throws SQLException {

        String sql = "update  Ordenador set modelo=?, precio=? where numero=?";

        try (Connection conexion = DataBaseHelper.getConexion("mySQL");
                PreparedStatement sentencia = conexion.prepareStatement(sql);) {

            sentencia.setInt(1, getNumero());
            sentencia.setString(2, getModelo());
            sentencia.setDouble(3, getPrecio());
            sentencia.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw e;
        }
        return this;
    }

    // su propia persistencia
    public OrdenadorAR insertar() {

        String sql = "insert into Ordenador (numero,modelo,precio) values (?,?,?)";

        try (Connection conexion = DataBaseHelper.getConexion("mySQL");
                PreparedStatement sentencia = conexion.prepareStatement(sql);) {
            sentencia.setInt(1, getNumero());
            sentencia.setString(2, getModelo());
            sentencia.setDouble(3, getPrecio());
            sentencia.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ha ocurrido un error");
            System.out.println(e.getMessage());
        }
        return this;
    }

    // su propia persistencia
    public void borrar() {

        String sql = "delete from Ordenador where numero=?";

        try (Connection conexion = DataBaseHelper.getConexion("mySQL");
                PreparedStatement sentencia = conexion.prepareStatement(sql);) {
            sentencia.setInt(1, getNumero());
            sentencia.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ha ocurrido un error");
            System.out.println(e.getMessage());
        }
    }

    public static List<OrdenadorAR> buscarTodos() {

        List<OrdenadorAR> lista = new ArrayList<OrdenadorAR>();

        try (Connection conn = DataBaseHelper.getConexion("mySQL");
                PreparedStatement stmt = conn.prepareStatement("select * from Ordenador");
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                lista.add(new OrdenadorAR(rs.getInt("numero"), rs.getString("modelo"), rs.getDouble("precio")));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public static List<OrdenadorAR> buscarOrdenadoresBaratos() {

        List<OrdenadorAR> lista = new ArrayList<OrdenadorAR>();

        try (Connection conn = DataBaseHelper.getConexion("mySQL");
                PreparedStatement stmt = conn.prepareStatement("select * from Ordenador where precio<200");
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                lista.add(new OrdenadorAR(rs.getInt("numero"), rs.getString("modelo"), rs.getDouble("precio")));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public static OrdenadorAR buscarUno(int numero) {

        OrdenadorAR ordenador = null;

        try (Connection conn = DataBaseHelper.getConexion("mySQL");
                PreparedStatement stmt = conn.prepareStatement("select * from Ordenador where numero=?");

        ) {
            stmt.setInt(1, numero);
            try (ResultSet rs = stmt.executeQuery()) {
                rs.next();

                ordenador = new OrdenadorAR(rs.getInt("numero"), rs.getString("modelo"), rs.getDouble("precio"));

            }

        } catch (

        SQLException e) {
            e.printStackTrace();
        }
        return ordenador;
    }

    public static List<OrdenadorAR> buscarPorRangoPrecios(double precioInicial, double precioFinal) {

        List<OrdenadorAR> lista = new ArrayList<OrdenadorAR>();

        try (Connection conn = DataBaseHelper.getConexion("mySQL");
                PreparedStatement stmt = conn
                        .prepareStatement("select * from Ordenador where precio between ? and ?")) {

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {

                    lista.add(new OrdenadorAR(rs.getInt("numero"), rs.getString("modelo"), rs.getDouble("precio")));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;

    }
}
