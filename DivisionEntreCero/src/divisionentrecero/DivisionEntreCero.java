
package divisionentrecero;

import java.util.InputMismatchException;
import java.util.Scanner;


public class DivisionEntreCero {
    //demuestra el manejo de un excepcion cuando se da una division entre cero
    
    //el metodo estatico sirve para ser invocado sin existir una instacia de la clase
    public static int cociente(int numerador, int denominador)
    throws ArithmeticException
    {
        return numerador / denominador;//posible division entre cero
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuarCiclo = true; //determina si necesita mas datos de entrada
        
        do{
            try{
                System.out.println("Introduzca el numerador tipo entero: ");
                int num = sc.nextInt();
                System.out.println("Introduzca el denominador tipo entero");
                int den = sc.nextInt();
        
                int resul = DivisionEntreCero.cociente(num, den);
        
                System.out.println("Resultado es: " + num + "/" + den + " = " + resul);
                continuarCiclo = false;
            }
            catch(InputMismatchException exception){
                System.err.println("Se produjo un error por excepcion: " + exception);
                sc.nextLine(); //descarta entrada para que el usuario intente de nuevo

            }//fin del catch InputMismatchException
            catch(ArithmeticException exception){
                System.err.println("\nExcepcion: " + exception + "\n");
                System.out.println("Cero es un denominador invalido. Intente de nuevo. \n");
            }//fin del ultimo catch
        }while(continuarCiclo); 
    }
    
}
