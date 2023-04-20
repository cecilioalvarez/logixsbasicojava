package com.arquitecturajava.manejoclases4;

import java.util.ArrayList;

public class Habitacion {
    
    private ArrayList<Silla> sillas= new ArrayList<Silla>();
    private Mesa mesa;

    
    public Habitacion( Mesa mesa) {
      
        this.mesa = mesa;
    }

    public Habitacion() {
    }

    public ArrayList<Silla> getSillas() {
        return sillas;
    }


    public void setSillas(ArrayList<Silla> sillas) {
        this.sillas = sillas;
    }


    public Mesa getMesa() {
        return mesa;
    }


    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }


    public void addSilla(Silla silla) {
        sillas.add(silla);

    }

    public double getPrecioTotal() {

        double total= mesa.getPrecio();

        for (Silla s: sillas) {

            total+=s.getPrecio();
        }
        return total;
    }
}
