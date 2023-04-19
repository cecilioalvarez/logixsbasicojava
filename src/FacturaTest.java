import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class FacturaTest {
    
    @Test
    public void crearFacturaTest() {

        Factura factura= new Factura(1,"ordenador",200, new Date());
        assertNotNull(factura);

    }

   
}
