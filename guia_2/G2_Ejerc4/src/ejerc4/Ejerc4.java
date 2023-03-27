
package ejerc4;

import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class Ejerc4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dada una cantidad de grados centígrados se debe mostrar su equivalente 
en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/

        Scanner teclado = new Scanner(System.in); //inicializamos scanner
        
        double gradosC; //definimos variable tipo num decimal
        System.out.println("Por favor ingrese temperatura en grados Celsius");
        gradosC=teclado.nextDouble(); //leemos el numero introducido y lo asignamos a gradosC
        
        //damos mensaje temperatura transformada a Farenheit
        System.out.println("La temperatura en grados Farenheit es: " + (32+(9*gradosC/5))); 
    }
    
}
