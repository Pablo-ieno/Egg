/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package backend1.gp4_ejerc4;

import java.util.Scanner;

public class Gp4_Ejerc4 {

    public static void main(String[] args) {
        /*Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos 
    por parámetro para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
    Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, 
    ya que 25 es divisible entre 5, sin embargo, 17 si es primo.*/

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número para determinar si es nro primo");
        int numP = leer.nextInt();

        numeroPrimo(numP);
        if (numeroPrimo(numP)) {
            System.out.println("El número es primo");
        } else {
            System.out.println("El número no es primo");
        }
    }
    public static boolean numeroPrimo (int numP) {

   for (int i = 2; i <= Math.sqrt(numP); i++) {
                if (numP%i==0) {
            return false;
}
}
        return true;
    
    
    }
}

    