
package parcial;

import java.util.Random;

public class Parcial {

    public static void main(String[] args) {
        Random r = new Random();
        polf1 p1;
        polf2 p2;
        int n = r.nextInt(3)+3;
        System.out.println("La matriz sera de tamaño N*N = "+ n + "*" + n + "\n");
        Object matrizPols[][] = new Object[n][n];
        
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                n = r.nextInt(2);
                if (n == 0) {
                    n = r.nextInt(2)+3;
                    p1 = new polf1(n);
                    matrizPols[i][j] = p1;
                } else {
                    n = r.nextInt(2)+3;
                    p2 = new polf2(n);
                    matrizPols[i][j] = p2;
                }
            }
        }
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if(matrizPols[i][j] instanceof polf1)
                    ((polf1)matrizPols[i][j]).mostrarPolF1();
                else
                    ((polf2)matrizPols[i][j]).mostrarPolinomio();
            }
        }
        System.out.println("\n");
        Tripleta t = new Tripleta(matrizPols);
        
    }
    
}
