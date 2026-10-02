public class Profesor extends Personas {
   public static final int MAX_UEAS=3;


    //atributos
    public String numEconomico;
    Ueas [] ueasIns;
    int cont;


    //constructores
    public Profesor(){
        ueasIns = new Ueas[3];
        cont=0;
    }

    public Profesor(String nombre, String aPaterno, String aMaterno, String numEconomico){
        super(nombre, aPaterno, aMaterno);
        this.numEconomico=numEconomico;
        System.out.println("Profesor creado.\n");
    }



    //métodos
    public void asignarUEA(Ueas uea){
        ueasIns[cont]=uea;
        cont++;
    }

    public void imprimirUEAasignada(){

    }

    public String toString(){
        String estado = super.toString()
 + "\nNumero Eco.: " + numEconomico + "\n";
    return estado;
}

}
