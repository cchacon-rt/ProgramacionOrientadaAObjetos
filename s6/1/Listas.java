import java.util.ArrayList;

public class Listas{
    public static void main (String [] args){
        ArrayList<String> lista = new ArrayList<>(); //creando lista de cadenas 

        System.out.println("Agregando elementos a la lista...");
        lista.add("Pepe");
        lista.add("Pica");
        lista.add("Papas");

        System.out.println("Imprimir lista...");
        System.out.println(lista.toString()); //imprimir lista

        System.out.println("Eliminando Pica...");
        System.out.println(lista.remove("Pica")); //este metodo devuelve true or false
    
        System.out.println("Re imprimir");
        System.out.println(lista.toString()); //imprimir lista

        System.out.println("Insertar elemento en x posición");
        lista.add(1, "Bailador"); //recibe index en el que se va a insertar y el elemento
        System.out.println(lista.toString()); //imprimir lista

        System.out.println("Tamaño de lista: ");
        System.out.println(lista.size()); //integer size of list

        System.out.println("Get the element of index in position 2: ");
        System.out.print(lista.get(2)); //returns the element in that index 

        System.out.println("Colocar apodo en el index 0");
        lista.set(0,"Pepito"); //este suplanta el valor
        System.out.println(lista.toString()); //imprimir lista

        System.out.println("Existe en la lista 'Escudero?");
        System.out.println(lista.contains("Escudero"));

        System.out.println("Existe en la lista 'Papas?");
        System.out.println(lista.contains("Papas"));

        System.out.println("En qué index está Pepito?");
        System.out.println(lista.indexOf("Pepito")); //index of that

        System.out.println("la lista está vacía: " + lista.isEmpty()); //dice si está o no vacía

        lista.clear(); //Elimina todos los elementos de la lista
        System.out.println("Eliminando todos los elementos.");

        System.out.println("la lista está vacía: " + lista.isEmpty()); //dice si está o no vacía



    }
}