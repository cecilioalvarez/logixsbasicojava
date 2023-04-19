package com.arquitecturajava.intro2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    

    @Test
    public void sumarTest() {

        //arrange
       Calculadora calculadora= new Calculadora();
        //act
       double resultadoSuma=calculadora.sumar(2,2);

        //assertion

        assertEquals(4, resultadoSuma, 0.1);
    }
}
