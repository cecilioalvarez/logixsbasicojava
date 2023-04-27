package com.arquitecturajava.manejoclases2;

public class CajaDoble {

    private Caja caja1;
    private Caja caja2;

    
    public Caja getCaja1() {
        return caja1;
    }
    public void setCaja1(Caja caja1) {
        this.caja1 = caja1;
    }
    public Caja getCaja2() {
        return caja2;
    }
    public void setCaja2(Caja caja2) {
        this.caja2 = caja2;
    }
    public CajaDoble(Caja caja1, Caja caja2) {
        this.caja1 = caja1;
        this.caja2 = caja2;
    }
    
    public double getPeso() {

        return caja1.getPeso()+caja2.getPeso();
    }
    
}
