package com.arquitecturajava.manejoclases8.test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.arquitecturajava.manejoclases8.Factura;
import com.arquitecturajava.manejoclases8.FacturaConIVA;

public class FacturaTest {


    @Test
    public void igualdadFacturasTest() {

        Factura f1= new FacturaConIVA(1,"ordenador",200);
        Factura f2= new FacturaConIVA(1,"tele",500);
        assertEquals(f1,f2);

    }
}
