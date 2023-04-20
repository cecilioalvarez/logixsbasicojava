package com.arquitecturajava.manejoclases3;

import java.util.ArrayList;

public class Prueba {
    
    public static void main(String[] args) {
        
        ArrayList<String> lista= new ArrayList<String>();
        lista.add("hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");

        for (String texto: lista) {

            System.out.println(texto);
        }
    }
}
