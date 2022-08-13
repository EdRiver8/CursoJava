
import javax.swing.JComboBox;
import javax.swing.JFrame;


public class ComboBox extends JFrame{
    
    public ComboBox (){
        String [] paises = {"Colombia", "Mexico", "Peru", "Chile"}; //se inicializa con dato el arreglo
        JComboBox combo = new JComboBox(paises);
        
        combo.addItem("Argentina");//anade mas items a la lista desplegable
        combo.addItem("Brasil");
        
        combo.setSelectedItem("Chile");//seleccionado por defecto
        
        combo.setBounds(50, 50, 90, 20);
        add(combo);
        
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    
    public static void main (String[] args){
        new ComboBox();//no se crea la referencia porq no se necesita   
    }
    
}
