
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Clase4Guia2Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); //importamos funcion scanner
        
        int num1; //definimos variables tipo entero
        int suma1=0;
        int contador=0;

    do{ //creamos un bucle para hacer la introduccion de los 20 numeros
        System.out.println(" Introducir un numero ");
        num1=leer.nextInt();
        if(num1<0){ //creamos una condicion, si el numero es negativo, no se suma, pero el contador aumenta
        contador++;
        }else{ //si el numero es positivo, si se suma, a la vez que el contador aumenta
        suma1=suma1+num1;
        contador++;}
        
    }while((num1!=0)&&(contador<20)); // se hará el bucle mientas num1 sea distinto a 0, y el contador no supere las 20 veces
        
   if(num1==0){
   System.out.println("Se capturo el numero 0");   //si el numero es = 0 se sale del bucle y se muestra el siguiente mensaje
   }else{
   System.out.println("La suma de los numeros ingresados es : " + suma1);} //si el contador es mayor a 20 se sale del bucle y se muestra la suma de los numeros ingresados
    
    }
    
}
