/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package backend1.gp5_ejer4_matriztranspuesta;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class Gp5_Ejer4_MatrizTranspuesta {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random aleat = new Random();

        //Creacion de matrices "Original y Transpuesta"
        int[][] matriz = new int[4][4];
        int[][] matrizT = new int[4][4];

        //Asignacion de valores aleatorios a la matriz original
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = aleat.nextInt(99 - 1 + 1) + 1;
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println();

        }
        System.out.println();

        //Transposicion de matriz Original
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizT[j][i] = matriz[i][j];
                System.out.print("|" + matriz[j][i] + "|");

            }
            System.out.println();

        }
        System.out.println();
        
    }

}
