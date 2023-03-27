/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package egg.backend1.gp7_ejerc01;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author iz-living
 */
public class Gp7_Ejerc01 {

    public static void main(String[] args) {
 /* Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
 Autor, Número de páginas, y un constructor con todos los atributos pasados por parámetro 
 y un constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario 
 y luego informar mediante otro método el número de ISBN, el título, el autor del libro 
 y el número de páginas.*/
 
 
 Libro L1 = new Libro();
 
 Scanner leer = new Scanner(System.in);
 
        System.out.print("Ingrese el nro de ISBN del libro: ");
        int ISBN = leer.nextInt();
        
        System.out.print("Ingrese el título del libro: ");
        leer.nextLine();/*ingresar un leer.nextLine si antes se leyó 
        un leer.nextInt() o leer.nextFloat() URL de la explicación práctica:
        https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?codigo=86&punto=&inicio=*/
        String titulo = leer.nextLine();
        
        System.out.print("Ingrese el nombre del autor del libro: ");
        String autor=leer.nextLine();
        
        System.out.print("Ingrese la cantidad de páginas del libro: ");
        int numPaginas = leer.nextInt();
        
        System.out.println();
        
        //Llamado del Método para cargar los datos del libro.-
        L1.llenarLibro(ISBN, titulo, autor, numPaginas);
        
        //Llamado del Método para mostrar los datos cargados.-
        L1.mostrarLibro();      
 
 
    }
}
