// ReporteDesempeno.java
public class ReporteDesempeno {
    public static void generarIndividual(Empleado e) {
        System.out.println("Desempeño de " + e.toString() + ": " + e.calcularDesempeño());
    }

    public static void generarPorDepartamento(Departamento d) {
        System.out.println("Reporte de desempeño por departamento: " + d.getNombre());
        for (Empleado e : d.getEmpleados()) {
            System.out.println(e.toString() + ": " + e.calcularDesempeño());
        }
    }
}
