package arbolbusquedaavl;
import java.util.Scanner;

public class ArbolBusquedaAvl {

    public static void main(String[] args) {
      /* ArbolAvl arbol = new ArbolAvl();
       //insertando nodos
       arbol.insertar(10);
       arbol.insertar(5);
       arbol.insertar(13);
       arbol.insertar(1);
       arbol.insertar(6);
       arbol.insertar(17);
       arbol.insertar(16);
       arbol.preorden(arbol.obtenerRaiz());
*/
      ArbolAvl arbol = null;//hay q inicializarlo porq el compilador saca un error, pero no deberia ser necesario
       int op;
       do{
           op = menu(); 
           switch(op){
               case 1:
                   arbol = new ArbolAvl();
                   //System.out.println("Va a comenzar a agregar datos");
                   int dato, exit;
                   do{
                       exit = salida();
                               switch(exit){
                                   case 1:
                                       Scanner sc = new Scanner(System.in);
                                       System.out.println("Ingrese nodo a crear: "); 
                                       dato = sc.nextInt();
                                       arbol.insertar(dato);
                                       break;
                                   case 0: 
                               }                       
                   }while(exit != 0);
                  break;
               case 2:
                   arbol.preorden(arbol.obtenerRaiz());
                   break;
               case 3:
                   arbol.inorden(arbol.obtenerRaiz());
                   break;
               case 4:
                   arbol.posorden(arbol.obtenerRaiz());
                   break;
               case 5:
                   GraficoArbolAvl grafico = new GraficoArbolAvl();
                   grafico.setArbol(arbol);//para llevarle el arbol al grafico
                   grafico.setVisible(true);
                   break;
           }
       }while(op != 0);
    }

    private static int menu() {
         System.out.println("Digite su opcion para el arbol: ");
         System.out.println("\n" + "1. Crear el arbol");  
         System.out.println("2. Recorrido Preorden"); 
         System.out.println("3. Recorrido Inorden"); 
         System.out.println("4. Recorrido Postorden"); 
         System.out.println("5. Graficar Árbol"); 
         System.out.println("0. Salir"); 
         Scanner sc = new Scanner(System.in);
         return sc.nextInt();

    }
    
    private static int salida(){
        System.out.println("¿Va a ingresar un dato?" + "\n" + "1 para si, 0 para no: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
    
