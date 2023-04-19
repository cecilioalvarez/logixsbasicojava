package com.arquitecturajava.intro2;

public class CalculadoraComercial {

    public double comisionPorImporte(double importe) {

        if (importe > 0 && importe < 100) {
            return importe * 0.25;
        } else if (importe > 100 && importe < 500) {
            return importe * 0.20;
        } else if (importe > 500 && importe < 2000) {
            return importe * 0.10;
        } else{
            return importe * 0.05;
        }
    }
}