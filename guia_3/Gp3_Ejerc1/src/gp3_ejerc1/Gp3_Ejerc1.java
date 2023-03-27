/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gp3_ejerc1;

import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class Gp3_Ejerc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crear un programa que dado un número determine si es par o impar.*/

        Scanner leer = new Scanner(System.in);

        int num;
        System.out.print("Ingrese un número: ");
        num = leer.nextInt();

        if (num % 2 == 0) {
            System.out.println("El " + num + " es un número par");

        } else {
            System.out.println("El " + num + " es un número impar");
        }

    }

}
