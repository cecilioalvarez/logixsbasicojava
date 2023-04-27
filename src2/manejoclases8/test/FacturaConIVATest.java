package com.arquitecturajava.manejoclases8.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.arquitecturajava.manejoclases8.FacturaConIVA;

public class FacturaConIVATest {

    @Test
    public void obtenerImporteConIVA() {

        FacturaConIVA facturaIVA= new FacturaConIVA(1,"ordenador",200);
        double importeConIVA= facturaIVA.getImporteConIVA();

        assertEquals(242,importeConIVA);

    }
}
