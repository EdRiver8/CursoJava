
package listasimple;

import java.util.Random;
import java.util.Scanner;

/* @author EdwinJohan
 */
public class PruebaListaSimple {

    private static Random rd = new Random();//para generar los numeros aleatorios
    private static Scanner sc = new Scanner(System.in);//define los aleatorios
    
    public static void main(String[] args) {
         int op, dato, pos;
         ListaSimple lista = new ListaSimple();
         do {
             op = menu();//sigue mostrando o preguntando en el menu hasta que se escoja el cero
             switch(op){
                 case 1: System.out.println(lista);//listar, muestra los datos de la lista
                 break;
                 case 2: System.out.println("Ingresar el dato a adicionar");//adicion manual
                 dato = sc.nextInt();
                 lista.adicionar(dato);
                 break; 
                 case 3: //insertar
                     System.out.println("Ingrese el dato a guardar: ");
                     dato = sc.nextInt();
                     System.out.println("Ingresar posicion en la que se va a guardar: ");
                     pos = sc.nextInt();
                     lista.insertar(dato, pos);
                     break;
                 case 4: //adicion automatica de 10 elementos
                     for (int i = 0; i < 10; i++) {
                         lista.adicionar(rd.nextInt(100));
                     }
                 break; 
                 case 5: //borrar por posicion
                     System.out.println("Ingrese la posicion del dato a borrar: ");
                     pos = sc.nextInt();
                     lista.borrarPos(pos);

             }
         }while(op !=0 );//para salirse
    }

    private static int menu() {
        System.out.println("...Menú...");
        System.out.println("1. Listar");
        System.out.println("2. Adicion Manual");
        System.out.println("3. Insertar");
        System.out.println("4. Adicion Auto de 10 elementos");
        System.out.println("5. Borrar por posicion");
        System.out.println("0. Salir");
        System.out.println("Su opcion es: ");
        return sc.nextInt();//retorna lo que el usuario ingrese pantalla 
       
        
    }
    
}
