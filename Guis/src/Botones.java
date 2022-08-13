
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;

public class Botones extends JFrame{
    
    public Botones(){
        JButton boton = new JButton(new ImageIcon("Futu.jpg"));
        boton.setBounds(100, 100, 450, 350);
        boton.setText("Boton de Fray");
        System.out.println("Texto del boton: " + boton.getText());
        boton.setEnabled(true);//inabilita el boton
        boton.setMnemonic('c');//la letra con la q se identifica o relaciona el boton
        
        add(boton);
        setSize(600, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    
    
    
    public static void main(String[] args){
        Botones obj = new Botones();
    }
    
}
