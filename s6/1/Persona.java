public class Persona {

    //atributos
    public String nombre;
    public String aPaterno;
    public String aMaterno;
    public int edad;



    //constructores
    public boolean equals(Object obj) {
        Persona p = (Persona) obj;
        if(this.nombre.equals(p.nombre) && this.aPaterno.equals(p.aPaterno) && this.aMaterno.equals(p.aMaterno) && this.edad == p.edad){
            return true;
        } else {
            return false;
        }
    }
    public Persona (){}

    public Persona (String nombre, String aPaterno, String aMaterno, int edad){
        System.out.println("Persona creada.\n");
        this.nombre=nombre;
        this.aPaterno=aPaterno;
        this.aMaterno=aMaterno;
        this.edad=edad;
    }

    //métodos
    public String toString(){
        String estado = "\nNombre Completo: " + nombre + " " + aPaterno + " " + aMaterno + "\nEdad: " + edad;
        return estado;
    }
}