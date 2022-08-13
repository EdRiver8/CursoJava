
package encapsulamiento;

import javax.swing.JOptionPane;

public class Encapsulamiento {

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre: ");
        String nacionalidad = JOptionPane.showInputDialog("Ingresa tu nacionalidad: ");
        String edad = JOptionPane.showInputDialog("Ingresa tu edad: ");
        String altura = JOptionPane.showInputDialog("Ingresa tu altura: ");
        
        int age = Integer.parseInt(edad);
        double high = Double.parseDouble(altura);
        
        Persona per = new Persona();
        per.setNommbre(nombre);
        per.setNacionalidad(nacionalidad);
        per.setEdad(age);
        per.setAltura(high);
        
        JOptionPane.showMessageDialog(null, "El nombre de la persona es : " + per.getNombre() + "\n" + 
                "Es de nacionalidad: " + per.getNacionalidad() + "\n" + "Su edad es: " + 
                per.getEdad() + "\n" + "Su altura es: " + per.getAltura());
    }
    
}
