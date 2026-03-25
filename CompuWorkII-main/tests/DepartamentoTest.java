import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DepartamentoTest {

    @Test
    void testAgregarEmpleado() {
        Departamento depto = new Departamento("Recursos Humanos");
        EmpleadoPermanente empleado = new EmpleadoPermanente("4", "Julián", "Isaza", "CC", "123456789", 2, 1500000);

        depto.agregarEmpleado(empleado);

        List<Empleado> empleados = depto.getEmpleados();
        assertTrue(empleados.contains(empleado), "El empleado no fue agregado correctamente al departamento");
    }

    @Test
    void testEliminarEmpleado() {
        Departamento depto = new Departamento("IT");
        EmpleadoTemporal empleado = new EmpleadoTemporal("5", "Laura", "Mejía", "TI", "999888", 6, 1200000);

        depto.agregarEmpleado(empleado);
        depto.eliminarEmpleado(empleado);

        assertFalse(depto.getEmpleados().contains(empleado), "El empleado no fue eliminado correctamente del departamento");
    }
}
