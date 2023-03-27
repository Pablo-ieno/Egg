/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package backend1.gp5_ejerc5_matrizasimetrica;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class Gp5_Ejerc5_MatrizAsimetrica {

    public static void main(String[] args) {
        /*Realice un programa que compruebe si una matriz dada es antisimétrica. 
        Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
        pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta 
        de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/
        
        Scanner leer = new Scanner(System.in);
        Random aleat = new Random();

        //Creacion de matrices "Original y Transpuesta"
        int[][] matriz = new int[4][4];
        
        int[][] matrizN = new int [4][4];

        //Asignacion de valores aleatorios a la matriz original
        System.out.println("Matriz Original");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = aleat.nextInt(99 - 1 + 1) + 1;
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println();

        }
        System.out.println();

        //Transposicion de matriz Original
        int[][] matrizT = new int[4][4];
        System.out.println("Matriz Transpuesta");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizT[j][i] == matriz[i][j];
                System.out.print("|" + matriz[j][i] + "|");

            }
            System.out.println();

        }
        System.out.println();
        
        //Se pasa a negativa la 
        System.out.println("Matriz inversa o negativa");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizN[i][j]== -matriz[i][j];
                System.out.print("|" + matrizN[i][j] + "|");
                
            }
            System.out.println();
            
        }
        
    }

}
