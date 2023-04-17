/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class Libro {
    Scanner leer = new Scanner(System.in);

    //Atributos.-
    public int ISBN;
    public String titulo;
    public String autor;
    public int numPaginas;

    // Constructor Vacio.- 
    public Libro() {
    }

    // Constructor Parametrizado.-
    public Libro(int ISBN, String titulo, String autor, int numPaginas) {

        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;

        this.numPaginas = numPaginas;
    }

    //Creación del Método para cargar un libro.-
    public void llenarLibro(int ISBN, String titulo, String autor, int numPaginas) {
        

        System.out.print("Ingrese el nro de ISBN del libro: ");
//        ISBN = leer.nextInt();

        System.out.println("Ingrese el título del libro: ");
        /*leer.nextLine();*//*ingresar un leer.nextLine si antes se leyó
        un leer.nextInt() o leer.nextFloat() URL de la explicación práctica:
        https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?codigo=86&punto=&inicio=*/
//        this.titulo = leer.nextLine();

        System.out.print("Ingrese el nombre del autor del libro: ");
//        this.autor = leer.nextLine();

        System.out.print("Ingrese la cantidad de páginas del libro: ");
//        numPaginas = leer.nextInt();

// Se usa el this para diferenciar variable de atributo, ya que tienen el mismo nombre.-
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    //Mostrar Libro mediante un metodo.-
    public void mostrarLibro() {

        System.out.println("El ISBN es: " + ISBN);
        System.out.println("El Título del libro es: " + titulo);
        System.out.println("El autor del libro es: " + autor);
        System.out.println("El numero de págunas del libro es: " + numPaginas);

    }
}
