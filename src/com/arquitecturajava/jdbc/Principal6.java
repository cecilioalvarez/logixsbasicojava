package com.arquitecturajava.jdbc;

import java.sql.ResultSet;
import java.util.List;

public class Principal6 {
    
    public static void main(String[] args) {
        
        OrdenadorAR ordenador= new  OrdenadorAR();
        List<OrdenadorAR> lista= ordenador.buscarTodos();

       for (OrdenadorAR o: lista) {

        System.out.println(o.getModelo());
       }
    }
}
