package com.arquitecturajava.manejoclases.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.jupiter.api.Test;

import com.arquitecturajava.manejoclases.Factura;

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

        //arrange
        Factura factura= new Factura(1,"ordenador",200, new Date());
        //act
        double retencionFacturaImporte= factura.getImporteRetenido();

        // assert verificar
        assertEquals(30, retencionFacturaImporte, 0.1);
    }
   
}
