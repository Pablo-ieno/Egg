/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ip.gp3_ejerc8;

import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class Gp3_Ejerc8 {

    public static void main(String[] args) {
        /*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
*/
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el ancho: ");
        int ancho=leer.nextInt();
        
        System.out.print("Ingrese el alto: ");
        int alto = leer.nextInt();
        
        for (int fila = 1; fila <= alto; fila++) {
            for (int columna = 1; columna <= ancho; columna++){
                if ((fila == 1) || (fila == alto) 
                        || (columna == 1) || (columna == ancho))
                    System.out.print("*");
                else
                    System.out.print(" ");
                            }
            System.out.println("");
            
        }

    }
}
