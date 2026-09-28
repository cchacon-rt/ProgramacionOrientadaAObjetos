public class Administrativo extends Persona {
    //atributos
    public String numEmpleado;
    public int anioContratacion;


    //constructores
    public Administrativo(){}

    public Administrativo(String nombre, String aPaterno, String aMaterno, int diaNac, int mesNac, int anioNac, String numEmpleado, int anioContratacion){
        super(nombre, aPaterno, aMaterno, diaNac, mesNac, anioNac);
        this.numEmpleado=numEmpleado;
        this.anioContratacion=anioContratacion;
        System.out.println("Construyendo la parte admon");
    }


    //métodos
    public void cerrarPresupuesto(){
        System.out.println("Cerrando presupuesto del 2026.");
    }

    public void calculaValeDespensa(){
        double vale;
        vale = (ANIO_ACT - anioContratacion) * 350;
        System.out.println("Tu vale de despensa es de: $" + vale);
    }

    public String toString(){
        String estado = super.toString() + ", num Empleado: " + numEmpleado + "empleado Desde " + anioContratacion;

        return estado;
    }

}
