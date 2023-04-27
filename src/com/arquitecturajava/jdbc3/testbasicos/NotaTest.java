package com.arquitecturajava.jdbc3.testbasicos;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class NotaTest {
    

    @Test
    public void notaAprobada() {

        Nota nota= new Nota(6);
        assertTrue( nota.esAprobada());

    }
}
