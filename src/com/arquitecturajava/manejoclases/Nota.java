package com.arquitecturajava.manejoclases;

public class Nota {

    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor < 0 || valor > 10)
            throw new IllegalArgumentException("valor no valido");

        this.valor = valor;
    }

    public Nota(double valor) {

        setValor(valor);
    }

    public boolean estaAprobada() {

        return valor >= 5;
    }

    public boolean estaSuspensa() {
        return !estaAprobada();
    }

    public boolean esSobreSaliente() {

        return valor >= 9 && valor <= 10;
    }
}
