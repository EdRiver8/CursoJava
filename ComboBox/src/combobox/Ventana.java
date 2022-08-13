
package combobox;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;


public class Ventana extends JFrame{
    
    public Ventana(){
        
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        JComboBox combo = new JComboBox(modelo);
        combo.setBounds(100, 100, 300, 40);
        
        modelo.addElement(ABORT);
        
        Persona p = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        
        p.setDireccion("Calle 27 a # 45 86");
        p.setEdad(28);
        p.setNacionalidad("Colombia");
        p.setNombre("Goku Sakuraky");
        
        p2.setDireccion("Calle 45");
        p2.setEdad(25);
        p2.setNacionalidad("Peru");
        p2.setNombre("Oliver Gomez");
        
        p3.setDireccion("Calle 44 b");
        p3.setEdad(31);
        p3.setNacionalidad("Chile");
        p3.setNombre("Seiya Hurtado");
        
        modelo.addElement(p);        
        modelo.addElement(p2);        
        modelo.addElement(p3);        
        
        add(combo);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
        
        
    }
    
    public static void main(String[] args){
        new Ventana();
    }
    
}
