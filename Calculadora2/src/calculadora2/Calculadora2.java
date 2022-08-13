
package calculadora2;

import java.util.Scanner;


public class Calculadora2 {

    public static void main(String[] args) {
        int num1, num2, opcion, res;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero 1: ");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el numero 2: ");
        num2 = teclado.nextInt();
        System.out.println("Escoja: " + "\n" + 
                "1 para suma" + "\n" + "2 para resta"
        + "\n" + "3 para multiplicar" + "\n" + 
                "4 para divir");
        opcion = teclado.nextInt();
        //menu
//        if(opcion == 1){
//            res = num1 + num2;
//            System.out.println("La suma es: " + res);
//        } else if(opcion == 2){
//            res = num1 - num2;
//            System.out.println("La resta es: " + res);
//        } else if(opcion == 3){
//            res = num1 * num2;
//            System.out.println("La multiplicacion es: " + res);
//        } else if(opcion == 4){
//            res = num1 / num2;
//            System.out.println("La division es: " + res);
//        } else{
//            System.out.println("La opcion no es valida!!!");
//        } 
        
        //Menu
        switch(opcion){
            case 1: res = num1 + num2;
                System.out.println("La suma es: " + res);
                break; 
            case 2:
                res = num1 - num2;
                System.out.println("La resta de los dos numeros es: " + res);
                break;
            case 3:
                res = num1 * num2;
                System.out.println("La multiplicacion de los dos numeros es: " + res);
                break;
             case 4:
                res = num1 / num2;
                System.out.println("La division de los dos numeros es: " + res);
                break;
             default:
                System.out.println("La opcion no es correcta!!!");
                break;
        }
    }
    
}
