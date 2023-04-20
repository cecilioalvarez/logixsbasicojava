package com.arquitecturajava.manejoclases;

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

    public boolean estaAprobada() {

        return valor>=5;
    }

    public boolean estaSuspensa() {
        return !estaAprobada();
    }

    public boolean esSobreSaliente() {

        return valor>=9;
    }
}