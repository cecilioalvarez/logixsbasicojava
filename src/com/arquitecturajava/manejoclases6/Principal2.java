package com.arquitecturajava.manejoclases6;

public class Principal2 {
    public static void main(String[] args) {
        
        //es una clase inmutable thread safe
        /* 
        String mensaje="hola que tal";

        long t1= System.currentTimeMillis();
        for (int i=0;i<20000;i++) {

            mensaje="adios"+ mensaje+"hola"+i +"que tal";
        }
        long t2= System.currentTimeMillis();
        System.out.println(t2-t1);
        */

        StringBuilder cadena= new StringBuilder("hola que tal");
        long t1= System.currentTimeMillis();
        for (int i=0;i<20000;i++) {

            cadena.append("adios");
            cadena.append("hola que tal");
            cadena.append(i);
            cadena.append("que tal");
        }
        String resultado= cadena.toString();
        long t2= System.currentTimeMillis();
        System.out.println(t2-t1);
    }
    
}
