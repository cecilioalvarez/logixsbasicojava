package com.arquitecturajava.jdbc;

import java.sql.SQLException;

import org.h2.tools.Server;

public class Servidor {
    
    public static void main(String[] args) {
       
        try {
            Server server = Server.createTcpServer(args).start();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
