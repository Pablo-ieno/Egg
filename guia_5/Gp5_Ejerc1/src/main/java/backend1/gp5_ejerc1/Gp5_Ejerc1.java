/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package backend1.gp5_ejerc1;

//import java.util.Scanner;
/**
 *
 * @author iptal
 */
public class Gp5_Ejerc1 {

    public static void main(String[] args) {
        /*Realizar un algoritmo que llene un vector con los 100 primeros números enteros y 
          los muestre por pantalla en orden descendente.*/

        
        int vector[] = new int[100];
        for (int i = 0 ; i < 100; i++) {
            vector[i] = i;
        }
        for (int i = 99; i >-1; i--) {
            System.out.print("[" + vector[i] + "]");
          
         

        }

    }

}

//OTRA FORMA DE IMPRIMIR LOS ELEMENTOS DEL VECTOR EN FORMA DESCENDENTE//
              
             /*for (int i = 0 ; i < 100; i++) {
              System.out.print("[" + vector[vector.length-1-i] + "]");*/