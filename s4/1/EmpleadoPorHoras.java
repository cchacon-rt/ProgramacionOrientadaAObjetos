public class EmpleadoPorHoras extends Empleado {
    public int horasTrabajadas;
    public double pagoPorHora;

    public EmpleadoPorHoras(){}

    public EmpleadoPorHoras(String nombre, int id, double salarioBase, int horasTrabajadas, double pagoPorHora){
        super(nombre, id,salarioBase);
        this.horasTrabajadas=horasTrabajadas;
        this.pagoPorHora=pagoPorHora;
    }

    public double calcularSalario(){
        return horasTrabajadas*pagoPorHora;
    }

    public String toString(){
        String estado = super.toString()+ "\nHoras trabajadas: " + horasTrabajadas + "h \nPago por Hora: $" + pagoPorHora;

        return estado;
    }
}
