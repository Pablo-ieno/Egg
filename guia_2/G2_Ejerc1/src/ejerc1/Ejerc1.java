/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc1;

import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class Ejerc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de la suma */
        
        Scanner leer = new Scanner(System.in); // Creamos el Scanner
        System.out.println("Ingrese dos números enteros"); // Pedimos al usuario que ingrese datos
        int num1 = leer.nextInt(); // Declaramos la variable num1
        int num2 = leer.nextInt();// Declaramos la variable num2
        int suma = num1 + num2; // Declaramos la variable suma
        System.out.println("La suma de los dos números es igual a: " + suma); /* Se imprime por 
        pantalla el resultado de la suma */
    }
    
}
