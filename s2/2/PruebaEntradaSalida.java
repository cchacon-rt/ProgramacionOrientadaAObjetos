import java.util.Scanner; //importar la class

public class PruebaEntradaSalida{
    public static void main (String [] args){
        //para poder usal la class scanner se debe crear un obj tipo scanner
        Scanner entrada = new Scanner (System.in); //canal de entrada

        int edad;
        double precio;
        String nombre;
        String apellido;

        System.out.print("Introduce tu edad: ");
        edad = entrada.nextInt();

        System.out.print("\nIntroduce el precio: ");
        precio = entrada.nextInt();

        entrada.nextLine(); //una forma de limpiar el buffer

        System.out.print("\nIntroduce tu nombre: ");
        nombre = entrada.nextLine();

        System.out.print("\nIntroduce tu apellido: ");
        //apellido = entrada.next(); al primer espacio ignora lo demás
        apellido = entrada.nextLine();

        System.out.print("\nIntroduce tu gener (m/f/o): ");
        char genero;
        genero = entrada.next().charAt(0);



        System.out.println("Los datos recabados son: \nNombre: " + nombre + " " + apellido + "\ncon una edad de " + edad + " años. \nSu género es " + genero);
        System.out.print("Y el precio es: $" + precio);
    }
}


/*
para compilar
    javac PruebaEntradaSalida.java

para ejecutar
    java PruebaEntradaSalida

*/