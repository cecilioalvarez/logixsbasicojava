package com.arquitecturajava.jdbc3.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.arquitecturajava.jdbc3.config.DataBaseHelper;
import com.arquitecturajava.jdbc3.dominio.Movil;

public class MovilRepositoryMySQL  implements MovilRepository{

    private final static String sqlInsertar = "insert into Movil (numero,modelo,contrato) values (?,?,?)";
 

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarTodos'");
    }

    @Override
    public Movil buscarUno(int numero) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarUno'");
    }
    



}
