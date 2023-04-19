package com.arquitecturajava.intro2;

public class Calculadora {

    // metodo que va a sumar elementos de hecho suma 2
    public double sumar(double a, double b) {

        return a + b;
    }

     // metodo que va a sumar elementos de hecho suma 2
     public double restar(double a, double b) {

        return a - b;
    }

    public double mayor( double[] lista) {

        double mayor=0;

        for (int i=0;i<lista.length;i++) {

            if (mayor<lista[i]) {

                mayor=lista[i];
            }
        }
        return mayor;
      



    }



   

}
