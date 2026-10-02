public class Persona {

    //atributos
    public String nombre;
    public String aPaterno;
    public String aMaterno;

    //constructores
    public Persona (){}
    
    public Persona (String nombre, String aPaterno, String aMaterno){
        System.out.println("Persona creada.\n");
        this.nombre=nombre;
        this.aPaterno=aPaterno;
        this.aMaterno=aMaterno;
    }

    //métodos
    public String toString(){
        String estado = "\nNombre Completo: " + nombre + " " + aPaterno + " " + aMaterno;
        return estado;
    }
}