package com.arquitecturajava.manejoclases8.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.arquitecturajava.manejoclases8.Empresa;
import com.arquitecturajava.manejoclases8.Factura;
import com.arquitecturajava.manejoclases8.LectorFichero;
import com.arquitecturajava.manejoclases8.TransformadorFicheroFacturacion;
import com.arquitecturajava.manejoclases8.TransformadorTipoFactura;

public class TransformadorFacturaTest {
    
    TransformadorTipoFactura tf;

    @BeforeEach
    public void iniciar() {

        tf= new TransformadorTipoFactura("*");
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



    // test de integracion que integra varias clases
    @Test
    public void lineasToListaFacturasConFiltradoPorEmpresaTest() throws IOException {
       
      

        LectorFichero lector= new LectorFichero("facturastest3.txt");
        TransformadorTipoFactura transformador= new TransformadorTipoFactura("*");

        TransformadorFicheroFacturacion tff= new TransformadorFicheroFacturacion(lector, transformador);

        List<Empresa> empresas=tff.transformar();      
     
        Empresa empresaA= empresas.get(0);
        Empresa empresaB= empresas.get(1);
        
        assertEquals(3,empresas.size());
        assertEquals(3,empresaA.getFacturas().size());
        assertEquals(1,empresaB.getFacturas().size());
        assertEquals("EmpresaA",empresaA.getNombre());
        assertEquals("EmpresaB",empresaB.getNombre());
    }




    @Test
    public void lineaToFacturaSinIVATest() {
       
        Factura f= tf.transformar("SINIVA,1,ordenador,200");
        assertEquals(200,f.getImporteConIVA());
    }
}
