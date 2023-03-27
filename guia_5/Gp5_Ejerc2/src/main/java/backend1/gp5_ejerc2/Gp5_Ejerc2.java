/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package backend1.gp5_ejerc2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class Gp5_Ejerc2 {

    public static void main(String[] args) {
        /*Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
        le pida al usuario un número a buscar en el vector. El programa mostrará dónde se 
        encuentra el numero y si se encuentra repetido */

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int n = leer.nextInt();

        int[] vector = new int[n];
        int cont = 0;

        Random aleat = new Random();
        for (int i = 0; i < n; i++) {
            vector[i] = aleat.nextInt(100);

        }
        boolean encontrado = false;
        System.out.print("Ingrese el número que quiere buscar: ");
        int num = leer.nextInt();

        for (int i = 0; i < n; i++) {
            if (vector[i] == num) {
                System.out.println("El nro buscado está en la posición " + i + " del vector");
                encontrado = true;
                cont = cont + 1;
                System.out.print("[" + vector[i] + "]");
                System.out.println("El nro se encontró " + cont + " cantidad de veces");

            }

        }
        if (!encontrado) {
            System.out.println("El número ingresado no se encuentra en el conjunto de números aleatorios.");
            

        }

    }
}
