
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;


public class RadioButton extends JFrame{
    
    public RadioButton(){
        JRadioButton radio = new JRadioButton("Opcion1", true);//true = aparece seleccionado por defecto
        JRadioButton radio2 = new JRadioButton("Opcion2", false);//false = no aparece seleccionado por defecto
        
        radio.setText("Hombre");
        radio2.setText("Mujer");
        //radio.setEnabled(false); deshabilitar y habilitar
        radio.setMnemonic('H');
        radio2.setMnemonic('M');
                
        
        radio.setBounds(50, 100, 110, 40);
        radio2.setBounds(50, 150, 110, 40);
        
        ButtonGroup bg = new ButtonGroup();//para q solo deje seleccionar uno de los botones
        bg.add(radio);
        bg.add(radio2);
        
        add(radio);
        add(radio2);
        
        setSize(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    
    public static void main(String[] args){
        RadioButton obj = new RadioButton();    
    }
}
