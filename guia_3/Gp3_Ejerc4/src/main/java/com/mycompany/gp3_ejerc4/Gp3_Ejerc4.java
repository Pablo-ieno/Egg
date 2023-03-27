/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gp3_ejerc4;

import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class Gp3_Ejerc4 {

    public static void main(String[] args) {
        /*Escriba un programa que pida una frase o palabra y valide si la primera 
          letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá 
          de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, 
          se deberá imprimir “INCORRECTO”. 
          Nota: investigar la función Substring y equals() de Java.*/

        Scanner leer = new Scanner(System.in);

        String frase;
        System.out.print("Ingrese una frase que comience con A: ");
        frase = leer.nextLine();
        
               String caractA = frase.substring(0,1);
               System.out.println("La primer letra de la frase es: " +caractA);
               if (caractA.equalsIgnoreCase("a")){
                   System.out.println("CORRECTO");
                   
               }else{System.out.println("INCORRECTO");
                       }
               
               
        
        

    }
}
