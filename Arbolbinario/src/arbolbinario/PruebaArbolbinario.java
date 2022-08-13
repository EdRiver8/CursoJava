package arbolbinario;

import java.util.Scanner;


public class PruebaArbolbinario {


    public static void main(String[] args) {
       ArbolBinario arbol = null;//hay q inicializarlo porq el compilador saca un error, pero no deberia ser necesario
       int op;
       do{
           op = menu(); 
           switch(op){
               case 1:
                   arbol = new ArbolBinario();
                   break;
               case 2:
                   arbol.recorridoPreorden();
                   break;
               case 3:
                   arbol.recorridoIneorden();
                   break;
               case 4:
                   arbol.recorridoPosorden();
                   break;
               case 5:
                   GraficoArbol grafico = new GraficoArbol();
                   grafico.setVisible(true);
                   break;
           }
       }while(op != 0);
    }

    private static int menu() {
         System.out.println("1. Crear el arbol");  
         System.out.println("2. Recorrido Preorden"); 
         System.out.println("3. Recorrido Inorden"); 
         System.out.println("4. Recorrido Postorden"); 
         System.out.println("5. Graficar Árbol"); 
         System.out.println("0. Salir"); 
         System.out.println("Digite su opcion para el arbol: ");
         Scanner sc = new Scanner(System.in);
         return sc.nextInt();

    }
    
}
