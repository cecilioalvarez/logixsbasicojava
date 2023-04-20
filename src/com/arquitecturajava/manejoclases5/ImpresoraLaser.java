package com.arquitecturajava.manejoclases5;

public class ImpresoraLaser extends Impresora {

    @Override
    public void imprimir(String texto) {
        System.out.println(texto);
        System.out.println("imprime a 20 al minuto");
    }

}
