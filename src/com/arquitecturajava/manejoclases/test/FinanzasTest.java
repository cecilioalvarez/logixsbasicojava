package com.arquitecturajava.manejoclases;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.arquitecturajava.utils.CalculoFinanzas;

public class FinanzasTest {
    
    @Test
    public void calcularIVATest() {

        CalculoFinanzas calculo= new CalculoFinanzas();
        double ivaresultado=calculo.iva(200);

        assertEquals(242,ivaresultado);
    }
}
