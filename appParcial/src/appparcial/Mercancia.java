
package appparcial;

public class Mercancia extends Producto{
    
    private String nombre;
    private double valorUnidad;

    public Mercancia(String nombre, double valorUnidad, int cantidad) {
        super(cantidad);
        this.nombre = nombre;
        this.valorUnidad = valorUnidad;
    }
    
    
    @Override
    public void mostrarProducto(){
        System.out.println("Nombre: "+"" + nombre + ", " + "Cantidad = " + cantidad);
    }

    public double getValorUnidad() {
        return valorUnidad;
    }

    public void setValorUnidad(double valorUnidad) {
        this.valorUnidad = valorUnidad;
    }
    
    private void calcularValorTotal(){
        valorTotal = cantidad * valorUnidad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
