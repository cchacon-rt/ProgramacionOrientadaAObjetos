public class EmpleadoTiempoCompleto extends Empleado {
    
    public EmpleadoTiempoCompleto(){}

    public EmpleadoTiempoCompleto(String nombre, int id, double salarioBase){
        super(nombre, id, salarioBase);
    }

    public double calcularSalario(){
        return salarioBase * 1.10;
    }
}
