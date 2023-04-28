import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
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


        numerosA.add(x);//Se agrega el nro. 20 a la lista, en la posicion 0
        numerosA.add(n2);
        numerosA.add(n3);
        numerosA.add(n4);
        numerosA.add(n5);
        numerosA.add(n6);
        System.out.println();

        System.out.println("Agregados " + numerosA);
        Collections.sort(numerosA);// Ordenamiento de la colección con Collection.sort
        System.out.println("Coleccion ordenada " + numerosA);
        System.out.println();
        //Utilizando remove(int indice)
        numerosA.remove(2); //Se elimina la posición 3 = n3 o 49
        System.out.println("Sacados " + numerosA);
        System.out.println();
        // numerosA.remove(n6);
        for (Integer lista : numerosA)
            System.out.println(lista);

        Iterator iterato1r = numerosA.iterator();
        System.out.println("Elementos de la lista: ");
        while (iterato1r.hasNext()) {
            System.out.println(iterato1r.next() + "");

           /* Iterator iterator = numerosA.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().equals(-10)) {
                    iterator.remove();
                    System.out.println("Borrado por Iterator " + numerosA);*/
        }


        System.out.println();


        //CONJUNTOS:
        HashSet<Integer> numerosB1 = new HashSet<>();
        Integer y = 30;//Se agrega como Integer porque es un conjunto de enteros.
        Integer nb2 = 57;
        Integer nb3 = 59;
        Integer nb4 = 26;
        Integer nb5 = 19;
        Integer nb6 = 10;

        numerosB1.add(y);
        numerosB1.add(nb2);
        numerosB1.add(nb3);
        numerosB1.add(nb4);
        numerosB1.add(nb5);
        numerosB1.add(nb6);

        System.out.println("NumerosB1 " + numerosB1);
        numerosB1.remove(57);//Se elimina el elemento 47 que es = nb2
        System.out.println("NumerosB1 " + numerosB1);
        System.out.println();
        System.out.println("Lista");
        // Se recorre la colección con un forEach, donde se asigna un objeto vacío "num" en este caso,
        //que va a recibir los datos de la colección y después al llamarla se muestran por pantalla.
        for (Integer num : numerosB1) {
            System.out.println(num);
        }
        /*Para ordenar comjuntos[Sets en ingles] (como también mapas [Maps], primero hay que convertir*/
        ArrayList<Integer> listaConjuto = new ArrayList<>(numerosB1);
        Collections.sort(listaConjuto);
        {
            System.out.println("Conjunto ordenado");
            System.out.println(listaConjuto);
          /*  TreeSet arbolConjunto= new TreeSet<>(numerosB1);
            System.out.println("Conjunto ordenado por TreeSet ");
            System.out.println(numerosB1);*/


        }
        System.out.println();

       /* Iterator<Integer> iterator2 = numerosB1.iterator();
        System.out.println("Lista Iterator");
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());*/

        Iterator<Integer> iterator2 = numerosB1.iterator();
        // System.out.println("Lista Iterator");
        while (iterator2.hasNext()) {
            if (iterator2.next()==19) {
                iterator2.remove();
            }

        }
        System.out.println("Removido por Iterator " + numerosB1);


        System.out.println();


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
        System.out.println();
        for (Map.Entry<Integer, String> entrada : alumnosA.entrySet()) {
            System.out.println("dni= " + entrada.getKey() + ", nombre " + entrada.getValue());
        }
        System.out.println();

        for (Integer documento : alumnosA.keySet()) {
            System.out.println("dni: " + documento);

        }
        System.out.println();
        for (String nombres : alumnosA.values()) {
            System.out.println(nombres);

        }
        Iterator<Map.Entry<Integer, String>> iterator = alumnosA.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entrada1 = iterator.next();

            System.out.println("DNI " + entrada1.getKey() + " NOMBRE: " + entrada1.getValue());
        }
        TreeMap<Integer, String> mapaArbol = new TreeMap<>(alumnosA);
        System.out.println("Mapa ordenado" + mapaArbol);


    }
}




