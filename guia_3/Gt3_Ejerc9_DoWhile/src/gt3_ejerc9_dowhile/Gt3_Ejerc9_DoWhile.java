/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
<<<<<<<< HEAD:Gt3_Ejerc9_DoWhile/src/gt3_ejerc9_dowhile/Gt3_Ejerc9_DoWhile.java
package gt3_ejerc9_dowhile;
========
package egg.backend1.gt3_ejerc9_dowhile;
>>>>>>>> 8b1e13eb81d846131583e8cd490e3a774ca2cbe1:Gt3_Ejerc9_DoWhile/src/main/java/egg/backend1/gt3_ejerc9_dowhile/Gt3_Ejerc9_DoWhile.java

import java.util.Scanner;

/**
 *
 * @author iz-living
 */
public class Gt3_Ejerc9_DoWhile {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
<<<<<<<< HEAD:Gt3_Ejerc9_DoWhile/src/gt3_ejerc9_dowhile/Gt3_Ejerc9_DoWhile.java
        Scanner leer = new Scanner(System.in);

        int num, suma = 0, cont = 0;
========
        /* Escriba un programa que lea 20 números. Si el número leído es igual a cero 
          se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".  
          El programa deberá calcular y mostrar el resultado de la suma de los números leídos, 
          pero si el número es negativo no debe sumarse. Nota: recordar 
          el uso de la sentencia break.*/
        
        Scanner leer = new Scanner (System.in);
               

        int num;
        int suma = 0;
        int cont = 0;
>>>>>>>> 8b1e13eb81d846131583e8cd490e3a774ca2cbe1:Gt3_Ejerc9_DoWhile/src/main/java/egg/backend1/gt3_ejerc9_dowhile/Gt3_Ejerc9_DoWhile.java

        do {
            System.out.println("Ingrese un número: ");
            num = leer.nextInt();
            if (num < 0) {
                cont++;
            } else {
                suma = suma + num;
                cont++;

            }
<<<<<<<< HEAD:Gt3_Ejerc9_DoWhile/src/gt3_ejerc9_dowhile/Gt3_Ejerc9_DoWhile.java
        }while ((num != 0) && (cont < 5));
            System.out.println("Se capturó el numero cero");
            System.out.println("La suma de los números ingresados es: " + suma);
    }
    
}
========
        }
            while ((num != 0) && (cont < 5));
            {System.out.println("Se capturó el numero cero");
                System.out.println("La suma de los números ingresados es: " + suma);
        }
    }
}

        

        


        
>>>>>>>> 8b1e13eb81d846131583e8cd490e3a774ca2cbe1:Gt3_Ejerc9_DoWhile/src/main/java/egg/backend1/gt3_ejerc9_dowhile/Gt3_Ejerc9_DoWhile.java
