public abstract class Empleado {
    protected String id;
    protected String nombre;
    protected Departamento departamento;

    public Empleado(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void asignarDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularSalario();

    public abstract String getTipoEmpleado();
}
