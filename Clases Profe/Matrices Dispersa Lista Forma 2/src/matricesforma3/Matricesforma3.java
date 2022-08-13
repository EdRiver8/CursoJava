package matricesforma3;

import java.util.Random;
import java.util.Scanner;

public class Matricesforma3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int mat[][];
        int n, m, d, term = 0;
        System.out.print("Ingrese el numero de filas:");
        n = sc.nextInt();
        System.out.print("Ingrese el numero de columnas:");
        m = sc.nextInt();
        mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                d = r.nextInt(4) + 0;
                mat[i][j] = d;
            }
        }

        System.out.println("MATRIZ.");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        
        matrizf3 a = new matrizf3();
        
        a.llenarmatriz3(n, m, 0);
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(mat[i][j] != 0){
                    a.llenarmatriz3(i, j, mat[i][j]);
                }
            }
        }        
       
        a.mostrar();
    }

}
