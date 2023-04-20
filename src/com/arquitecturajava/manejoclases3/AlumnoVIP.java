package com.arquitecturajava.manejoclases3;

public class AlumnoVIP extends Alumno {

    private String tipoBeca;

    //redisñar el constructor a mi medida
    public AlumnoVIP(String nombre,String tipoBeca) {
        //delego en el constructor de la clase padre
        super(nombre);
        this.tipoBeca=tipoBeca;
        //TODO Auto-generated constructor stub
    }

    public String getTipoBeca() {
        return tipoBeca;
    }

    public void setTipoBeca(String tipoBeca) {
        this.tipoBeca = tipoBeca;
    }

    public double getPorcentajeBeca() {

        if (tipoBeca.equals("Normal")) {

            return 20;
        }else {
            return 30;
        }
    }


}