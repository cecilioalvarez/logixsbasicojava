package com.arquitecturajava.jdbc3.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.arquitecturajava.jdbc3.config.DataBaseHelper;
import com.arquitecturajava.jdbc3.dominio.Movil;
import com.arquitecturajava.jdbc3.dominio.Ordenador;

public class MovilRepositoryMySQL  implements MovilRepository{

    private final static String sqlInsertar = "insert into Movil (numero,modelo,contrato) values (?,?,?)";
    private final static String sqlBuscarTodos = "select * from Movil";
 

    @Override
    public Movil actualizar(Movil ordenador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizar'");
    }

    @Override
    public Movil insertar(Movil movil) {
      
      
    
            try (Connection conexion = DataBaseHelper.getConexion("mySQL");
                    PreparedStatement sentencia = conexion.prepareStatement(sqlInsertar);) {
                sentencia.setInt(1, movil.getNumero());
                sentencia.setString(2, movil.getModelo());
                sentencia.setString(3, movil.getContrato());
                sentencia.executeUpdate();
            } catch (SQLException e) {
    
                System.out.println(e.getMessage());
                throw new RuntimeException(e);
            }
            return movil;
        }

    

    @Override
    public void borrar(Movil ordenador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'borrar'");
    }

    
    @Override
    public List<Movil> buscarTodos() {

       
        List<Movil> lista = new ArrayList<Movil>();

        try (Connection conn = DataBaseHelper.getConexion("mySQL");
                PreparedStatement stmt = conn.prepareStatement(sqlBuscarTodos);
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                lista.add(new Movil(rs.getInt("numero"), rs.getString("modelo"), rs.getString("contrato")));
            }

        } catch (SQLException e) {
            System.out.println("ha ocurrido un error");
            throw new RuntimeException(e);
        }
        return null;
    }


    @Override
    public Movil buscarUno(int numero) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarUno'");
    }
    



}
