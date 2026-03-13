public class Main {
    public static void main(String[] args) {
        try {
            Departamento desarrollo = new Departamento("Desarrollo");
            Departamento recursosHumanos = new Departamento("Recursos Humanos");

            Empleado emp1 = new EmpleadoPermanente("E001", "Ana López", 3000000);
            Empleado emp2 = new EmpleadoTemporal("E002", "Carlos Pérez", 6);

            desarrollo.agregarEmpleado(emp1);
            recursosHumanos.agregarEmpleado(emp2);

            desarrollo.listarEmpleados();
            recursosHumanos.listarEmpleados();

            ReporteDesempeno reporte1 = new ReporteDesempeno(emp1, "Excelente desempeño en desarrollo de proyectos", 4.8);
            ReporteDesempeno reporte2 = new ReporteDesempeno(emp2, "Buen desempeño en tareas administrativas", 4.2);

            System.out.println("\n--- Reportes de Desempeño ---");
            reporte1.mostrarReporte();
            reporte2.mostrarReporte();

        } catch (AsignacionException e) {
            System.err.println("Error en la asignación: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error general: " + e.getMessage());
        }
    }
}
