package com.arquitecturajava.manejoclases9;

public class Bombilla implements Conectable {

    @Override
    public void off() {
      
        System.out.println("la bombilla se apaga");
        
    }

    @Override
    public void on() {
        System.out.println("la bombilla se enciende");
        
    }
    


}
