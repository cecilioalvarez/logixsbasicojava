package com.arquitecturajava.manejoclases7;

public class BMW  extends Coche{

    public BMW(String modelo, double precio) {
        super(modelo, precio);
        //TODO Auto-generated constructor stub
    }

    
    /*@Override
    public void repostar() {
     System.out.println("el repostaje es vip");
        super.repostar();
    }*/


    @Override
    public void acelerar() {
      
        System.out.println("el bwm acelera de 0 a 100 en 7 s");
    }

    @Override
    public void arrancar() {
        // TODO Auto-generated method stub
       System.out.println("el bmw arranca con llave electornica");
    }
    
}
