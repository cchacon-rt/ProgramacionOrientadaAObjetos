public class Alumno extends Personas {
    public static final int MAX_UEAS_INSCRIBIR=5;

    //atributos
    public String matricula;
    public String licenciatura;
    public int creditosAcumulados;
    public int promedio;

    //constructores
    public Alumno(){}
    
    public Alumno(String nombre, String aPaterno, String aMaterno, String matricula, String licenciatura, int creditosAcumulados, int promedio ){
        super(nombre, aPaterno, aMaterno);
        this.matricula=matricula;


    }

    //atributos


}
