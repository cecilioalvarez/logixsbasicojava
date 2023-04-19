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

    @Test
    public void restarTest() {

        //arrange
       Calculadora calculadora= new Calculadora();
        //act
       double resultadoSuma=calculadora.restar(2,2);

        //assertion

        assertEquals(0, resultadoSuma, 0.1);
    }

    @Test 
    public void numeroMayor() {

            //Arrange
            double[] listaNumeros= {3,3,4,5,8,7};
            Calculadora calculadora= new Calculadora();
              //Act
            double resultado=calculadora.mayor(listaNumeros);
            //Assertion
            assertEquals(8, resultado,0);

    }
}
