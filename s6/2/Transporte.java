public interface Transporte {
    //constantes
    int VELOCIDAD_MAXIMA = 120;

    //metodos abstractos
    public String frenar (int valor);
    public void acelerar (int valor);
}
