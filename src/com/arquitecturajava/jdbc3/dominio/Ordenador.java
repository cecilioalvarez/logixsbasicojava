package com.arquitecturajava.jdbc3.dominio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Ordenador {

    private int numero;
    private String modelo;
    private double precio;

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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Ordenador() {
    }

    public Ordenador(int numero) {
        this.numero = numero;
    }

    public Ordenador(int numero, String modelo, double precio) {
        this.numero = numero;
        this.modelo = modelo;
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numero;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ordenador other = (Ordenador) obj;
        if (numero != other.numero)
            return false;
        return true;
    }

    public void addRecargo(){

        this.precio=precio+101;
    }
   
}
