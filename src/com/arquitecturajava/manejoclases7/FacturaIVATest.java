package com.arquitecturajava.manejoclases7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FacturaIVATest {
    @Test
    void testGetImporteConIVA() {

        Factura f1= new FacturaIVA("1A", "ordenador", 200);

        double importeIVA= f1.getImporteConIVA();

        assertEquals(242,importeIVA,0.1);
    }
}
