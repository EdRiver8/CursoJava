
package adivinanumero;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {

    public static void main(String[] args) {
        System.out.println("Este juego es para adivinar un numero del 0 al 20");
        Random aleatorio = new Random();//creo objeto random llamado aleatorio
        int ran, dato;//numero es el generado, dato el q ingresa el user
        ran = aleatorio.nextInt(20);//a numero le llevo un aleatorio entre 0 y 20
        System.out.println("Numero es = " + ran);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el numero que crees que es: ");     
        dato = sc.nextInt();
        while (dato != ran) {         
            if (dato > ran) {
                System.out.println("El numero es menor, intenta de nuevo: ");
                dato = sc.nextInt();
            } else {
                if (dato < ran) {
                    System.out.println("El numero es mayor, intenta de nuevo: ");
                    dato = sc.nextInt();
                } 
            }
        }
        System.out.println("Advinaste el numero!!! es: " + ran);
    }
    
}
