package com.arquitecturajava.manejoclases7.main;

import com.arquitecturajava.manejoclases7.Factura;
import com.arquitecturajava.manejoclases7.FacturaIVA;

public class Principal2 {

    public static void main(String[] args) {
        

        Factura f= new FacturaIVA("1A", "ordenador", 100);

        System.out.println(f.getImporteConIVA());
    }
    
}
