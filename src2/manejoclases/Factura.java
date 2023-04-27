package com.arquitecturajava.manejoclases;
import java.util.Date;

import com.arquitecturajava.utils.CalculoFinanzas;

public class Factura {

    private int numero;
    private String concepto;
    private double importe;
    private Date fecha;
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getConcepto() {
        return concepto;
    }
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    public double getImporte() {
        return importe;
    }
    public void setImporte(double importe) {
        this.importe = importe;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Factura(int numero, String concepto, double importe, Date fecha) {
        this.numero = numero;
        this.concepto = concepto;
        this.importe = importe;
        this.fecha = fecha;
    }
    //refactoring del codigo 
    // en algo que esta en produccion
    // y no sabemos si el cambio le afectara

    public double getImporteConIVA() {
        CalculoFinanzas calculo= new CalculoFinanzas();
        return calculo.iva(importe);
    }
    public double getImporteRetenido() {
        return  importe *0.15;
    }
    



}
