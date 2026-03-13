public class EmpleadoPermanente extends Empleado {
    private double salarioMensual;

    public EmpleadoPermanente(String id, String nombre, double salarioMensual) {
        super(id, nombre);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalario() {
        return salarioMensual;
    }

    @Override
    public String getTipoEmpleado() {
        return "Permanente";
    }
}
