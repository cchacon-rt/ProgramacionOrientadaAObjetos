import java.util.*;
import java.io.IOException;

public class PruebaPersona{
    public static void main (String [] args) throws IOException{
        Scanner entrada = new Scanner(System.in);
        int edad;
        String nombre;
        char sexo;
        double peso, altura;

        System.out.println("Introduce tu nombre: ");
        nombre=entrada.nextLine();

        System.out.println("Introduce tu edad: ");
        edad=entrada.nextInt();

        System.out.println("Introduce tu sexo (M/F): ");
        sexo=entrada.next().charAt(0);

        entrada.nextLine(); //limpiar buffer

        System.out.println("Introduce tu peso: ");
        peso=entrada.nextDouble();

        System.out.println("Introduce tu altura: ");
        altura=entrada.nextDouble();

        System.out.println("Creado Objeto Persona 1 ");
        Persona per1 = new Persona(nombre, edad, sexo, peso, altura); //tienen que coincidir con la var creadas
        System.out.println(per1);
    }
}