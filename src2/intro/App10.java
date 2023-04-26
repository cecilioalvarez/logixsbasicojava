package com.arquitecturajava.intro;
public class App10 {
    public static void main(String[] args) throws Exception {
       
        // una pequeña mejora
        int [] lista=  {-1,-3,-5,-8};

        int mayor=Integer.MIN_VALUE;

        for (int i=0;i<lista.length;i++) {

          if (mayor<lista[i]) {
            // cambiar el valor almacenado en mayor por 
            // el de la lista ya que la lista es mas grande que el
            // que tenias almacenado
            mayor=lista[i];
          }
        }

        System.out.println(mayor);

    }
}
