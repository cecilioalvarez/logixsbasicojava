package com.arquitecturajava.manejoclases2;

public class Alumno {

    private Nota nota1;
    private Nota nota2;
    
    private Nota nota3;
    
    public Alumno(Nota nota1, Nota nota2, Nota nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public Nota getNota1() {
        return nota1;
    }
    public void setNota1(Nota nota1) {
        this.nota1 = nota1;
    }
    public Nota getNota2() {
        return nota2;
    }
    public void setNota2(Nota nota2) {
        this.nota2 = nota2;
    }
    public Nota getNota3() {
        return nota3;
    }
    public void setNota3(Nota nota3) {
        this.nota3 = nota3;
    }

    public Nota getNotaMayor() {

        if (nota1.getValor()>nota2.getValor()) {

            if (nota1.getValor()>nota3.getValor()) {
                return nota1;
            }else {

                return nota3;
            }
        }else {

            if (nota2.getValor()>nota3.getValor()) {

                return nota2;
            }else {
                return nota3;
            }
        }
    }


}