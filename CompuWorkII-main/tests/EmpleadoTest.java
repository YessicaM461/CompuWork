import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmpleadoTest {

    @Test //Test correcto
    void testCalculoDesempenoPermanente() {
        EmpleadoPermanente empleado = new EmpleadoPermanente("1", "Carlos", "Rodríguez", "CC", "100200300", 4, 2500000);
        double esperado = 2500000 + (4 * 100000);
        assertEquals(esperado, empleado.calcularDesempeño());
    }

    /* Test de error
    @Test
    void testCalculoDesempenoPermanente() {
        EmpleadoPermanente empleado = new EmpleadoPermanente("1", "Carlos", "Rodríguez", "CC", "100200300", 4, 2500000);
        double esperado = 2800000 + (4 * 100000);
        double resultado = empleado.calcularDesempeño();
        assertEquals(esperado, resultado);
    }
    */
}
