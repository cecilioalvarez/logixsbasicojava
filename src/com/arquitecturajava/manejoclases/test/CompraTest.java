package com.arquitecturajava.manejoclases.test;
import java.util.Date;

import org.junit.jupiter.api.Test;

import com.arquitecturajava.manejoclases.Compra;

public class CompraTest {
    

    @Test
    public void crearCompraTest() {


        Compra compra= new Compra ("1A","ordenador",200,new Date());

    }

    @Test
    public void calcularImporteConIVA() {


        Compra compra= new Compra ("1A","ordenador",200,new Date());
        
    }

}
