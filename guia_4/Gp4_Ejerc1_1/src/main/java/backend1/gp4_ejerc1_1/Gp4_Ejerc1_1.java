/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package backend1.gp4_ejerc1_1;

import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class Gp4_Ejerc1_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos números");
        double num1 = leer.nextDouble(), num2 = leer.nextDouble();

        System.out.println("Elija una operación a realizar");
        System.out.println("1-SUMAR");
        System.out.println("2-RESTAR");
        System.out.println("3-MULTIPLICAR");
        System.out.println("4-DIVIDIR");

        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                double retorno = sumar(num1, num2);
                System.out.println("La suma es " + retorno);
                break;

            case 2:
                retorno = restar(num1, num2);
                System.out.println("La suma es " + retorno);
                break;
            case 3:
                retorno = multiplicar(num1, num2);
                System.out.println("La multiplicación es " + retorno);
                break;
            case 4:
                retorno = division(num1, num2);
                System.out.println("La division es " + retorno);
                break;
                    

            default:
                throw new AssertionError();
        }
    }

    public static double sumar(double num1, double num2) {
        double suma;
        suma = num1 + num2;
        return suma;
    }

    public static double restar(double num1, double num2) {
        double resta;
        resta = num1 - num2;
        return resta;
    }
    public static double multiplicar(double num1, double num2) {
        double multiplica;
        multiplica = num1 * num2;
        return multiplica;
    }
    public static double division(double num1, double num2) {
        double divide;
        divide = num1 / num2;
        return divide;
    }
    
    
}
