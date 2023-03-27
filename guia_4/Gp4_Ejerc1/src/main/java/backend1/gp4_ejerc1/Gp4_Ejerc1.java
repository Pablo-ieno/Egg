/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package backend1.gp4_ejerc1;

import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class Gp4_Ejerc1 {

    public static void main(String[] args) {
        /*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre 
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
matemática y deben devolver sus resultados para imprimirlos en el main.*/

        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
       
        System.out.println("Ingrese 2 números");
        
        System.out.print("Número 1: ");
        num1 = leer.nextInt();
        
        System.out.print("Número 2: ");
        num2 = leer.nextInt();
        
        System.out.println("Elija el número de operación a realizar:");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicación");
        System.out.println("4 - División");
        int operacion = leer.nextInt();
        int resultado;
        int suma = suma(num1, num2);
        int resta = resta(num1, num2);
        int multiplicacion = multiplicacion(num1, num2);
        float division = division(num1, num2);

        switch (operacion) {
            case 1:
                
                System.out.println("El resultado de la suma es: " + suma);
                break;
            case 2:
                
                System.out.println("El resultado de la resta es: " + resta);
                break;
            case 3:
                
                System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
                break;
            case 4:
                
                System.out.println("El resultado de la division es: " + division);
                break;
            default:
                System.out.println("No existe una operación para ese valor ");

        }

    }

    public static int suma(int num1, int num2) {
        //Desarrollo lógico.
        int resultado = num1 + num2;
        return resultado;

    }

    public static int resta(int num1, int num2) {
        //Desarrollo lógico.
        int resultado = num1 - num2;
        return resultado;

    }

    public static int multiplicacion(int num1, int num2) {
        //Desarrollo lógico.
        int resultado = num1 * num2;
        return resultado;

    }
    public static float division(int num1, int num2) {
        //Desarrollo lógico.
        float resultado = num1 / num2;
        return resultado;
    }
}

