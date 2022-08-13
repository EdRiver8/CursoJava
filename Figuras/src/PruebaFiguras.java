import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PruebaFiguras {
    
    public static void main (String[] args){
        //aqui el usuario decide q dibujar
        int opcion = 0;
        do{
            String entrada = JOptionPane.showInputDialog("Ingrese 1 para dibujar Rectangulos \n"
            + "Ingrese 2 para dibujar Ovalos");
        opcion = Integer.parseInt(entrada);
        if(opcion < 1 || opcion > 2){
            JOptionPane.showMessageDialog(null, "Opcion invalida, seleccione nuevamente...");
        }
        }while(opcion < 1 || opcion > 2);

        Figuras fig = new Figuras(opcion);
        JFrame ventana = new JFrame();   
        ventana.add(fig); 
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 300);
        ventana.setVisible(true);
    }
}
