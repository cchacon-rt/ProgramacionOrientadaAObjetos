public class Programador extends Administrativo {
    //atributos
    public int proyectosActuales;
    public int proyectosFinalizados;

    
    //constructores
    public Programador(){}

    public Programador(String nombre, String aPaterno, String aMaterno, int diaNac, int mesNac, int anioNac, String numEmpleado, int anioContratacion, int proyectosActuales, int proyectosFinalizados){
        super(nombre, aPaterno, aMaterno, diaNac, mesNac, anioNac, numEmpleado, anioContratacion);
        this.proyectosActuales=proyectosActuales;
        this.proyectosFinalizados=proyectosFinalizados;

        System.out.println("\n___________\nConstruyendo la parte Programador\n___________\n");
    }


    //métodos
    public void calculaValeDespensa(){ //sobre escritura del método de la clase padre
        double vale, extra;
        extra = proyectosFinalizados * 100;
        vale = (ANIO_ACT - anioContratacion) * 350;
        vale = vale + extra;
        System.out.println("\nTu vale de despensa es de: $" + vale);
    }


    public String toString(){
        String estado = super.toString() + "\nProyectos actuales: " + proyectosActuales + ", proyectos finalizados: " + proyectosFinalizados;

        return estado;
    }

}
