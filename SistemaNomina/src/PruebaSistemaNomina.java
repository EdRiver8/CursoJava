
public class PruebaSistemaNomina {
   
    public static void main(String[] args){
        //Argumentos: nombre, apellido1, apellido2, cedula, salario
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Juan", "Perez", "Rojas", "120256", 800.00);
        //Argumentos: nombre, apellido1, apellido2, cedula, salario por horas, horas trabajadas
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Edwin", "Riv", "Bol", "102789", 16.75, 40);
        //Argumentos: nombre, apellido1, apellido2, cedula, ventas brutas, porcentaje comision
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Camila", "Garcia", "Jom", "45789", 10000, .06);
        //Argumentos: nombre, apellido1, apellido2, cedula, ventas brutas, porcentaje comision, salario base
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Javier", "Vasquez", "Jimenez", "5789", 5000, .04, 300);
        
        System.out.println("Empleados procesados por separado: \n");
        
//        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoAsalariado, "Ingresos", empleadoAsalariado.salario());
//        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoPorHoras, "Ingresos", empleadoPorHoras.salario());
//        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoPorComision, "Ingresos", empleadoPorComision.salario());
//        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoBaseMasComision, "Ingresos", empleadoBaseMasComision.salario());
        
        //polimorfismo
        Empleado [] empleados = new Empleado[4];
        
        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoPorHoras;
        empleados[2] = empleadoPorComision;
        empleados[3] = empleadoBaseMasComision;
        
        System.out.println("Empleados procesados en forma polimorfica");
        
        //procesa en forma generica a cada elemento en el arreglo empleados
        for (Empleado empleadoActual : empleados) {
            System.out.println(empleadoActual);//invoca a toString de cada elemento hasta q recorre todo el vector empleados
            
            if(empleadoActual instanceof EmpleadoBaseMasComision){
                //conversion descendente de la referencia Empleado a una referencia EmpleadoBaseMasComision
                EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) empleadoActual;
                
                double salarioBaseAnterior = empleado.getSalarioBase();
                empleado.setSalarioBase(salarioBaseAnterior * 1.10);//incremento por comision
                
                System.out.printf("El nuevo salario base con 10%% de aumento es: $%,.2f\n", empleado.getSalarioBase());
            }
            
            System.out.printf("Ingresos $%,.2f\n\n", empleadoActual.salario());
        }
        
        //obtiene el nombre del tipo de cada objeto en el arreglo de empleados
        for (int i = 0; i < empleados.length; i++) {
            System.out.printf("El empleado %d es un %s\n", i+1, empleados[i].getClass().getName());
        }
    }
}
    