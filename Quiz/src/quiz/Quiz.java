
package quiz;

import java.util.Random;

public class Quiz {

    public static void main(String[] args) {
                        
        Random r = new Random();
        int n = r.nextInt(3)+3;//n = cantidad de elementos de la lista
        System.out.println("La cantidad de polinomios en la lista es: " + n);
        ListaSimple lista = new ListaSimple();
        /*int x = r.nextInt(3)+3;
        System.out.println("grado " + x);
        PoliF1 polf1 = new PoliF1(x);//el grado se encontrara entre 5 y 10
        polf1.mostrarPolinomio();
        int x = r.nextInt(3)+3;
        System.out.println("Polf2 cantidad terminos: " + x);
        PoliF2 polf2 = new PoliF2(r.nextInt(5)+5);
        polf2.mostrarPolinomio();
        */
        for (int i = 0; i < n; i++) {
            if(i%2 == 0){//para intercalar los polinomios, los pares son polf1, impares polf2
                int x = r.nextInt(5)+5;
                PoliF1 polf1 = new PoliF1(x);//el grado se encontrara entre 5 y 10
                System.out.println("Polf1 de grado: " + x);
                polf1.mostrarPolinomio();
                lista.adicionar(polf1);//agrego el polf1 generado a la lista
            }
            else{
                int x = r.nextInt(5)+5;
                PoliF2 polf2 = new PoliF2(x);
                System.out.println("Polf2 cantidad terminos: " + x);
                lista.adicionar(polf2);//agrego el polf2 generado a la lista
            }
        }
        System.out.println(lista);   

    }
    
}
