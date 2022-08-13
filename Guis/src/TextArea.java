
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class TextArea extends JFrame{
    
    public TextArea(){
        JTextArea area = new JTextArea(300, 300);//300 filas y 300 col
        area.setBounds(450, 250, 300, 300);
        
        area.setBackground(Color.BLACK);//fondo negro
        area.setForeground(Color.CYAN);//texto color cyan
        
        area.setText("Mi nombre es: Pepito Perez");
        area.append("\nMi nombre es: Juan test");//anade, adjunta mas texto
        
        add(area);
        
        setSize(900, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    
    public static void main (String[] args){
        TextArea obj = new TextArea();
    }
}
