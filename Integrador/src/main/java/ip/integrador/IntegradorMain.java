/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ip.integrador;

import Entidades.Estudiante;
import Servicios.EstudianteService;

/**
 *
 * @author iptal
 */
public class IntegradorMain {

    public static void main(String[] args) {
        
        
        EstudianteService estSer = new EstudianteService();
//        Estudiante estEnt = estSer.crearEstudiantes(Estudiante estudiantes);
        estSer.crearEstudiantes();
        Estudiante estudiantes = null;
        estSer.promedio(estudiantes);
        
        
        
       
        
        
    }
    
}
