package com.arquitecturajava.manejoclases;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class FacturaTest {
    
    @Test
    public void crearFacturaTest() {

        Factura factura= new Factura(1,"ordenador",200, new Date());
        assertNotNull(factura);

    }

    @Test
    public void calcularImporteConIva() {

        Factura factura= new Factura(1,"ordenador",200, new Date());
        
        double iva= factura.getImporteConIVA();

        assertEquals(242, iva, 0.1);
    }


    @Test
    public void calcularRetencionFactura() {

        Factura factura= new Factura(1,"ordenador",200, new Date());
        
        double retencion= factura.getImporteRetenido();

        assertEquals(30, retencion, 0.1);
    }
   
}
