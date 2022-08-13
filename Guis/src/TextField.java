
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class TextField extends JFrame{
    
    public TextField(){
        JTextField campo = new JTextField("Campo de Texto...", 40);//40 es el tamano de las columnas
        campo.setBounds(50, 100, 150, 30);
        
        campo.setText("Bienvenido...");
                  
        add(campo);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        
        
        JOptionPane.showMessageDialog(null, "Lo que copio en el campo fue: " + campo.getText());
    }
    
    
    public static void main(String[] args){
        TextField obj = new TextField();
    }
}
