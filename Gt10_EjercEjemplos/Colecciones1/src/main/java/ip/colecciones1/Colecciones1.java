/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ip.colecciones1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author iptal
 */
public class Colecciones1 {

    public static void main(String[] args) {

        /*--------------CREACIÓN DE COLECCIONES------------------*/
// LISTAS:
        //Ejemplo de un ArrayList de números:
        //ArrayList<Integer> numerosA = new ArrayList<>();

        //Ejemplo de una LinkedList de numeros:
        //LinkedList<Integer> numerosB = new LinkedList<>();

// CONJUNTOS:
        // Ejemplo de un HashSet de cadenas:
       // HashSet<String> nombres = new HashSet<>();

        // Ejemplo de un TreeSet de números:
        //TreeSet<Integer> numeros = new TreeSet<>();

        // Ejemplo de un LinkedHashSet de cadenas:
        //LinkedHashSet<String> frases = new LinkedHashSet<>();

// MAPAS:
        // Ejemplo de un HashMap de personas:
        //HashMap<Llave, Valor> identificador = new HashMap();
        //HashMap<Integer, String> personasA = new HashMap<>();

        // Ejemplo de un treeMap de personas:
        //TreeMap<Integer, String> personasB = new TreeMap<>();

        // Ejemplo de un LinkedHashMap de personas:
        //LinkedHashMap<Integer, String> personasC = new LinkedHashMap<>();

        /* ------------------------Detección de errores ------------------------*/
        //ArrayL<int> listado = new ArrayList;
        //ArrayList<Integer> listado = new ArrayList<>();
        //TreeSet<String> =TreeSet();
        //TreeSet<String> listado1 = new TreeSet<>();
        //HashMap<Integer> personas = new HashMap<>;
        //HashMap<Integer, String> personas = new HashMap<>();

        /*AGREGAR, ELIMINAR, RECORRER ELEMENTOS DE UNA COLECCION*/
 
        //LISTAS:
        ArrayList<Integer> numerosA = new ArrayList<>();//Lista de tipo Integer
        int x = 20;
        int n2 = 47;
        int n3 = 49;
        int n4 = 16;
        int n5 = 9;
        int n6 = -10;
      

        numerosA.add(x);//Se agrega el nro 20 a la lista, en la posicion 0
        numerosA.add(n2);
        numerosA.add(n3);
        numerosA.add(n4);
        numerosA.add(n5);
        numerosA.add(n6);
        
        System.out.println("Agregados "+numerosA);
        //Utilizando remove(int indice)
        numerosA.remove(2); //Se elimina la posición 3 = n3 o 49
        System.out.println("Sacados "+numerosA);
        for (Integer lista : numerosA) {
            System.out.println(lista);
            
        }
        

        //CONJUNTOS:
        HashSet<Integer> numerosB1 = new HashSet<>();
        Integer y = 20;//Se agrega como Integer porque es un conjunto de enteros.
        Integer nb2 = 47;
        Integer nb3 = 49;
        Integer nb4 = 16;
        Integer nb5 = 9;
        Integer nb6 = 10;

        numerosB1.add(y);
        numerosB1.add(nb2);
        numerosB1.add(nb3);
        numerosB1.add(nb4);
        numerosB1.add(nb5);
        numerosB1.add(nb6);
        System.out.println(numerosB1);
        numerosB1.remove(47);//Se elimina el elemento 47 que es = nb2
        System.out.println(numerosB1);

        //MAPAS:
        HashMap<Integer, String> alumnosA = new HashMap<>();
        int dni = 23556984;
        String nombre = "Pablo";
        int dni1 = 24744568;
        String nombre1 = "Jessi";
        int dni2 = 474943654;
        String nombre2 = "Juli";
        int dni3 = 547758964;
        String nombre3 = "Sofi";

        alumnosA.put(dni, nombre);
        alumnosA.put(dni1, nombre1);
        alumnosA.put(dni2, nombre2);
        alumnosA.put(dni3, nombre3);

        System.out.println(alumnosA);
        alumnosA.remove(23556984);
        System.out.println(alumnosA);

        
    }
}
