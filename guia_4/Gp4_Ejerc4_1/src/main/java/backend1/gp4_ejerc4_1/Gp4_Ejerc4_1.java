/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package backend1.gp4_ejerc4_1;

import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class Gp4_Ejerc4_1 {

    public static void main(String[] args) {
         Scanner read = new Scanner (System.in);
        System.out.println("ingrese el valor");
        int num1 = read.nextInt();

        numeroPrimo (num1);
        if (numeroPrimo(num1)){
           System.out.println("El numero es primo");
        } 
        else {
            System.out.println("El numero no es primo"); 
                            }
        }
            
    public static boolean numeroPrimo (int num1){
        
        for (int i = 2 ; i <= Math.sqrt(num1) ; i++){
            if (num1%i==0){
                return  false; 
            }
        }
         return true; 
    }      
    }




