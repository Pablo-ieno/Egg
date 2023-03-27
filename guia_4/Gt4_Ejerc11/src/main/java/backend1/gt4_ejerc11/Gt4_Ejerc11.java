/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package backend1.gt4_ejerc11;

import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class Gt4_Ejerc11 {

    public static void main(String[] args) {
        /*Escribir un programa que procese una secuencia de caracteres ingresada por teclado 
y terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: 
cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres 
(incluyendo a las vocales acentuadas) se mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. 
Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.*/

         Scanner leer = new Scanner(System.in);
    String var1 = "";
    boolean bol1 = false;
         do {
             String var4 = leer.nextLine();
             var1 = var1.concat(var4);
             bol1 = var1.endsWith(".");
         } while(bol1 != true);

    
         System.out.println("lo que se armo " + var1);
         
         String resultado = cambio(var1);
         System.out.println("Resultado "+resultado);
    
    
    
    
    
}
     private static String cambio(String var1){
     String var3 = "";
         for (int i = 0; i < var1.length(); i++) {
         char var2 = var1.charAt(i);
            
             switch (var2){
                 case 'a':
                     var2 = '@';
                     break;
                 case 'e':
                     var2 = '#';
                     break;    
                 case 'i':
                     var2 = '$';
                     break;    
                 case 'o':
                     var2 = '%';
                     break;    
                 case 'u':
                     var2 = '*';
                     break;    
            
        }
            var3 = var3.concat(String.valueOf(var2));
        }
         return "Codificado "+var3;
     }
     
}
     

