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

    public String getCalificacion() {

        if (valor>=0 && valor<5) {

            return "Suspenso";
        }else if (valor >=5 && valor<7) {

            return "Aprobado";
        }else if (valor>=7 && valor<9) {

            return "Notable";
        }else return "SobreSaliente";
    }
}
