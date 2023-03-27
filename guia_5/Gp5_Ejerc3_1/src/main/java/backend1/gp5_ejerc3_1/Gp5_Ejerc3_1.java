/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package backend1.gp5_ejerc3_1;

import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class Gp5_Ejerc3_1 {

    public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);

        /*int aux1 = 0;
        int aux2 = 0;
        int aux3 = 0;
        int aux4 = 0;
        int aux5 = 0;*/
        System.out.println("Ingrese el tamaño del vector");
        int N = leer.nextInt();
        int[] vector = new int[N];
        int[] vectorD = new int[5];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el valor " + (i + 1) + " pueden ser numeros de hasta 5 digitos");
            vector[i] = leer.nextInt();
            int digitos = contarDigitos(vector[i]);
            if (digitos >= 1 && digitos <= 5) {
                vectorD[digitos-1]++;
            } 
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println("|" + vector[i] + "|");
        }
        //System.out.println("Vector con cantidad de digitos");
        for (int i = 0; i < 5; i++) {
            System.out.println("Cantidad de números con " +(i + 1)+ " es: " +vectorD[i]);
            
        }
    }
    
    

    public static int contarDigitos(int num) {
        int contador = 0;
        while (num > 0) {
            num = num / 10;
            contador++;
        }
        return contador;
    }
}
