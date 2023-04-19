public class Persona {
    
    String nombre;
    String apellidos;
    int edad;

    public boolean estaJubilado() {

         
        if (edad>67) {
            return true;
        }else {return false;}
        
       // return edad>67;
    }
}
