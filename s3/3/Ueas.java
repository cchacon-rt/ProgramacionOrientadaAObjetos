public class Ueas {
    
    //atributos
    public String nombre;
    public String clave;
    public int creditos;
  

    //constructores
    public Ueas(){}

    public Ueas(String nombre, String clave, int creditos){
        this.nombre=nombre;
        this.clave=clave;
        this.creditos=creditos;
    }

    //metodos
    public String toString(){
        String estado = "Datos UEA:\n\t" + clave + "\t" + nombre + "\t" + creditos + "\n";
        
        return estado;
    }

}
