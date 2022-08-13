package appmatrizdispersatripleta;

import java.util.Random;

public class PolF1 {

    private int grado;
    private int[] vector;

    public PolF1() {
    }   
    
    public PolF1(int grado) {
        this.grado = grado;
        vector = new int[grado + 2];
        vector[0] = grado;

        generarPolF1Aleatorio();
    }

    public int getGrado() {
        return grado;
    }

    public int[] getVector() {
        return vector;
    }

    private void generarPolF1Aleatorio() {
        Random r = new Random();
        for (int i = 1; i < vector.length; i++) {
            vector[i] = (int) (r.nextInt(grado)*Math.pow(-1, r.nextInt(grado)));
        }
    }

    public void mostrarPolF1() {
        System.out.println("");
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] != 0) {
                if ((i != 1) && (vector[i] > 0)) {
                    System.out.print(" + ");
                }

                System.out.print(vector[i] + "X^" + (grado + 1 - i) + " ");
            }
        }
    }

}
