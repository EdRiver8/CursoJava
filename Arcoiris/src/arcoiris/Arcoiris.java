
package arcoiris;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class Arcoiris extends JPanel{
    //se crean los colores indigo y violeta
    private final static Color VIOLETA = new Color(128, 0, 128);
    private final static Color INDIGO =  new Color(75, 0, 130);
    //los colores a usar en el arcoirir, empezando por los mas interiores
    //las dos entradas de color blanco, producen un arco vacio en el centro
    private Color[] colores = {Color.WHITE, Color.WHITE, VIOLETA, INDIGO, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};
    
    public Arcoiris (){
        //se establece el color de fondo de la pizarra
        setBackground(Color.WHITE);
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        int radio = 20;
        int centroX = getWidth()/2;
        int centroY = getHeight()-10;
        
        for (int i = colores.length; i > 0; i--) {
            //establecer el color del arco actual 
            g.setColor(colores[i-1]);
            //rellena el arco desde 0 hasta 180 grados
            int valorX = centroX - i * radio;
            int valorY = centroY - i * radio;
            int ancho = i * radio * 2;
            int alto = i * radio * 2;
            //el cero es desde donde arranca y 180 donde finaliza
            g.fillArc(valorX,valorY, ancho, alto, 0, 180);
        }
    }
    
    
}
