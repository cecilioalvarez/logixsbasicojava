package com.arquitecturajava.manejoclases5;

public class Deportista extends Persona {

    private String deporte;
    
    public Deportista(String nombre) {
        super(nombre);
     
    }

    @Override
    public void andar() {
        System.out.println("el deportista anda a 7km/hora");
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
    
}
