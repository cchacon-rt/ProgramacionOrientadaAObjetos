public class PruebaPersona{
    public static void main(String [] args){
        Persona juanito = new Persona(); //crea obj con constructor x default
        System.out.println(juanito); //imprime estado de juanito
        //ahora accedemos a un valor de juanito
        juanito.apellido= "banana";
        juanito.edad= 53;
        juanito.clave="422d";

        Persona anita = new Persona("Anita", "Gomez", 33, "4577"); //se crea un ojeto con el constructor completo
        System.out.println(anita); //imprimiento el estado de anita

    }
}