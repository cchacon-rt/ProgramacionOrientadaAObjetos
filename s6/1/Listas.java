import java.util.ArrayList;

public class Listas{
    public static void main (String [] args){
        ArrayList<String> lista = new ArrayList<>(); //creando lista de cadenas 

        System.out.println("Agregando elementos a la lista...");
        lista.add("Pepe");
        lista.add("Pica");
        lista.add("Papas");

        System.out.println("Imprimir lista...");
        System.out.println(lista.toString());
    }
}