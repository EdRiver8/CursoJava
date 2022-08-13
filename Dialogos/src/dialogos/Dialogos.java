
package dialogos;

import javax.swing.JOptionPane;


public class Dialogos {
    
    public static void main(String[] args) {        
        String nombre = JOptionPane.showInputDialog("Escribe tu nombre");
        //JOptionPane.showMessageDialog(null, "Operacion realizada de fomar correcta", "Titulo Ventana", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hola " + nombre);
        JOptionPane.showMessageDialog(null, "Operacion realizada de fomar correcta");//saca una ventana en pantalla
        
    }
    
}
