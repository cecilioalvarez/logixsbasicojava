package com.arquitecturajava.manejoclases4;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class HabitacionTest {
    @Test
    void testAddSilla() {

        Habitacion habitacion= new Habitacion();
        habitacion.addSilla(new Silla(100));
        int numeroSillas=habitacion.getSillas().size();
        assertEquals(1, numeroSillas);
    }

    @Test
    void testGetPrecioTotal() {

        Habitacion habitacion= new Habitacion();
        Silla s1= new Silla(100);
        Silla s2= new Silla(150);
        ArrayList<Silla> sillas= new ArrayList<Silla>();
        sillas.add(s1);
        sillas.add(s2);
        habitacion.setSillas(sillas);
        habitacion.setMesa(new Mesa(200));

        double total= habitacion.getPrecioTotal();

        assertEquals(450, total,0);
    }
}
