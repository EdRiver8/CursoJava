
import java.util.ArrayList;
import java.util.TimerTask;
import java.util.Timer;


public class AdminV {
    private ArrayList<ObjetoGrafico> listaFiguras;//todas heredan de la clase objgra
    
    public AdminV(){
        
        listaFiguras = new ArrayList<ObjetoGrafico>();
        listaFiguras.add(new BalaPlata("Plata 1"));
        listaFiguras.add(new BalaPlata("Plata 2"));
        listaFiguras.add(new BalaPlata("Plata 3"));
        listaFiguras.add(new BalaVerde("Verde 1"));
        listaFiguras.add(new BalaVerde("Verde 2"));
        listaFiguras.add(new Zombie("Zombie 1"));
        listaFiguras.add(new Zombie("Zombie 2"));
        listaFiguras.add(new Zombie("Zombie 3"));
        
        TimerTask timertask = new TimerTask() {
            @Override
            public void run() {
                moverFiguras();
            }
        };
        
        Timer timer = new Timer();
        timer.schedule(timertask, 0, 5000);//ejecuta el objeto timertask desde q inicia(0) cada 5 seg(5000)
        
    }
    
    public void moverFiguras(){
        for(ObjetoGrafico og: listaFiguras){//og es un objgraf temporal, se va moviendo
            og.mover();
        }
        System.out.println("-------------------------------------------------------");
    }
    
    public static void main(String[] args){
        AdminV admin = new AdminV();
    }
}
