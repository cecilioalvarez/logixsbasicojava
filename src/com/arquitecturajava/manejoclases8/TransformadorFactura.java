package com.arquitecturajava.manejoclases8;

import java.util.ArrayList;
import java.util.List;

public class TransformadorFactura {

    public Factura transformar(String linea) {
        
       if (linea.startsWith("***")) {

        return null;
       }

       String[] propiedadesFactura= linea.split(",");


       Factura factura=null;
        if (propiedadesFactura[0].contains("SINIVA")) {

            factura= new FacturaSinIVA();

        }else {

            factura= new FacturaConIVA();
        }
       
        factura.setNumero(Integer.parseInt(propiedadesFactura[1].trim()));
        factura.setConcepto(propiedadesFactura[2].trim());
        factura.setImporte(Double.parseDouble(propiedadesFactura[3].trim()));
      
       return factura;
    }

    public List<Factura> transformar(List<String> lineasFacturas) {
   
        List<Factura> listaFacturas= new ArrayList<Factura>();
        for (String linea: lineasFacturas) {

            if (transformar(linea)!=null)
                listaFacturas.add (transformar(linea));
        }

        return listaFacturas;

    }

}
