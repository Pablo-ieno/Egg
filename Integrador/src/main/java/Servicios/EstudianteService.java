/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Estudiante;
import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class EstudianteService {

    Scanner leer = new Scanner(System.in);
    Estudiante[] estudiantes = new Estudiante[8];

    //Método creación de Estudiantes.- y llenado de Arreglo.-
    public void crearEstudiantes() {
        
        estudiantes[0] = new Estudiante("Juan", 7.5);
        estudiantes[1] = new Estudiante("María", 8.3);
        estudiantes[2] = new Estudiante("Pedro", 6.9);
        estudiantes[3] = new Estudiante("Ana", 9.2);
        estudiantes[4] = new Estudiante("Luis", 5.6);
        estudiantes[5] = new Estudiante("Lucía", 7.8);
        estudiantes[6] = new Estudiante("José", 8.1);
        estudiantes[7] = new Estudiante("Marta", 6.7);

    }
    
    public double promedio(Estudiante estudiantes){
       double suma=0;
        for (int i = 0; i < this.estudiantes.length; i++) {
           suma += estudiantes.getNota();
            System.out.println(suma);
        }
        
        double promedio = suma/this.estudiantes.length;
        
        return promedio;
    }
}

