import U3_Ejercicio_7.Gato;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gato gato1 = new Gato("Félix", "persa", 25, 5, "blanco");
        Gato gato2= gato1;
        gato1.setColor("marrón");
        System.out.println(gato1.getColor());
        System.out.println(gato2.getColor());

        /* El color del gato2 en este nivel es igual al del gato1,
        pero si la impresión de pantalla se realiza antes de gato1.setColor
        gato2 seguirá siendo blanco*/

        String cadena1 = "Mi primera cadena";
        String cadena2 = cadena1;

        cadena1 = "Se ha modificado la cadena";

        System.out.println(cadena2);

        /*Al crear cadena2 con el valor inicial de cadena1 se está creando
        * un "backup" de cadena1 y cadena2 siempre mantendrá ese valor hasta que se le cambie*/




    }
}