public class Persona{
    //atributos 
    public String nombre;
    public String apellido;
    public int edad;
    public String clave;


    //constructores
    public Persona(){
        clave="123";
    }

    public Persona (String nombre, String apellido, int edad, String clave){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.clave=clave;
    }

    //metodos
    public void iniciaSesion(String pass){
        if(clave.equals(pass)){
            System.out.println("Bienvenido");
        } else {
            System.out.println("Clave incorrecta");
        }
    }

    public String toString(){
        String estado = "nombre: " + nombre + ", apellido: " + apellido + ", edad: " + edad + ", clave: " + clave;
        return estado;
    }


}