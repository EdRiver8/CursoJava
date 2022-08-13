
package parcial;


import java.util.Random;

public class polf2 {

    private int cantTerminos;
    private int[] vector;

    public polf2(int cantTerminos) {
        this.cantTerminos = cantTerminos;
        vector = new int[(cantTerminos * 2) + 1];
        vector[0] = cantTerminos;
        generarPolF2();
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

    private void generarPolF2() {
        Random r = new Random();
        int exp, max, min;
        vector[1] = r.nextInt(cantTerminos) + cantTerminos;
        vector[2] = r.nextInt(10);
        if (vector[2] % 2 == 0){
            vector[2] = vector[2]+1;
        }
        for (int i = 3; i < cantTerminos * 2 + 1; i = i + 2) {

            max = vector[i - 2];
            min = vector[i - 2] - 2;
            exp = (int) (Math.random() * (max - min)) + min;

            vector[i] = exp;
            vector[i + 1] = r.nextInt(10) - 20;
            if (vector[i + 1] % 2 == 0){
                vector[2] = vector[2]+1;
            }
        }
    }

    public void mostrarPolinomio() {
        for (int i = 0; i < vector[0] * 2 + 1; i++) {
            System.out.print(vector[i] + " | ");
        }

        System.out.println("\n");
        
        if ( vector [1] > 0){
           System.out.print("" + vector[1] + "X^" + vector[2]); 
        }else{
            System.out.print(vector[1] + "X^" + vector[2]);
            }
        for (int i = 1; i < cantTerminos * 2 + 1; i = i + 2) {
            if (vector[i+1]>0){
                if(vector[i]>1){
                    System.out.print(" + " + vector[i + 1] + "X^" + vector[i]);
                }
                else{
                    if(vector[i]==1){
                        System.out.print(" + " + vector[i + 1] + "X");
                    }
                    else{
                        if(vector[i]==0){
                            System.out.print(" + " + vector[i + 1]);
                        }
                        System.out.print(" + " + vector[i + 1]);
                    }
                }
            }
            else{
                if(vector[i+1] == 0){
                    System.out.print("");
                }
                else{
                    System.out.print("" + vector[i + 1] + "X^" + vector[i]);
                }
            }
            
        }
    }
}

