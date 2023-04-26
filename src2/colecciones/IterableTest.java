package com.arquitecturajava.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class IterableTest {

    public static void main(String[] args) {

        ArrayList<String> lista= new ArrayList<>();

        lista.add("hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");
        


        Iterable<String> iterable =lista;

        Iterator<String> iterador = iterable.iterator();
        

        while (iterador.hasNext()) {

            String texto= iterador.next();
            System.out.println(texto);
            if (texto.equals("hola")) {
                iterador.remove();
            }
        }

        System.out.println("********************************");

        iterador=iterable.iterator();
        while (iterador.hasNext()) {

            String texto= iterador.next();
            System.out.println(texto);
         
        }

        //foreach no es un bucle for porque no accede por posicion
        for (String texto: lista) {
            System.out.println(texto);
        }
    }

}
