package com.arquitecturajava.manejoclases8;

import java.io.IOException;
import java.util.List;

public class PruebasDirectorio {
    
    public static void main(String[] args) {
        
        LectorFichero lector= new LectorFichero("./facturastest1.txt");
        List<String> listaCadenas=null;
        try {
            listaCadenas = lector.leerLineas();
            for (String cadena: listaCadenas) {

                System.out.println(cadena);
            }
         } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
