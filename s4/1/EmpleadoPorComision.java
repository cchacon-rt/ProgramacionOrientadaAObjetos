public class EmpleadoPorComision extends Empleado{
    public double porcentajeComision;

    public EmpleadoPorComision(){}

    public EmpleadoPorComision(String nombre, int id, double salarioBase, double porcentajeComision){
        super(nombre, id, salarioBase);
        this.porcentajeComision=porcentajeComision;
    }

    public double calcularSalario(){
        return salarioBase + (salarioBase*porcentajeComision);
    }

    public String toString(){
        String estado = super.toString() + "\nPorcentaje de comision: " + porcentajeComision + "%" ;

        return estado;
    }
}