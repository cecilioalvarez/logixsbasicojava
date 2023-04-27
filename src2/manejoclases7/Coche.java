package com.arquitecturajava.manejoclases7;

public abstract class Coche {
    
    private String modelo;
    private double precio;

    
    public Coche(String modelo, double precio) {
        this.modelo = modelo;
        this.precio = precio;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void repostar() {

        System.out.println("el coche echa gasolina");

    }

    public abstract void arrancar();

    public abstract void acelerar() ;
}
