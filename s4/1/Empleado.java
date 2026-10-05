public abstract class Empleado{
    public String nombre;
    public int id;
    public double salarioBase;

    public Empleado(){}

    public Empleado (String nombre, int id, double salarioBase){
        this.nombre=nombre;
        this.id=id;
        this.salarioBase=salarioBase;
    }

    public abstract double calcularSalario(); //metodo abstract

    public String toString(){
        String estado="ID: " + id + "\nNombre: " + nombre + "\nSalario Base: $" + salarioBase;

        return estado;
    }
}