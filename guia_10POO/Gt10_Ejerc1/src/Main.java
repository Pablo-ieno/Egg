<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.*/


    public static void main(String[] args) {

        ArrayList<String> perros = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.print("Ingrese una raza de perro: ");
            String raza = scanner.nextLine();
            perros.add(raza);

            System.out.print("¿Quiere ingresar otra raza de perro? (S/N): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("N")) {
                continuar = false;
            }
        }

        System.out.println("Razas de perros ingresadas:");
        for (String raza : perros) {
            System.out.println(raza);


        }
=======
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        System.out.println("Hola mundo");

>>>>>>> origin/master
    }
}
