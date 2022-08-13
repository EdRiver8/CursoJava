package appmatrizdispersatripleta;

import java.util.Random;

public class AppMatrizDispersaTripleta {

    public static void main(String[] args) {
        Random r = new Random();
        Object matrizPols[][] = new Object[3][4];
        PolF1 pf1;
        PolF2 pf2;
        int n;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                n = r.nextInt(2);
                if (n == 0) {
                    pf1 = new PolF1(5);
                    matrizPols[i][j] = pf1;
                } else {
                    pf2 = new PolF2(5);
                    matrizPols[i][j] = pf2;
                }
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if(matrizPols[i][j] instanceof PolF1)
                    ((PolF1)matrizPols[i][j]).mostrarPolF1();
                else
                    ((PolF2)matrizPols[i][j]).mostrarPolinomio();
            }
        }
        System.out.println("\n");
        Tripleta t = new Tripleta(matrizPols);


//       int matriz[][] = new int[r.nextInt(5)+1][r.nextInt(5)+1];
//       
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[0].length; j++) {
//                matriz[i][j] = r.nextInt(2);
//                System.out.print(matriz[i][j] + "\t");
//            }
//            System.out.println("");
//        }
//        System.out.println("\n");
//        Tripleta t = new Tripleta(matriz);
    }
}
