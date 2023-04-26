package com.arquitecturajava.intro2;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraComercialTest {
    
    CalculadoraComercial calculadora;

    //por todos
  

    //por cada prueba
    @BeforeEach
    public  void init() {

        calculadora= new CalculadoraComercial();
    }
    @Test
    public void calcularComisionMenor100Test() {

        //act
        double comision=calculadora.comisionPorImporte(90);
        //assert
        assertEquals(22.5,comision , 0.1);
    } 


    @Test
    public void calcularComisionPor100EurosTest() {

        //act
        double comision=calculadora.comisionPorImporte(100);        
        //assert
        assertEquals(20,comision , 0.1);
    } 

    @Test
    public void calcularComisionMenor500Test() {

    
        //act
        double comision=calculadora.comisionPorImporte(400);

        //assert
        assertEquals(80,comision , 0.1);
    } 
}
