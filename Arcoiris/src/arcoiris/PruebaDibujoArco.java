
package arcoiris;

import javax.swing.JFrame;

public class PruebaDibujoArco extends JFrame{
        public static void main(String[] args) {
        Arcoiris panel = new Arcoiris();
        JFrame aplicacion = new JFrame();
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(400,250);
        aplicacion.setVisible(true);
        
    }
}
