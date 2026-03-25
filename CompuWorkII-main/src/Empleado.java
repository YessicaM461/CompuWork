// Empleado.java
public abstract class Empleado {
    protected String id;
    protected String nombre;
    protected String apellido;
    protected String tipoDocumento;
    protected String numeroDocumento;
    protected Departamento departamento;

    public Empleado(String id, String nombre, String apellido, String tipoDocumento, String numeroDocumento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    public void asignarDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public abstract double calcularDesempeño();

    @Override
    public String toString() {
        return nombre + " " + apellido + " (" + id + ")";
    }
}
