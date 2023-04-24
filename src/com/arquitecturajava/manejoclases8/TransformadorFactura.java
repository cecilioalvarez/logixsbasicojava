package com.arquitecturajava.manejoclases8;

public class TransformadorFactura {

    public Factura transformar(String linea) {
        
       String[] propiedadesFactura= linea.split(",");

        Factura factura= new FacturaConIVA();
        factura.setNumero(Integer.parseInt(propiedadesFactura[1].trim()));
        factura.setConcepto(propiedadesFactura[2].trim());
        factura.setImporte(Double.parseDouble(propiedadesFactura[3].trim()));
      
       return factura;
    }

}
