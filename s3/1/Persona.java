public class Persona{
    public static final int ANIO_ACT=2026;

    //atributos
    public String nombre;
    public String aPaterno;
    public String aMaterno;
    public int edad;
    public int diaNac;
    public int mesNac;
    public int anioNac;



    //constructores
    public Persona (){}

    public Persona (String nombre, String aPaterno, String aMaterno, int diaNac, int mesNac, int anioNac){
        System.out.println("Construyendo la parte persona");
        this.nombre=nombre;
        this.aPaterno=aPaterno;
        this.aMaterno=aMaterno;
        this.diaNac=diaNac;
        this.mesNac=mesNac;
        this.anioNac=anioNac;
    }

    //métodos
    public void calcularEdad(){
        edad=ANIO_ACT-anioNac;
    }

    public String toString(){
        calcularEdad();
        String estado = "Nombre Completo: " + nombre + aPaterno + aMaterno + ".\n edad: " + edad + "\n Fecha nacimiento: " + diaNac + " / " + mesNac + " / " + anioNac;
        return estado;  
    }

}