package com.arquitecturajava.manejoclases5;

public class Principal {
    public static void main(String[] args) {
        
        Persona persona= new Persona("ana");
        Deportista deportista= new Deportista("pedro");
        
        persona.andar();
        deportista.andar();


    }
}
