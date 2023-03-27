/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt3_ejerc10_for;

import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class Gt3_Ejerc10_For {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        /*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
         e imprima el número ingresado seguido de tantos asteriscos como indique su valor.*/

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 4 números entre 1 y 20:");

        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int num3 = leer.nextInt();
        int num4 = leer.nextInt();

        if (num1 <= 20) {
            System.out.print(num1);
            for (int i = 0; i < num1; i++) {
                System.out.print("*");
            }
        } else {
            System.out.print("El numero ingresado es incorrecto");

        }
        System.out.println(" ");

        if (num2 <= 20) {
            System.out.print(num2);
            for (int i = 0; i < num2; i++) {
                System.out.print("*");
            }
        } else {
            System.out.print("El numero ingresado es incorrecto");

        }
        System.out.println(" ");

        if (num3 <= 20) {
            System.out.print(num3);
            for (int i = 0; i < num3; i++) {
                System.out.print("*");
            }
        } else {
            System.out.print("El numero ingresado es incorrecto");

        }
        System.out.println(" ");
        
        if (num4<=20) {
         System.out.print(num4);
        for (int i = 0; i < num4; i++) {
            System.out.print("*");
        }
                }else {
        System.out.print("El numero ingresado es incorrecto");
 
 
    } System.out.println(" ");

    }

}
