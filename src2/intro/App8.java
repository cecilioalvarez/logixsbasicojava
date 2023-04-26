package com.arquitecturajava.intro;
public class App8 {
    public static void main(String[] args) throws Exception {

        //lo he llamado con el 10
        System.out.println(sumaNumeros(10));
         //lo he llamado con el 10
         System.out.println(sumaNumeros(3));
    }

    // bloque de codigo que nosotros podemos reutilizar en
    // nuestro programa
    public static int sumaNumeros(int numero) {
        int suma=0;
        for (int i = 0; i < numero; i++) {
            //suma=suma+=i
            suma = suma + i;
           // System.out.println(suma);
        }
        return suma;
    }
}
