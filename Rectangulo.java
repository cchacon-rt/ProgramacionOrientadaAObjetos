public class Rectangulo{
    //atributos
    public double base;
    public double altura;

    //constructores
    public Rectangulo(){}

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura =altura;
    }

    //metodos

    public void obtenPerimetro(){
        double perimetro = (base + altura) * 2;
        System.out.println("El perimetro es " + perimetro);
    }

    public double obtenArea(){
        double area = base * altura;
        return area;
    }

    public void imprimir(){
        System.out.println("***************************");
        System.out.println("*                         *");
        System.out.println("*                         *");
        System.out.println("***************************");
    }

    public String toString(){
        String estado = "Base: " + base + "\n" + "Altura: " + altura;
    }

}