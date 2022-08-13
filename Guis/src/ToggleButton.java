
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JToggleButton;


public class ToggleButton extends JFrame{
    
    public ToggleButton(){
        JToggleButton tb = new JToggleButton("ToggleButton", true);
        JToggleButton tb2 = new JToggleButton("ToggleButton2", false);
        tb.setBounds(200, 200, 150, 30);
        tb2.setBounds(200, 300, 150, 30);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(tb);
        bg.add(tb2);
        
        add(tb);
        add(tb2);        
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
    public static void main(String[] args){
        ToggleButton obj = new ToggleButton();
    }
}
