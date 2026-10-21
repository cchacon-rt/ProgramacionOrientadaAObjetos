public class Automovil implements Transporte {
    //atributo
    int velocidad;
    int numAsientos;

    //constructores
    public Automovil(){
        velocidad=0;
        numAsientos=4;
    }

    //métodos
    public String frenar (int valor){
        velocidad = velocidad - valor;
        return "\nEl automovil ha frenado y ahora la velocidad es de " + velocidad + " km/h";
    }

    public void acelerar (int valor){ //pasamos la velocidad a la cual quiere llegar al final
        int diferencia = valor - velocidad;
        int limite = valor / 10;
        int restante = diferencia%10;
        for (int i=0; i<=limite; i++){
            velocidad = velocidad +10;
            System.out.println("Acelerando..." + velocidad + " km/h");
        }

        if(velocidad<valor){
            velocidad = velocidad + restante;
            return "\nAcelerando a una velocidad de" + velocidad + " km/h";
        }

        if (velocidad>VELOCIDAD_MAXIMA){
            System.out.println("\nALERTA: Exceso de velocidad");
        }
    }
    public String toString(){
        String estado = "El automovil tiene " + numAsientos + " asientos y va a una velocidad de " + velocidad + " km/h";
    }
}
