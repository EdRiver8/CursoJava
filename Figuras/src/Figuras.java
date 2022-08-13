


import java.awt.Graphics;
import javax.swing.JPanel;

public class Figuras extends JPanel{//hereda de la clase JPanel, para poder crear un pizarron de dibujo
    
    private int opcion; //elegir q figura dibujar
    
    //constructor para establecer opcion del usuarion
    public Figuras(int opcionUsuario){
        opcion = opcionUsuario;
    }
            
    public void paintComponent(Graphics g){
        super.paintComponent(g);//super representa el pizarron y la g representa el dibujante
        
        for (int i = 0; i < 10; i++) {
            switch(opcion){
                case 1: 
                    int xRect = 10 + i * 10 ;
                    int yRect = 10 + i * 10;
                    int anchoRect = 50 + i * 10;
                    int altoRect = 50 + i * 10;
                    g.drawRect(xRect, yRect, anchoRect, altoRect);
                    break;
                case 2:
                    int xOval = 10 + i * 10 ;
                    int yOval = 10 + i * 10;
                    int anchoOval = 50 + i * 10;
                    int altoOval = 50 + i * 10;
                    g.drawOval(xOval, yOval, anchoOval, altoOval);
                    break;                   
            }
        }
    }    
            
 
    
}
