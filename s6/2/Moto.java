public class Moto implements Transporte {
    //atributos
    int velocidad;
    String sistemaArranque;

    //constructores
    public Moto(){
        velocidad = 0;
        sistemaArranque="pedal";
    }


    //métodos
    public String frenar(int valor){
        velocidad = velocidad - valor;
        return "\nLa moto ha frenado y ahora la velocidad es de " + velocidad + " km/h";
    }

    public void acelerar (int valor){ //pasamos la velocidad a la cual quiere llegar al final
        int diferencia = valor - velocidad;
        int limite = valor / 5;
        int restante = diferencia%5;
        for (int i=0; i<=limite; i++){
            velocidad = velocidad +5;
            System.out.println("Acelerando..." + velocidad + " km/h");
        }

        if(velocidad<valor){
            velocidad = velocidad + restante;
        }

        if (velocidad>VELOCIDAD_MAXIMA){
            System.out.println("\nALERTA: Exceso de velocidad");
        }
    }

    public String toString(){
        String estado = "La moto tiene un sistema de arranque tipo " + sistemaArranque + " y va a una velocidad de " + velocidad + " km/h";
    }
}
