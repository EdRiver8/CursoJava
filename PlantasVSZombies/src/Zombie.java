
public class Zombie extends ObjetoGrafico{
    String nombre;
    
    public Zombie(String nom){
        nombre = nom;
    }
    
    @Override
    public void mover(){
        System.out.println("Movimiento de Zombie. Yo me llamo " + nombre);
    }
}
