
public class EmpleadoAsalariado extends Empleado{
    
    private double salario;
    
    public EmpleadoAsalariado(String nom, String ape1, String ape2, String cc, double sal){
        super(nom, ape1, ape2, cc);//llama el constructor de la superclase
        setSalarioSemanal(sal);
    }
        
    @Override
    public double salario(){
        return getSalarioSemanal();
    }
    
    public void setSalarioSemanal(double sal){
        salario = sal;
    }
    
    public double getSalarioSemanal(){
        return salario;
    }
    
    @Override
    public String toString(){
        return String.format("Empleado asalariado: %s\n%s: $%,.2f", super.toString(), "Salario Semanal ", getSalarioSemanal());
                
    }
}
