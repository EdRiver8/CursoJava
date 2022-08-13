
import java.util.ArrayList;

public class Colecciones {
    
    public static void main (String[] args){
         ArrayList <String> arreglo = new ArrayList<>();
         arreglo.add("Hola");
         arreglo.add("bebe");
         arreglo.add("que mas ps?");
         
         for (String elemento : arreglo) {
             System.out.println("Valor: " + elemento);
        }
         
        System.out.println("tamaño de la lista = " + arreglo.size());
        
        if (arreglo.contains("Hola")){
            System.out.println("Si contiene el elemento: Hola");
        }else{
            System.out.println("No contiene la palabra: Hola");
        }
        
    }
}
