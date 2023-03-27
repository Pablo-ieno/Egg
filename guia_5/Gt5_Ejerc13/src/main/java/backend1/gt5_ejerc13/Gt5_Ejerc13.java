/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package backend1.gt5_ejerc13;

import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class Gt5_Ejerc13 {

    public static void main(String[] args) {
        /*Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo 
         y define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.*/

        Scanner leer = new Scanner(System.in);

        String equipo[] = new String[3];
        //Otra forma de darle longitud ya con los datos de cada subindice
        /*String equipo[] = {"juan", "pablo", "esteban"};
        for (int i = 0; i < equipo.length; i++) {
            System.out.println("[" + equipo[i] + "]");*/

        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese los nombres del equipo");
            equipo[i] = leer.next();
        }
        System.out.println("Los nombres son los siguientes: ");
        for (int i = 0; i < 3; i++) {
            System.out.print("[" + equipo[i] + "]");

        }
    }

