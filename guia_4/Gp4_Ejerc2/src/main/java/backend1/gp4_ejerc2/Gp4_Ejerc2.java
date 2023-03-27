/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package backend1.gp4_ejerc2;

import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class Gp4_Ejerc2 {

    public static void main(String[] args) {
        /*Diseñe una función que pida el nombre y la edad de N personas e imprima los datos 
          de las personas ingresadas por teclado e indique si son mayores o menores de edad. 
          Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
          mostrando personas y frenar cuando el usuario ingrese la palabra “No”.*/

        Scanner leer = new Scanner(System.in);
        String op;

        do {
            calculo();
            System.out.println("Desea continuar? S/N");
            op = leer.nextLine();
        } while (op.equalsIgnoreCase("S"));
        {

        }

    }

    public static void calculo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su Nombre");
        String nombre = leer.nextLine();
        System.out.println("Ingrese su Edad");
        int edad = leer.nextInt();

        if (edad >= 18) {
            System.out.println(nombre + " de " + edad + " años");
            System.out.println("Es mayor de edad");
        } else {
            System.out.println(nombre + " de " + edad + " años");
            System.out.println("Es menor de edad");

        }

    }

}
