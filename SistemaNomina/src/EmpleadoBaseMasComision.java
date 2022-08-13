
public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    
    private double salarioBase;
    
    public EmpleadoBaseMasComision(String nom, String ape1, String ape2, String cc, double ventas, double tarifa, double salario){
        super(nom, ape1, ape2, cc, ventas, tarifa);
        setSalarioBase(salario);
    } 

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salario) {
        if(salario < 0.0){
            salarioBase = 0.0;
        }else{
            salarioBase = salario;
        }
    }
    
    @Override
    public double salario(){
        return getSalarioBase() + super.salario();  
    }
    
    @Override
    public String toString(){
        return String.format("Con salario base %s: %,.2f", super.toString() + "\nSalario base ", getSalarioBase());                
    }
    
}
