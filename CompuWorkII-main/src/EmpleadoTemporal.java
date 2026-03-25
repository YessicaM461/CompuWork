// EmpleadoTemporal.java
public class EmpleadoTemporal extends Empleado {
    private int mesesContrato;
    private double salarioMensual;

    public EmpleadoTemporal(String id, String nombre, String apellido, String tipoDocumento, String numeroDocumento, int mesesContrato, double salarioMensual) {
        super(id, nombre, apellido, tipoDocumento, numeroDocumento);
        this.mesesContrato = mesesContrato;
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularDesempeño() {
        return salarioMensual * mesesContrato; // Ejemplo simple
    }
}
