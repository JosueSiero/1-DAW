package U3_Ejercicio_6;

public class Empleado {
    private static int numeroEmpleado;
    private int numero;

    public Empleado() {
        numeroEmpleado++;
        numero = numeroEmpleado;
    }

    public int getNumero() {
        return numero;
    }
}
