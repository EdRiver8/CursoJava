package quiz;


import java.util.Random;


public class PoliF1 {
    private int grado;
    private int vector[];

    public  PoliF1(int grado) {
        this.grado = grado;
        vector = new int[grado + 2];
        vector[0] = grado;
        llenarPolinomio();
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public int[] getVector() {
        return vector;
    }
    
    private void llenarPolinomio(){
        Random r = new Random();                
        for (int i = 1; i < grado+2; i++) {
            vector[i] = r.nextInt(5)+5;//llena el vector con valores entre -5 y 5
            /*if(vector[i]<0){
            System.out.print("" + vector[i] + "");//para coeficientes negativos
            }
            else{
               System.out.print("" + vector[i] + ""); //para coeficientes positivos
            }*/
        }
    }
    
    public void mostrarPolinomio(){
        for (int i = 1; i < grado + 2; i++) {
            if(vector[i]>0){
            System.out.print(" + " + vector[i] + "X^" + ((grado+1)-i));//para coeficientes positivos
            }
            else{
                System.out.print("" + vector[i] + "X^" + ((grado+1)-i));//para coeficientes negativos
            }
        }
        System.out.println("");
    }
}
