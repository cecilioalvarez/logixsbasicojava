package com.arquitecturajava.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class IterableTest2 {

    public static void main(String[] args) {

        ArrayList<String> lista= new ArrayList<>();

        lista.add("hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");
        
        // una cadena o string es un objeto que tiene equals y hashcode
        lista.remove(new String("hola"));

        for (String cadena: lista) {

            System.out.println(cadena);
        }

        lista.addAll(lista);

        for (String cadena: lista) {

            System.out.println(cadena);
        }

    }
}
