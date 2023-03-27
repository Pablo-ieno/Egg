/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gp3_ejerc3;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.ArrayBufferView.length;

/**
 *
 * @author iptal
 */
public class Gp3_Ejerc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
        Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje 
        por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
        Nota: investigar la función Lenght() en Java.*/

        Scanner leer = new Scanner(System.in);
        String frase1;
               
        System.out.println("Ingrese una frase o palabra de 8 caracteres");
        frase1 = leer.nextLine();
        
        if (frase1.length()== 8)
        {System.out.println("CORRECTO!!!");
        
        }else{System.out.println("INCORRECTO!!!");
        
        
        }
    
}
}
