package U3_Ejercicio_6_2;

import java.awt.*;

public class Cliente {
    private String nombreCliente;
    private int numCuenta;
    private String clave;
    private double saldo;

    public Cliente(String nombre, int numero, String clave, double saldo) {
        nombreCliente = nombre;
        numCuenta = numero;
        this.clave = clave;
        this.saldo = saldo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public String getClave() {
        return clave;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", numCuenta=" + numCuenta +
                ", clave=" + clave +
                ", saldo=" + saldo +
                '}';
    }

    public static String identificarCliente(String clave) {
        if (clave.equals("1234")) {
            return "Marta";
        } else if (clave.equals("5678")) {
            return "Julio";
        } else {
            return "Clave errónea";
        }
    }

    public String ingresarDinero(double cantidad) {
        String aux = "";

        if (cantidad > 0) {
            saldo += cantidad;
            aux = "Ingreso correcto";
        } else
            aux = "La cantidad debe ser mayor a 0";
        return aux;
    }

    public String retirarDinero(double cantidad) {
        String aux = "";

        if (cantidad > 0 && cantidad < saldo) {
            saldo -= cantidad;
            aux = "Retirada correcto";
        } else
            aux = "La cantidad debe ser mayor a 0";
        return aux;
    }

    public String cambiar(String claveAntigua, String claveNueva) {
        if (claveAntigua.equals(clave)) {
            clave = claveNueva;
            return "la clave se cambió correctamente";

        } else
            return "La clave antigua No coincide";
    }

    public boolean transferir(Cliente clienteDestino, double cantidad) {
        if (cantidad < saldo) {
            saldo -= cantidad;
            clienteDestino.saldo += cantidad;
            return true;
        } else
            return false;

    }


}
