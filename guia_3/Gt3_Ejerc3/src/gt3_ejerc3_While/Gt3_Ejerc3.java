/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt3_ejerc3_While;

import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class Gt3_Ejerc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa que valide si una nota está entre 0 y 10, 
        sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.*/

        Scanner leer = new Scanner(System.in);

        int numero;
        System.out.println("Ingrese una nota entre 0 y 10");
        numero = leer.nextInt();

        while (numero < 0 || numero > 10) {
            System.out.println("El número ingresado está fuera de rango, ingrese nuevamente un número");
            numero = leer.nextInt();
        }
        System.out.println("La nota ingresada es " + numero);

    }

}
