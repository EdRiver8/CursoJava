
public class EmpleadoPorHoras extends Empleado{
    
    private double sueldo;//sueldo por horas
    private double horas;//horas trabajadas
    
    public EmpleadoPorHoras(String nom, String ape1, String ape2, String cc, double HorasTrabajadas, double salPorHoras){
        super(nom, ape1, ape2, cc);
        setSueldo(salPorHoras);
        setHoras(HorasTrabajadas);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double suel) {
        if(suel < 0.0){
            sueldo = 0;
        }else{
            sueldo = suel;
        }
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double h) {  
        if((h >= 0) && (h <= 168)){//rango valido de horas laborales
           horas = h; 
        }else{
            horas = 0;
        }
    }
    
    @Override
    public double salario(){
        if(getHoras() <= 40){//retorna el valor de la variable horas
            return getSueldo() * getHoras();
        }else{
            return 40 * getSueldo() + (getHoras() - 40) * getSueldo() * 1.5;//1.5 es el recargo por horas extras
        }
    }
    
    @Override
    public String toString(){
        return String.format("Empleado por horas: %s\n%s: $%,.2f; \n%s: %,.2f", super.toString(), "Salario por hora ", getSueldo(), 
                "Horas trabajadas ", getHoras());
                
    }
    
    
}
