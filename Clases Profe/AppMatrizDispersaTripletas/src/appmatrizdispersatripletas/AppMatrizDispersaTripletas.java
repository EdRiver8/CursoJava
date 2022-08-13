
package appmatrizdispersatripletas;

import java.util.Random;

public class AppMatrizDispersaTripletas {

    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        Random r = new Random();
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = r.nextInt(99) + 1;
            }
        }
        
        System.out.println("Matriz Original -------------------");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        System.out.println("Matriz de Tripletas -------------------");
        MatrizDispersaTripletas tripletas 
                = new MatrizDispersaTripletas(matriz);
        
        tripletas.mostrarMatrizTripletas();
    }
}
