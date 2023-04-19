public class Principal {
   
    public static void main(String[] args) {
        
        //operador especial new 
        //una varialbe p1
        Persona p1= new Persona();
        //operador . accede a las propiedades

        p1.nombre="pedro";
        p1.apellidos="gomez";
        p1.edad=20;

        System.out.println(p1.nombre);
        System.out.println(p1.apellidos);
        System.out.println(p1.edad);
    }
}
