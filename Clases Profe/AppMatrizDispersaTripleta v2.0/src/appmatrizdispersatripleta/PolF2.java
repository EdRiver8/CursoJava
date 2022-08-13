package appmatrizdispersatripleta;

import java.util.Random;

public class PolF2 {

    private int cantTerminos;
    private int[] vector;

    public PolF2(int cantTerminos) {
        this.cantTerminos = cantTerminos;
        vector = new int[(cantTerminos * 2) + 1];
        vector[0] = cantTerminos;
        generarPolF2Aleatorio();
    }

    public void setCantTerminos(int cantTerminos) {
        this.cantTerminos = cantTerminos;
    }

    public int[] getVector() {
        return vector;
    }

    public int getVector(int pos) {
        return vector[pos];
    }

    private void generarPolF2Aleatorio() {
        Random r = new Random();
        int coef, exp, max, min;
        vector[1] = r.nextInt(cantTerminos) + cantTerminos;
        vector[2] = r.nextInt(10) + 1;

        for (int i = 3; i < cantTerminos * 2 + 1; i = i + 2) {

            max = vector[i - 2];
            min = vector[i - 2] - 2;
            exp = (int) (Math.random() * (max - min)) + min;

            vector[i] = exp;
            vector[i + 1] = r.nextInt(10) + 1;
        }
    }

    public void mostrarPolinomio() {
        for (int i = 0; i < vector[0] * 2 + 1; i++) {
            System.out.print(vector[i] + " | ");
        }

        System.out.println("\n");

        for (int i = 1; i < cantTerminos * 2 + 1; i = i + 2) {
            System.out.print(" + " + vector[i + 1] + "X^" + vector[i]);
        }
    }
}
