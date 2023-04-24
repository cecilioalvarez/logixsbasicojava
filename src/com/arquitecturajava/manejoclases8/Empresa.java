package com.arquitecturajava.manejoclases8;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    
    private String nombre;
    private List<Factura> facturas= new ArrayList<Factura>();
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Factura> getFacturas() {
        return facturas;
    }
    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }

    public void addFactura(Factura factura) {

        this.facturas.add(factura);
    }
    public Empresa(String nombre) {
        this.nombre = nombre;
    }
    
}
