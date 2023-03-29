/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package backend1.gp5extra_ejerc4;

/**
 *
 * @author iptal
 */
public class Gp5Extra_Ejerc4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double tp1, tp2, int1, int2;
        int alumnos = 0;
        double promedio = 0;
        int aprobados = 0, desaprobados = 0;
        int vector[] = new int[3];
        do {
            System.out.println("ingrese nota 1er TP");
            tp1 = leer.nextDouble();
            System.out.println("ingrese nota 2do TP");
            tp2 = leer.nextDouble();
            System.out.println("ingrese nota 1er Integrador");
            int1 = leer.nextDouble();
            System.out.println("ingrese nota 2do Integrador");
            int2 = leer.nextDouble();

            tp1 = tp1 * 0.1;
            tp2 = tp2 * 0.15;
            int1 = int1 * 0.25;
            int2 = int2 * 0.50;
             promedio = tp1 + tp2 + int1 + int2;
            
            
             alumnos++;
            for (int i = 0; i <vector.length; i++) {
                
            }
            System.out.println(" ");
            System.out.println(promedio);
            System.out.println(" ");

            if (promedio > 7) {
                aprobados++;

            } else {
                desaprobados++;
            }
            
         

        } while (alumnos < 3);

        for (int i = 0; i < vector.length; i++) {
            System.out.println("[" + vector[i] + "]");

        }
        System.out.println(
                "la cantidad de aprobados " + aprobados);
        System.out.println(
                "la cantidad de desaprobados " + desaprobados);
    }