package com.arquitecturajava.manejoclases9;

public class Priincipal {
    

    public static void main(String[] args) {
        
        Conectable c =new  Bombilla();

        c.on();
        c.off();
        c= new Televisor();

        c.on();
        c.off();
    }
}
