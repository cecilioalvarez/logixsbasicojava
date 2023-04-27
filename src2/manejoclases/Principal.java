package com.arquitecturajava.manejoclases;
public class Principal {
   
    public static void main(String[] args) {
        
        //operador especial new 
        //una varialbe p1
        Persona p1= new Persona("pepe","perez",20);
        //operador . accede a las propiedades

       

        System.out.println(p1.getNombre());
        System.out.println(p1.getApellidos());
        System.out.println(p1.getEdad());
    }
}
