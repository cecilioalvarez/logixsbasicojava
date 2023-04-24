package com.arquitecturajava.manejoclases9;

public class Televisor implements Conectable{

    @Override
    public void on() {
      System.out.println("el televisor se enciende");
    }

    @Override
    public void off() {
      System.out.println("el televisor se apaga");
    }
    

}
