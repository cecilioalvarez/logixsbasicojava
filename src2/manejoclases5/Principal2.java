package com.arquitecturajava.manejoclases5;

public class Principal2 {
    public static void main(String[] args) {
        
     
    imprimir(new Impresora(), "hola amigos");
    imprimir(new Impresora2023(), "hola amigos");
    imprimir(new ImpresoraLaser(), "hola amigos");


    }
    ///////////////////////////////////////////////////////////////////
    public static void  imprimir (Impresora impresora, String texto) {
        //polimorfismo
        impresora.imprimir(texto);
    }
    ///////////////////////////////////////////////////////////////////
}
