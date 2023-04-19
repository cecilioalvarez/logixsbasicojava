package com.arquitecturajava.intro2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraComercialTest {
    
    @Test
    public void calcularComisionMenor100Test() {

        //arrange
        CalculadoraComercial calculadora= new CalculadoraComercial();
        //act
        double comision=calculadora.comisionPorImporte(90);

        //assert
        assertEquals(22.5,comision , 0.1);
    } 
}
