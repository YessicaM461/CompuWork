// Main.java (consola básica de prueba)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Departamento sistemas = new Departamento("Sistemas");
        Departamento talento = new Departamento("Talento Humano");

        Empleado juan = new EmpleadoPermanente("1", "Juan", "Pérez", "CC", "12345", 5, 2000000);
        Empleado ana = new EmpleadoTemporal("2", "Ana", "Gómez", "TI", "67890", 6, 1500000);

        sistemas.agregarEmpleado(juan);
        talento.agregarEmpleado(ana);

        ReporteDesempeno.generarIndividual(juan);
        ReporteDesempeno.generarIndividual(ana);

        ReporteDesempeno.generarPorDepartamento(sistemas);
        ReporteDesempeno.generarPorDepartamento(talento);

        sc.close();
    }
}
