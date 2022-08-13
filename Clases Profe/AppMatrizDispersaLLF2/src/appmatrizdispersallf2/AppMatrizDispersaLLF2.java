
package appmatrizdispersallf2;

import java.util.Random;


public class AppMatrizDispersaLLF2 {


    public static void main(String[] args) {
        
        int mat[][] = new int[new Random().nextInt(4)+2][new Random().nextInt(4)+2];
        MatrizDispersaLLF2 mf2 = new MatrizDispersaLLF2();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = new Random().nextInt(2);
                System.out.print(mat[i][j] + "\t");
                
                if(mat[i][j] == 1){
                    mf2.generarMatrizDispersaLLF2(i, j, mat[i][j]);
                }
            }
            System.out.println("");
        }
        System.out.println("----------------------------------\n");
        mf2.mostrarMatrizDispersaLLF2();
    }
}
