package com.arquitecturajava.manejoclases5;

public class Principal {
    public static void main(String[] args) {
        
        Persona persona= new Persona("ana");
        //polimorfismo dinamico
        Persona persona2= new Deportista("pedro");
    

        persona.andar();
        persona2.andar();


    }
}
