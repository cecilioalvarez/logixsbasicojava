package com.arquitecturajava.jdbc3.dominio;

public class Movil {
    
    private int numero;
    private String modelo;
    private String contrato;
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getContrato() {
        return contrato;
    }
    public void setContrato(String contrato) {
        this.contrato = contrato;
    }
    public Movil(int numero, String modelo, String contrato) {
        this.numero = numero;
        this.modelo = modelo;
        this.contrato = contrato;
    }
    public Movil(int numero) {
        this.numero = numero;
    }

    
}
