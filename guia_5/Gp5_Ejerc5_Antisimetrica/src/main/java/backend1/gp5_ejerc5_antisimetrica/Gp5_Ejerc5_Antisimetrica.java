/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package backend1.gp5_ejerc5_antisimetrica;

import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class Gp5_Ejerc5_Antisimetrica {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dimension de la matriz");
        int n = leer.nextInt();
        while (n < 1) {
            System.out.println("ERROR! Ingrese dimension positiva");
            n = leer.nextInt();
        }

        int[][] matriz = new int[n][n];
        cargar(matriz);
        comprobar(matriz);
        mostrar(matriz);
    }

    public static void cargar(int[][] matriz) {
        Scanner leer = new Scanner(System.in);
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
                System.out.printf("Ingrese valor en la posicion [%d][%d]", f, c);
                matriz[f][c] = leer.nextInt();
            }
        }
    }

    public static void comprobar(int[][] matriz) {
        boolean valid = false;

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
                if (matriz[f][c] == -matriz[c][f]) {
                    valid = true;
                }
            }
        }
        if (valid) {
            System.out.println("La matriz es Antisimetrica");
        } else {
            System.out.println("La matriz NO es Antisimetrica");
        }
    }

    public static void mostrar(int[][] matriz) {
        System.out.println("Matriz Cargada");
        for (int f = 0; f < matriz.length; f++) {

            for (int c = 0; c < matriz.length; c++) {
                System.out.print("[" + matriz[f][c] + "]");
            }
            System.out.println(" ");
        }

        System.out.println("Transpuesta de la Matriz cargada");
        for (int f = 0; f < matriz.length; f++) {

            for (int c = 0; c < matriz.length; c++) {
                System.out.print("[" + matriz[c][f] + "]");
            }
            System.out.println(" ");
        }
    }
}
