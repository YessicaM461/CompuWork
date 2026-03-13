public class EmpleadoTemporal extends Empleado {
    private int duracionContratoMeses;

    public EmpleadoTemporal(String id, String nombre, int duracionContratoMeses) {
        super(id, nombre);
        this.duracionContratoMeses = duracionContratoMeses;
    }

    @Override
    public double calcularSalario() {
        return duracionContratoMeses * 1000000;
    }

    @Override
    public String getTipoEmpleado() {
        return "Temporal";
    }
}
