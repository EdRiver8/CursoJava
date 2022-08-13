
package pesosascendentes;

import java.util.Scanner;

public class PesosAscendentes {

    public static void main(String[] args) {
        int datos;
        //int p1, p2, p3;
        Scanner dato = new Scanner(System.in);
        System.out.println("Defina cuantos va a ingresar: ");
        datos = dato.nextInt();
        for (int i = 0; i < datos; i++) {
            System.out.println("Ingrese el peso numero: " + (i+1));
            
        }
        
        
        
        
        
        
        
//        Scanner dato = new Scanner(System.in);//leer datos de teclado
//        System.out.println("Ingrese el peso 1: ");
//        p1 = dato.nextInt();
//        System.out.println("Ingrese el peso 2: ");
//        p2 = dato.nextInt();
//        System.out.println("Ingrese el peso 3: ");
//        p3 = dato.nextInt();
//        if (p1 > p2 && p2 > p3) {
//            System.out.println("Los pesos ordenados son: " + p3
//            + ", " + p2 + ", " + p1);
//        } else {
//            if (p1 > p3 && p3 > p2) {
//                System.out.println("Los pesos ordenados son: " + p2
//                + ", " + p3 + ", " + p1);
//            } else {
//                if (p2 > p1 && p1 > p3) {
//                    System.out.println("Los pesos ordenados son: " + p3
//                    + ", " + p1 + ", " + p2);
//                } else {
//                }
//            }
//            
//        }
    }
    
}
