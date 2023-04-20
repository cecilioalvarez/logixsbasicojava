package com.arquitecturajava.manejoclases2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CajaDobleTest {


    @Test
    public void pesoTotalTest() {

        //arrange
        Caja c1= new Caja(2);
        Caja c2= new Caja(4);
        CajaDoble cajaDoble= new CajaDoble(c1,c2);

        double pesoTotal= cajaDoble.getPeso();

        assertEquals(6,pesoTotal);

    }
    
}
