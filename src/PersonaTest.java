import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PersonaTest {

    @Test
    public void estaJubiladoTest() {

        Persona persona1= new Persona();
        persona1.edad=75;

        assertTrue (persona1.estaJubilado());
    }
    
}
