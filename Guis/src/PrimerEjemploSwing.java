
import javax.swing.JButton;
import javax.swing.JFrame;


public class PrimerEjemploSwing {
    
    //se puede poner extends para que la clase herede de JFrame y asi no tendria 
    //que crear un objeto f, sino, llamar los metodos directamente ejemplo:
    // setSize(400,500), sin el f.    
    
    public PrimerEjemploSwing(){
                
        JFrame f = new JFrame();//creando una instancia de JFrame
        
        JButton b = new JButton("Click");//Creando una instancia del boton y poniendole el nombre   
        b.setBounds(130,100,100,40);//ejes x, y, ancho y alto
        f.add(b);//anadiendo el boton al marco
        f.setSize(400,500);//el marco es de 400 * 500
        f.setLayout(null);//no se usa layout managers
        f.setVisible(true);//se hace el frame visible
    }
    
    public static void main(String[] args){
        PrimerEjemploSwing obj = new PrimerEjemploSwing();
    }
}
