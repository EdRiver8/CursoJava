
package parcial;


import java.util.Random;

public class polf1 {

    private int grado;
    private int[] vector;

    public polf1() {
    }   
    
    public polf1(int grado) {
        this.grado = grado;
        vector = new int[grado + 2];
        vector[0] = grado;

        generarPolF1();
    }

    public int getGrado() {
        return grado;
    }

    public int[] getVector() {
        return vector;
    }

    private void generarPolF1(int x) {
        Random r = new Random();
        for (int i = 1; i < vector.length; i++) {
            vector[i] = (int) ((r.nextInt(grado)+5)*Math.pow(-1, r.nextInt(grado)));
        }
        comprobar();
    }
    
    private void generarPolF1() {
        Random r = new Random();
        for (int i = 1; i < vector.length; i++) {
            vector[i] = (int) ((r.nextInt(grado)+5)*Math.pow(-1, r.nextInt(grado)));
        }
        comprobar();
    }
    private void comprobar(){
        if (vector[1]==0){
           int i = 1, cont = 0;
           while (vector[i]==0){
               cont = cont + 1;
               i++;
           }
           if (cont != 0){
               vector [0] = vector[0-cont];
               for(int j = 0; j < vector.length; j++){
                    vector[j] = vector[j+cont];
               }
           }
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
