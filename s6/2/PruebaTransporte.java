import java.util.*;

public class PruebaTransporte {
    public static void main (String [] args){
        Automovil auto = new Automovil ();
        Moto moto = new Moto();

        System.out.println(auto);
        System.out.println(moto);

        auto.acelerar(50);
    }
}
