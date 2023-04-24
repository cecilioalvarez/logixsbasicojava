package com.arquitecturajava.manejoclases8.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.arquitecturajava.manejoclases8.Factura;
import com.arquitecturajava.manejoclases8.TransformadorFactura;

public class TransformadorFacturaTest {
    
    TransformadorFactura tf;

    @BeforeEach
    public void iniciar() {

        tf= new TransformadorFactura();
    }

    @Test
    public void convertirLineaEnFacturaTest() {
       
        Factura f= tf.transformar("IVA,1,ordenador,200");    

        assertEquals(1,f.getNumero());
        assertEquals("ordenador",f.getConcepto());
        assertEquals(200,f.getImporte());
     
        
    }


    @Test
    public void lineaToFacturaConIVATest() {
       
        Factura f= tf.transformar("IVA,1,ordenador,200");          
        assertEquals(242,f.getImporteConIVA());
        
    }

    @Test
    public void lineasToListaFacturasTest() {
       
        List<String> lineasFacturas=new ArrayList<String>();
        lineasFacturas.add("IVA,1,ordenador,200");
        lineasFacturas.add("IVA,2,tablet,200");
        lineasFacturas.add("IVA,3,auricular,500");
        lineasFacturas.add("IVA,4,telefono,500");

        List<Factura> facturas= tf.transformar(lineasFacturas);          
     
        assertEquals(4,facturas.size());
    }


    @Test
    public void lineasToListaFacturasConFiltradoDeAsteriscosTest() {
       
        List<String> lineasFacturas=new ArrayList<String>();
        lineasFacturas.add("IVA,1,ordenador,200");
        lineasFacturas.add("IVA,2,tablet,200");
        lineasFacturas.add("IVA,3,auricular,500");
        lineasFacturas.add("***************");
        lineasFacturas.add("IVA,3,auricular,500");
        lineasFacturas.add("***************");

        List<Factura> facturas= tf.transformar(lineasFacturas);          
     
        assertEquals(4,facturas.size());
    }



    @Test
    public void lineaToFacturaSinIVATest() {
       
        Factura f= tf.transformar("SINIVA,1,ordenador,200");
        assertEquals(200,f.getImporteConIVA());
    }
}
