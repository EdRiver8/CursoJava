
package appparcial;

import java.util.Random;

public class AppParcial {


    public static void main(String[] args) {
        int n, cantidad, valorUnidad;
        Random r = new Random();
        n = r.nextInt(5)+5;
        ListaSimple[] vector = new ListaSimple[n];  
        String nombre;
        ListaSimple lista = new ListaSimple();
        Mercancia mer;
        int metodo[];
        for (int i = 0; i < n; i++) {
            nombre = "Producto" + (i+1);
            cantidad = r.nextInt(2)+3;
            valorUnidad = r.nextInt(30)+20;
            mer = new Mercancia(nombre, valorUnidad, cantidad);
            lista.insertarFinal(mer);
            vector[i] = lista;
        }
        lista.imprimir();
//        metodo = MetodoEstatico.vector(lista);

        
    }
    
}
