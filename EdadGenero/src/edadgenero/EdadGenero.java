
package edadgenero;

import javax.swing.JOptionPane;


public class EdadGenero {

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("¿Hola, cuál es tu género?");
        //nextLine se utiliza cuando intentamos leer cadenas de caracteres desde el teclado.
        String genero = sc.nextLine();
        
        System.out.println("¿Cuál es tu edad?");
        int edad = sc.nextInt();

        //ahora debes poner el código necesario para realizar el ejercicio*/    
        String gen = JOptionPane.showInputDialog("Ingresa el genero de la persona: ");
        String edad = JOptionPane.showInputDialog("Ingresa la edad de la persona: ");
        int age = Integer.parseInt(edad);
        boolean bandera = true;
        String may = "mayor";
        if(age < 18){
            bandera = false;
            may = "menor";
        }
        switch (gen){
            case "femenino": JOptionPane.showMessageDialog(null, "Hola, eres una mujer " + may + " de edad, de " + age + "años");
                break;
            case "masculino": JOptionPane.showMessageDialog(null, "Hola, eres un hombre " + may + " de edad, de " + age + "años");
                break;
        }
    }
    
}
