package com.arquitecturajava.jdbc3.testbasicos;

public class Nota {
    
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Nota(double valor) {
        this.valor = valor;
    }

    public boolean esAprobada() {

        return valor>=8;
    }
    
}
