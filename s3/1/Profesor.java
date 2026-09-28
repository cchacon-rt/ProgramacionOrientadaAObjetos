public class Profesor extends Persona {
    //atributos
    public String numEconomico;
    public int anioContratacion;


    //constructores
    public Profesor(){}

    public Profesor(String nombre, String aPaterno, String aMaterno, int diaNac, int mesNac, int anioNac, String numEconomico, int anioContratacion){
        super(nombre, aPaterno, aMaterno, diaNac, mesNac, anioNac); //invocacion al constructor de la clase padre
        this.numEconomico=numEconomico;
        this.anioContratacion=anioContratacion;
        System.out.println("\n___________\nConstruyendo al profe\n___________\n");
    }


    //métodos
    public void firmarBoletas(){
        System.out.println("Firmar boletas del trim 26-O...");
    }

    public String toString(){
        String estado = super.toString() + ", num Eco: " + numEconomico + ", Contratado desde: " + anioContratacion + "\n";

        return estado;
    }
}
