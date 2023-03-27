/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package backend1.gp5_ejerc3;

import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class Gp5_Ejerc3 {

    public static void main(String[] args) {
        /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
         cuántos de 2 dígitos, etcétera (hasta 5 dígitos).*/

        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        int aux1 = 0;
        int aux2 = 0;
        int aux3 = 0;
        int aux4 = 0;
        int aux5 = 0;

        System.out.println("Ingrese el tamaño del vector");
        int[] vector = new int[leer.nextInt()];
        for (int i = 0; i < vector.length; i++) {
            opcion=0;
            System.out.println("Ingrese los valores para " + i + " de hasta 5 dígitos");
            vector[i] = leer.nextInt();
            int num = vector[i];
        

        while (num > 0) {
            num = num / 10;
            opcion++;
        }
        switch (opcion) {
            case 1:
                aux1++;
                break;
            case 2:
                aux2++;
                break;
            case 3:
                aux3++;
                break;
            case 4:
                aux4++;
                break;
            case 5:
                aux5++;
                break;
            default:
                throw new AssertionError();

        }
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println("[" + vector[i] + "]");

        }
        System.out.println("1 digito " + aux1);
        System.out.println("2 digito " + aux2);
        System.out.println("3 digito " + aux3);
        System.out.println("4 digito " + aux4);
        System.out.println("5 digito " + aux5);
        

    }

}



