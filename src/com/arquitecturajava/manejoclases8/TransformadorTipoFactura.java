package com.arquitecturajava.manejoclases8;

import java.util.ArrayList;
import java.util.List;

public class TransformadorTipoFactura {

    private String separador;

    public TransformadorTipoFactura(String separador) {
        this.separador = separador;
    }

    public Factura transformar(String linea) {

        String[] propiedadesFactura = linea.split(",");

        Factura factura = null;
        if (propiedadesFactura[0].contains("SINIVA")) {

            factura = new FacturaSinIVA();

        } else {

            factura = new FacturaConIVA();
        }

        factura.setNumero(Integer.parseInt(propiedadesFactura[1].trim()));
        factura.setConcepto(propiedadesFactura[2].trim());
        factura.setImporte(Double.parseDouble(propiedadesFactura[3].trim()));

        return factura;
    }

    
    
    public List<Factura> transformar(List<String> lineasFacturas) {

        List<Factura> listaFacturas = new ArrayList<Factura>();
        for (String linea : lineasFacturas) {

            if (!linea.contains(separador))
                listaFacturas.add(transformar(linea));
        }

        return listaFacturas;

    }
    /* 
    public List<Empresa> transformarRegular(List<String> lineasFacturas, String separador) {


        List<Empresa> listaEmpresasFacturas= new ArrayList<>();
    
        Empresa empresa=null;
        for (String linea: lineasFacturas) {

            if (linea.contains(separador)) {

                empresa= new Empresa(linea.replace("*", ""));
                listaEmpresasFacturas.add(empresa);
            }else {

                empresa.addFactura(transformar(linea));
            }

        }

        return  listaEmpresasFacturas;
        

    

    }
    */

    public String getSeparador() {
        return separador;
    }

    public void setSeparador(String separador) {
        this.separador = separador;
    }

}
