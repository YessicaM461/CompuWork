public class ReporteDesempeno {
    private Empleado empleado;
    private String descripcion;
    private double puntuacion;

    public ReporteDesempeno(Empleado empleado, String descripcion, double puntuacion) {
        this.empleado = empleado;
        this.descripcion = descripcion;
        this.puntuacion = puntuacion;
    }

    public void mostrarReporte() {
        System.out.println("Empleado: " + empleado.getNombre());
        System.out.println("Tipo: " + empleado.getTipoEmpleado());
        System.out.println("Departamento: " + (empleado.departamento != null ? empleado.departamento.getClass().getSimpleName() : "Sin asignar"));
        System.out.println("Descripción: " + descripcion);
        System.out.println("Puntuación: " + puntuacion);
    }
}
