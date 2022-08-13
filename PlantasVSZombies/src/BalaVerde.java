
public class BalaVerde extends ObjetoGrafico{
    String nombre;
    
    public BalaVerde(String nom){
        nombre = nom;
    }
    
    @Override
    public void mover(){
        System.out.println("Movimiento de bala verde. Yo me llamo " + nombre);
    }
}
