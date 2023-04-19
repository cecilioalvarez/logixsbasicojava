public class Persona {
    
    private String nombre;
    private String apellidos;
    private int edad;

    //inicializa el objeto
    
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad<110)
        this.edad = edad;
    }

    public boolean estaJubilado() {

         
        if (edad>67) {
            return true;
        }else {return false;}
        
       // return edad>67;
    }
}
