public class Profesor extends Persona {
   public static final int MAX_UEAS=3;


    //atributos
    public String numEconomico;


    //constructores
    public Profesor(){}

    public Profesor(String nombre, String aPaterno, String aMaterno, String numEconomico){
        super(nombre, aPaterno, aMaterno);
        this.numEconomico=numEconomico;
        System.out.println("Profesor creado.\n");
    }



    //métodos
    public void asignarUEA(){

    }

    public void imprimirUEAasignada(){

    }

    public String toString(){
        String estado = super.toString()
 + "\nNumero Eco.: " + numEconomico + "\n";
    return estado;
}

}
