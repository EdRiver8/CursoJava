
package appmatrizdispl1f1;

import java.util.Random;

public class Appmatrizdisplifi {

    public static void main(String[] args) {
        Random r = new Random();
        int matriz[][] = new int [3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = r.nextInt(2);
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println(" ");
        }
        matrizDispersaL1F1 mf1 = new matrizDispersaL1F1();
        mf1.generarCabezas(3,3);
        for (int i = 0; i < 3; i++){
             for(int j = 0; j < 3; j++){
                 if (matriz [i][j] == 1){
                    mf1.insertar(i, j, matriz[i][j]);
                 }
            }
            mf1.mostrar();
        }
    }
}
    
    


