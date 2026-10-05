public class PruebaEmpleado {
    public static void main (String [] args){
        Empleado [] empleados = new Empleado[3];

        empleados[0] = new EmpleadoTiempoCompleto("Anita", 101,15000);
        empleados[1] = new EmpleadoPorHoras("Luisito", 102, 0, 16, 100);
        empleados[2] = new EmpleadoPorComision("Carlitos", 103, 8000, 0.05);

        //recorrer un array de objetos usando un objeto
        for(Empleado actual: empleados){//actual es un apuntador de tipo Empleado que nos ayudará a recorrer el array de empleados
            System.out.println(actual);
            System.out.println("Salario final: $" + actual.calcularSalario());
            System.out.println("-----------------");
        }
    }
}
