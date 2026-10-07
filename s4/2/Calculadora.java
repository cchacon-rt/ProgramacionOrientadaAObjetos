//INICIAMOS SOBRECARGA DE METODOS

public class Calculadora {
    //nao tem atributos

    //metodos
    public int sumar (int a, int b){
        System.out.println("\tSumando enteros...");
        return a+b;
    }

    public double sumar (double a, double b){
        System.out.println("\tSumando numeros reales...");
        return a+b;
    }

    public String sumar(String a, String b){
        System.out.println("\tSumando cadenas...");
        return a+" "+b;
    }
}
