package com.arquitecturajava.jdbc3.config;

import java.io.IOException;
import java.util.List;

public class CargadorConsultasSQL {
    
  
    private LectorFichero  lector;
    private DataBaseHelper dataBaseHelper;
    public CargadorConsultasSQL(LectorFichero lector, DataBaseHelper dataBaseHelper) {
        this.lector=lector;
        this.dataBaseHelper=dataBaseHelper;
    }

    public int cargarFichero() throws IOException {

     List<String> lineas= lector.leerLineas();

     for (String linea: lineas) {

        dataBaseHelper.executarConsulta(linea);

     }
     return lineas.size();
    }



  
}
