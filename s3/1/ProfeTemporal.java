public class ProfeTemporal extends Profesor {
    //atributos
    public int ultDiaContrato;
    public int ultMesContrato;


    //constructores
    public ProfeTemporal(){}

    public ProfeTemporal(String nombre, String aPaterno, String aMaterno, int diaNac, int mesNac, int anioNac, String numEconomico, int anioContratacion, int ultDiaContrato, int ultMesContrato){
        super(nombre, aPaterno, aMaterno, diaNac, mesNac, anioNac, numEconomico, anioContratacion); //constructor padre profesor
        this.ultDiaContrato=ultDiaContrato;
        this.ultMesContrato=ultMesContrato;
        System.out.println("\n___________\nConstruyendo la parte Profesor Temporal \n___________\n");
    }

    //métodos
    public void firmarCierreContrato(){
        System.out.println("Firmar fin de contrato de este trimestre.");
    }

    public String toString(){
        String estado = super.toString() + "\n Fecha de Fin contrato: " + ultDiaContrato + " / " + ultMesContrato + " \n";

        return estado;
    }
}
