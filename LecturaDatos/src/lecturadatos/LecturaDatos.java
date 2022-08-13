
package lecturadatos;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class LecturaDatos {


    public static void main(String[] args) {
        //declaracion de las variables
        String cadena; 
        int entero;
        float decimal;//float almacena decimales
        char caracter;
        //Scanner para leer dtos desde teclado
        
        
        Scanner lectura = new Scanner(System.in); 
        //definicion o inicializacion por el programador
//        cadena = "Hola Mundo!";
//        System.out.println("La cadena es: " + cadena);

//definicion o inicializacion por el usuario:
//        System.out.println("Ingrese un texto: ");
        //a cadena le llevamos lo que el usuario ingrese
        //por medio del teclado, en este caso un texto
        
        //Usando Scanner
//        cadena = lectura.nextLine();//lo que ingreso el user
//        System.out.println("Ingrese un numero entero: ");
//        entero = lectura.nextInt();
//        System.out.println("Ingrese un numero decimal: ");
//        decimal = lectura.nextFloat();
//        System.out.println("Ingrese un caracter: ");
//        caracter = lectura.next().charAt(0);
        //a caracter le lleve lo que el ingrese el usuario
        //el caracter de la primera posicion de la cadena
        //por eso se pone el numero 0
//       



//Usando JOptionpane para la lectura y salida de datos
//usando ventanas en vez de consola
        //Mensajes de salida
        //JOptionPane.showMessageDialog(null, "Hola Mundo!");
        //Mensajes de entrada
        //Lo q ingrese el user, lo guarda en la variable
        //cadena
        cadena = JOptionPane.showInputDialog("Ingrese un texto");
        JOptionPane.showMessageDialog(null, "El texto ingresado fue: " + cadena);
        
    }
    
}
