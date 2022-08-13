
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Label extends JFrame{
    
    public Label(){
        
        //ImageIcon icon = new ImageIcon("Gemas.jpg");
        JLabel etiqueta = new JLabel(new ImageIcon ("Gemas.jpg"));//contiene la imagen q hay en el paquete
        etiqueta.setBounds(200,200,200,200);
        
        //etiqueta.setIcon(new ImageIcon("Gemas.jpg")); otra manaera de adjuntar la imagen
        
        add(etiqueta);//metodo de JFrame, como esta heredado no se crea un objeto JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//metodos de JFrame
        setSize(800,1050);
        setVisible(true);
    }
    
    public static void main(String[] args){
        
        Label obj = new Label();
        
    }
    
}
