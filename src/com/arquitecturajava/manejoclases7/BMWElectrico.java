package com.arquitecturajava.manejoclases7;

public class BMWElectrico extends BMW {

    public BMWElectrico(String modelo, double precio) {
        super(modelo, precio);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void repostar() {
        // TODO Auto-generated method stub
      System.out.println("repostaje con cargador electrico");
    }
    
}
