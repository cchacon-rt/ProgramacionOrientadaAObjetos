public class PruebaHerencia {
    public static void main (String [] args){
        Profesor Dominique = new Profesor("Dominique", "Decouchant", "Emilie Henri", 20, 12, 1960, "8895", 2016);
        System.out.println(Dominique);

        Administrativo Paty = new Administrativo("Patricia", "Lopez", "Flores", 29, 07, 1960, "126", 2009);
        System.out.println(Paty);
        Paty.calculaValeDespensa();

        Programador Juanito = new Programador("Juanito", "Banana", "Piña", 22, 11, 1998, "889", 2022, 15, 57);
        System.out.println(Juanito);
        Juanito.calculaValeDespensa();
   
        
   
    }
}
