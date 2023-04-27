package com.arquitecturajava.jdbc3.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.arquitecturajava.jdbc3.config.DataBaseHelper;
import com.arquitecturajava.jdbc3.dominio.Ordenador;

public class OrdenadorRepositoryMySQL implements OrdenadorRepository {

    private final static String sqlActualizar = "update  Ordenador set modelo=?, precio=? where numero=?";
    private final static String sqlInsertar = "insert into Ordenador (numero,modelo,precio) values (?,?,?)";
    private final static String sqlBorrar = "delete from Ordenador where numero=?";
    private final static String sqlBuscarTodos= "select * from Ordenador order by modelo";
    private final static String sqlBuscarBaratos="select * from Ordenador where precio<200";
    private final static String sqlBuscarUno= "select * from Ordenador where numero=?";

    @Override
    public Ordenador actualizar(Ordenador ordenador) {

     
        try (Connection conexion = DataBaseHelper.getConexion("mySQL");
                PreparedStatement sentencia = conexion.prepareStatement(sqlActualizar);) {

            sentencia.setInt(1, ordenador.getNumero());
            sentencia.setString(2, ordenador.getModelo());
            sentencia.setDouble(3, ordenador.getPrecio());
            sentencia.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        return ordenador;
    }

    // su propia persistencia
    @Override
    public Ordenador insertar(Ordenador ordenador) {

      

        try (Connection conexion = DataBaseHelper.getConexion("mySQL");
                PreparedStatement sentencia = conexion.prepareStatement(sqlInsertar);) {
            sentencia.setInt(1, ordenador.getNumero());
            sentencia.setString(2, ordenador.getModelo());
            sentencia.setDouble(3, ordenador.getPrecio());
            sentencia.executeUpdate();
        } catch (SQLException e) {

            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        return ordenador;
    }

    // su propia persistencia
    @Override
    public void borrar(Ordenador ordenador) {

      

        try (Connection conexion = DataBaseHelper.getConexion("mySQL");
                PreparedStatement sentencia = conexion.prepareStatement(sqlBorrar);) {
            sentencia.setInt(1, ordenador.getNumero());
            sentencia.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ha ocurrido un error");
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Ordenador> buscarTodos() {

       
        List<Ordenador> lista = new ArrayList<Ordenador>();

        try (Connection conn = DataBaseHelper.getConexion("mySQL");
                PreparedStatement stmt = conn.prepareStatement(sqlBuscarTodos);
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                lista.add(new Ordenador(rs.getInt("numero"), rs.getString("modelo"), rs.getDouble("precio")));
            }

        } catch (SQLException e) {
            System.out.println("ha ocurrido un error");
            throw new RuntimeException(e);
        }
        return lista;
    }

    @Override
    public List<Ordenador> buscarOrdenadoresBaratos() {

       
        List<Ordenador> lista = new ArrayList<Ordenador>();

        try (Connection conn = DataBaseHelper.getConexion("mySQL");
                PreparedStatement stmt = conn.prepareStatement(sqlBuscarBaratos);
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                lista.add(new Ordenador(rs.getInt("numero"), rs.getString("modelo"), rs.getDouble("precio")));
            }

        } catch (SQLException e) {
            System.out.println("ha ocurrido un error");
            throw new RuntimeException(e);
        }
        return lista;
    }

    @Override
    public Ordenador buscarUno(int numero) {

       
        Ordenador ordenador = null;

        try (Connection conn = DataBaseHelper.getConexion("mySQL");
                PreparedStatement stmt = conn.prepareStatement(sqlBuscarUno);

        ) {
            stmt.setInt(1, numero);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next() != false)
                    ordenador = new Ordenador(rs.getInt("numero"), rs.getString("modelo"), rs.getDouble("precio"));

            }

        } catch (SQLException e) {
            System.out.println("ha ocurrido un error");
            throw new RuntimeException(e);
        }
        return ordenador;
    }

    @Override
    public List<Ordenador> buscarPorRangoPrecios(double precioInicial, double precioFinal) {

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
            System.out.println("ha ocurrido un error");
            throw new RuntimeException(e);
        }
        return lista;

    }
}
