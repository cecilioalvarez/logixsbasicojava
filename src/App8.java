public class App8 {
    public static void main(String[] args) throws Exception {

        System.out.println(sumaNumeros(10));
    }

    public static int sumaNumeros(int numero) {
        int suma=0;
        for (int i = 0; i < 10; i++) {
            suma = suma + i;
           // System.out.println(suma);
        }
        return suma;
    }
}
