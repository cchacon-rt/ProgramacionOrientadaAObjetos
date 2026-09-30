public class Producto {
    //atributos
    public String nombre;
    public String marca;
    public int precio;

    //constructores
    public Producto(){}

    public Producto(String nombre, String marca, int precio){
        System.out.println("\n Nuevo producto añadido.\n");
        this.nombre=nombre;
        this.marca=marca;
        this.precio=precio;
    }

    //metodos
    public void comprar(){
        double total;
    }

    public String toString(){
        String estado = super.toString() + "Producto añadido a la cesta: \n\t" + nombre + " " + marca + " $" + precio;

        return estado;
    }
}
