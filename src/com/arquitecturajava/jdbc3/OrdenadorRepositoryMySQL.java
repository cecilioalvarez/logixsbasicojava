package com.arquitecturajava.jdbc3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrdenadorRepositoryMySQL {
    
    public Ordenador actualizar(Ordenador ordenador) throws SQLException {

        String sql = "update  Ordenador set modelo=?, precio=? where numero=?";

        try (Connection conexion = DataBaseHelper.getConexion("mySQL");
                PreparedStatement sentencia = conexion.prepareStatement(sql);) {

            sentencia.setInt(1,ordenador.getNumero());
            sentencia.setString(2,ordenador.getModelo());
            sentencia.setDouble(3, ordenador.getPrecio());
            sentencia.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw e;
        }
        return ordenador;
    }

    // su propia persistencia
    public Ordenador insertar(Ordenador ordenador) throws SQLException {

        String sql = "insert into Ordenador (numero,modelo,precio) values (?,?,?)";

        try (Connection conexion = DataBaseHelper.getConexion("mySQL");
                PreparedStatement sentencia = conexion.prepareStatement(sql);) {
            sentencia.setInt(1,ordenador.getNumero());
            sentencia.setString(2, ordenador.getModelo());
            sentencia.setDouble(3, ordenador.getPrecio());
            sentencia.executeUpdate();
        } catch (SQLException e) {
   
            System.out.println(e.getMessage());
            throw e;
        }
        return ordenador;
    }

    // su propia persistencia
    public void borrar(Ordenador ordenador) {

        String sql = "delete from Ordenador where numero=?";

        try (Connection conexion = DataBaseHelper.getConexion("mySQL");
                PreparedStatement sentencia = conexion.prepareStatement(sql);) {
            sentencia.setInt(1,ordenador.getNumero());
            sentencia.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ha ocurrido un error");
            System.out.println(e.getMessage());
        }
    }

    public  List<Ordenador> buscarTodos() {

        List<Ordenador> lista = new ArrayList<Ordenador>();

        try (Connection conn = DataBaseHelper.getConexion("mySQL");
                PreparedStatement stmt = conn.prepareStatement("select * from Ordenador");
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                lista.add(new Ordenador(rs.getInt("numero"), rs.getString("modelo"), rs.getDouble("precio")));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public  List<Ordenador> buscarOrdenadoresBaratos() {

        List<Ordenador> lista = new ArrayList<Ordenador>();

        try (Connection conn = DataBaseHelper.getConexion("mySQL");
                PreparedStatement stmt = conn.prepareStatement("select * from Ordenador where precio<200");
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                lista.add(new Ordenador(rs.getInt("numero"), rs.getString("modelo"), rs.getDouble("precio")));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public  Ordenador buscarUno(int numero) {

        Ordenador ordenador = null;

        try (Connection conn = DataBaseHelper.getConexion("mySQL");
                PreparedStatement stmt = conn.prepareStatement("select * from Ordenador where numero=?");

        ) {
            stmt.setInt(1, numero);
            try (ResultSet rs = stmt.executeQuery()) {
                rs.next();

                ordenador = new Ordenador(rs.getInt("numero"), rs.getString("modelo"), rs.getDouble("precio"));

            }

        } catch (

        SQLException e) {
            e.printStackTrace();
        }
        return ordenador;
    }

    public  List<Ordenador> buscarPorRangoPrecios(double precioInicial, double precioFinal) {

        List<Ordenador> lista = new ArrayList<Ordenador>();

        try (Connection conn = DataBaseHelper.getConexion("mySQL");
                PreparedStatement stmt = conn
                        .prepareStatement("select * from Ordenador where precio between ? and ?")) {

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {

                    lista.add(new Ordenador(rs.getInt("numero"), rs.getString("modelo"), rs.getDouble("precio")));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;

    }
}
