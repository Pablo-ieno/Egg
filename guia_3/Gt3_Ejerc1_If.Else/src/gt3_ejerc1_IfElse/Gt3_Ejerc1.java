/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt3_ejerc1_IfElse;

import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class Gt3_Ejerc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int num3 = 25;

        if (num1 > num3 && num2 > num3) {
            System.out.println("Ambos números son mayores a " + num3);
        } else if (num1 > num3 && num2 <= num3) {
            System.out.println("El primer número es mayor a " + num3);
        } else if (num1<=num3 && num2>num3){
            System.out.println("El segundo número es mayor a "+ num3);
        } else {System.out.println("Ninguno de los dos números es mayor a "+ num3);
        }
    }
}

