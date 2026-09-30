import java.io.IOException;

public class AlarmaDeBarcos{
    public static void main (String [] args) throws IOException{
        Barco [] barcos = new Barco [3]; //array barcos de tamaño 3

        DeVapor dv = new DeVapor();
        System.out.println("\n ______________________ \n");
        Carguero c = new Carguero();
        System.out.println("\n ______________________ \n");
        Velero v = new Velero();
        System.out.println("\n ______________________ \n");
        //por ej, v, c y dv son apuntadores que apuntan a un obketo tipo vel, carg o dev respectivamente y guarda la dirección del new


        barcos[0]=dv;
        barcos[1]=c;
        barcos[2]=v;
        System.out.println("\n Recorriendo array e invocando metodo de alarma \n");


        for(int i=0; i<3; i++){
            barcos[i].alarma();
            //barcos[i].metodoDeBarco(); //este se usó antes de los if individuales


            //cuando son metodos propios de la clase hija se debe crear una nueva referencia que apunte al objeto con el tipo de clase del objeto
            if (barcos[i] instanceof DeVapor) {
                //cast para que no solo sea un barco sino barco de vapor
                DeVapor x = (DeVapor) barcos [i]; //x es un nuevo apuntador, y que apunta a uno DeVapor... Lo que estaba en barcos[i] ahora es un dato de tipo DeVapor
                x.metodoDeVapor();
                //ya que sabemos que es DeVapor entonces accedemos a traves de x a su metodo de Vapor 
            }

            if (barcos[i] instanceof Carguero) {
                Carguero y = (Carguero) barcos[i];
                y.metodoDeCarguero();
            }

            if (barcos[i] instanceof Velero) {
                Velero z= (Velero) barcos[i];
                z.metodoDeVelero();
            }
        }
    }
}