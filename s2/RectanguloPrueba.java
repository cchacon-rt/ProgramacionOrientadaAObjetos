public class RectanguloPrueba{
    public static void main (String [] args){
        Rectangulo rect_1 = new Rectangulo();
        Rectangulo rect_2 = new Rectangulo(6.5,4.5);

        System.out.println(rect_1);
        System.out.println(rect_2.toString());

        rect_1.base=10;
        rect_1.altura=5;

        rect_1.obtenPerimetro();
        double area;
        area = rect_1.obtenArea();
        System.out.println("El area es " + area);
    }

}