/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc5;

import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class Ejerc5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que lea un número entero por teclado 
y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().*/

        Scanner teclado = new Scanner(System.in); //iniciamos scanner
        int num1; //creamos variable tipo entero
        
        System.out.println("Introducir numero entero");
        num1=teclado.nextInt(); //leemos entero introducido y lo asignamos a num1
        
        //mostramos por pantalla el doble del numero
        System.out.println(" El doble del numero " + num1 + " es : " + (num1*2));
        
        //mostramos por pantalla el triple del numero
        System.out.println("El triple del numero " + num1 + " es : " + (num1*3));
        
        //mostramos por pantalla la raíz cuadrada del numero
        System.out.println("La Raiz cuadrada del numero " + num1 + " es : " + Math.sqrt(num1) );
    }
    
}
