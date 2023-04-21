package com.arquitecturajava.manejoclases6;

public class Principal {
    
    public static void main(String[] args) {
        
        Rectangulo r1= new Rectangulo(2, 2);
        Rectangulo r2= new Rectangulo(3, 3);

        Persona p= new Persona ("pedro");
        Persona p2= new Persona ("juan");
        Persona p3= new Persona ("pedro");
        Persona p4= new Persona ("juan");
        System.out.println(Persona.getContador());
        System.out.println(r1.area());
        System.out.println(r2.area());
    }
}
