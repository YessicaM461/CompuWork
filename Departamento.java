import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private List<Empleado> empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) throws AsignacionException {
        if (empleado == null) {
            throw new AsignacionException("No se puede asignar un empleado nulo.");
        }
        empleados.add(empleado);
        empleado.asignarDepartamento(this);
    }

    public void listarEmpleados() {
        System.out.println("Empleados en el departamento " + nombre + ":");
        for (Empleado e : empleados) {
            System.out.println("- " + e.getNombre() + " (" + e.getTipoEmpleado() + ")");
        }
    }
}
