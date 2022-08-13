
package encapsulamiento;

import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

public class Persona {
    String nombre;
    String nacionalidad;
    int edad;
    double altura;
    
    public String getNombre(){
        return nombre;
    }
    
    public String getNacionalidad(){
        return nacionalidad;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setNommbre(String name){
        nombre = name;
    }
    
    public void setNacionalidad(String nacio){
        nacionalidad = nacio;
    }
    
    public void setEdad(int age){
        String e;
        while (age < 0 || age > 125) {   
            JOptionPane.showMessageDialog(null, "Edad Invalida");
            e = JOptionPane.showInputDialog("Ingresa tu edad: ");
            age = Integer.parseInt(e);
        }
        edad = age;
        //sin ciclo repetitivo 
        /*if (age < 0 || age > 125){
            JOptionPane.showMessageDialog(null, "Edad Invalida");
        }
        else{
            edad = age; 
        }*/

    }
    
    public void setAltura(double high){
        String e;
        while (high < 0.4 || high > 3) {   
            JOptionPane.showMessageDialog(null, "Altura Invalida");
            e = JOptionPane.showInputDialog("Ingresa tu altura: ");
            high = Double.parseDouble(e);
        }
        altura = high;
        
        
        /*if (high > 2.8 || high < 0.4) {
            JOptionPane.showMessageDialog(null,"Altura invalida");
        }
        else{
            altura = high;
        }*/
    }
}
