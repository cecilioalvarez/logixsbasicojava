package com.arquitecturajava.manejoclases8;

public class FacturaConIVA extends Factura {

    public FacturaConIVA(int numero, String concepto, double importe) {
        super(numero,concepto,importe);
    }

    public double getImporteConIVA() {
        return getImporte() *1.21;
    }

    public FacturaConIVA() {
        
    }
    

}
