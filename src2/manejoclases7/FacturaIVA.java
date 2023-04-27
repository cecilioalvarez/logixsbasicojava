package com.arquitecturajava.manejoclases7;

public class FacturaIVA extends Factura {

    public FacturaIVA(String numero, String concepto, double importe) {
        super(numero, concepto, importe);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double getImporteConIVA() {
       
        super.revisarEstado();
      return getImporte()*1.21;
    }
    
}
