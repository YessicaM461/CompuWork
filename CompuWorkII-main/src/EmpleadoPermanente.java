// EmpleadoPermanente.java
public class EmpleadoPermanente extends Empleado {
    private int antiguedad;
    private double salarioBase;

    public EmpleadoPermanente(String id, String nombre, String apellido, String tipoDocumento, String numeroDocumento, int antiguedad, double salarioBase) {
        super(id, nombre, apellido, tipoDocumento, numeroDocumento);
        this.antiguedad = antiguedad;
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularDesempeño() {
        return salarioBase + (antiguedad * 100000); // Ejemplo simple
    }
}
