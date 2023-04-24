package com.arquitecturajava.manejoclases8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TransformadorFicheroFacturacion {

    private LectorFichero lectorFichero;
    private TransformadorTipoFactura transformador;


    public TransformadorFicheroFacturacion(LectorFichero lectorFichero, TransformadorTipoFactura tranformador) {
        this.lectorFichero = lectorFichero;
        this.transformador = tranformador;
    }

    
    public List<Empresa> transformar() throws IOException {


        List<Empresa> listaEmpresasFacturas= new ArrayList<>();
    
        Empresa empresa=null;
        for (String linea: lectorFichero.leerLineas()) {

            if (linea.contains(transformador.getSeparador())) {

                empresa= new Empresa(linea.replace("*", ""));
                listaEmpresasFacturas.add(empresa);
            }else {

                empresa.addFactura(transformador.transformar(linea));
            }

        }

        return  listaEmpresasFacturas;
        

    

    }


}
