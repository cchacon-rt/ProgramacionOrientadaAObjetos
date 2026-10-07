public class PruebaCalculadora {
    public static void main (String [] args){
        Calculadora casio = new Calculadora();

        System.out.println("--PRUEBA DE SOBRECARGA DE METODOS POR TIPO DE DATO");

        //Invocacion al metodo sumar pasando enteros
        int sumaEnteros;
        sumaEnteros = casio.sumar(15,30);
        System.out.println("Resultado enteros: "+ sumaEnteros);

        //Invocacion al metodo sumar pasando reales
        double sumaReales;
        sumaReales = casio.sumar(10.5, 4.3);
        System.out.println("Resultado decimales: "+sumaReales);

        //Invocacion al metodo sumar pasando cadenas
        String sumaCadenas;
        sumaCadenas = casio.sumar("Hola", "mundo!");
        System.outprintln("Resultado cadenas: "+ sumaCadenas);
    }
}
