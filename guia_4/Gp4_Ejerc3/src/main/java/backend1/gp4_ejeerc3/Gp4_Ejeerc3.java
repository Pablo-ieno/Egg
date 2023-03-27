/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package backend1.gp4_ejeerc3;

import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class Gp4_Ejeerc3 {

    public static void main(String[] args) {
     /*Crea una aplicación que a través de una función nos convierta una cantidad de euros 
       introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
       La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena, 
       este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
       El cambio de divisas es:
       * 0.86 libras es un 1 €
       * 1.28611 $ es un 1 €
       * 129.852 yenes es un 1 €*/
     
     Scanner leer = new Scanner(System.in);
     
     float cantEuros;
     int moneda;
        System.out.println("Ingrese el tipo de moneda por la que desea cambiar");
        System.out.println("1 - Libras");
        System.out.println("2 - Dolar");
        System.out.println("3 - Yen");
        moneda=leer.nextInt();
        System.out.println("Ingrese la cantidad de Euros que desea cambiar");
        cantEuros=leer.nextFloat();
             
        //System.out.println("El cambio a " );
        conversor(moneda, cantEuros);

    }
    public static void conversor(int tipoMoneda, float cantEuros) {
        
        switch (tipoMoneda) {
            case 1:
                System.out.println("El equivalente en Libras es " + (cantEuros * 0.86));
                break;
            case 2:
                System.out.println("El equivalente en Dolares es " + (cantEuros * 1.28611));
                break;
            case 3:
            System.out.println("El equivalente en Yens es " + (cantEuros * 129.852));

            break;
                   
               default:
                throw new AssertionError();
        }
        
    }
}

  