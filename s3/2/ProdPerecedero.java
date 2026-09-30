public class prodPerecedero extends Producto {
    //Atributos
    public int diasCad;

    //Constructores
    public  prodPerecedero(){}

    public prodPerecedero(String nombre, String marca, int precio, int diasCad){
        super(nombre, marca, precio);
        this.diasCad=diasCad;
        System.out.println("\tTipo Perecedero");
    }

    //Métodos
    public Void calculaDescuento(){
        if (diasCad == 3) {
            int precioDescuento;
            precioDescuento = (precio / 2);
            System.out.println("El precio con descuento es: $" + precioDescuento); 
        }
    }

}
