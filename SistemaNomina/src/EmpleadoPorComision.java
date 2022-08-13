
public class EmpleadoPorComision extends Empleado{
    
    private double ventasBrutas;
    private double tarifaComision;
    
    public EmpleadoPorComision(String nom, String ape1, String ape2, String cc, double ventas, double tarifa){
        super(nom, ape1, ape2, cc);
        setVentasBrutas(ventas);
        setTarifaComision(tarifa);
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventas) {
        if(ventas < 0.0){
            ventasBrutas = 0.0;
        }else{
            ventasBrutas = ventas;
        }
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifa) {
        if(tarifa > 0.0 && tarifa < 1.0){//este 1.0 esta establecido por la empresa
            tarifaComision = tarifa;
        }else{
            tarifa = 0.0;
        }
    }

    @Override
    public double salario(){
        return getTarifaComision() * getVentasBrutas();
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s\n%s: $%,.2f; \n%s: %.2f", "Empleado por comision", super.toString(), "Ventas brutas ", getVentasBrutas(), 
                "Tarifa de comision", getTarifaComision());
                
    }
        
}
