package com.arquitecturajava.manejoclases8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TransformadorFacturaTest {
    
    @Test
    public void transformarTest() {

        TransformadorFactura tf= new TransformadorFactura();
       
        Factura f= tf.transformar("IVA,1,ordenador,200");
        
        assertEquals(1,f.getNumero());
        assertEquals("ordenador",f.getConcepto());
        assertEquals(200,f.getImporte());
        
    }
}
