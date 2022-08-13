
public class BalaPlata extends ObjetoGrafico{
    String nombre;
    
    public BalaPlata(String nom){
        nombre = nom;
    }
    
    @Override
    public void mover(){
        System.out.println("Movimiento de la bala plata. Yo me llamo " + nombre );
    }
}
