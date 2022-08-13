
package colletionset;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class ColletionSet {

    public static void main(String[] args) {
        Random rd = new Random();
        TreeSet numerosordenados = new TreeSet();//se crea una lista
        int numalea;
        for (int i = 0; i < 10; i++) {
            numalea = (int)(rd.nextDouble()*10);//se crea el numero randon
            numerosordenados.add(numalea);//se vincula el numero a la lista
        }
        Iterator item = numerosordenados.iterator();
        while (item.hasNext()) {//recorre la lista mientras tenga datos          
            System.out.println(item.next());
        }
        System.out.println("El primer numero de la lista es: " + numerosordenados.first());
        System.out.println("El primer numero de la lista es: " + numerosordenados.last());
        System.out.println("Cantidad de elementos de la lista es: " + numerosordenados.size());
        
   }
    
}
