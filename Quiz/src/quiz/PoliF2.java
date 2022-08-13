package quiz;


import java.util.Random;


public class PoliF2 {
    private int cantTerminos;
    private int[] vector;

    public PoliF2(int cantTerminos) {//recibe la cantidad de teminos, ya que es forma 2 y en la 
        this.cantTerminos = cantTerminos;//primera posicion guarda la cantidad de terminos del polin
        vector = new int[(cantTerminos * 2) + 1];
        vector[0] = cantTerminos;
        llenarPoliF2();
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
    
    private void llenarPoliF2(){//llena el poliF2 con coeficientes impares
        Random r = new Random();  
        int coe;
        for (int i = 1; i < (cantTerminos * 2) + 1; i = i + 2) {//avanza el vector en dos para ir
            coe = r.nextInt(5) + 5;
            vector[i+1] = coe;//lleva el coeficiente impar a la posicion i
            vector[i] = ((cantTerminos*2)+1) - i;//lleva el grado del coeficiente i ordenado
        }        
    }
    
    public void mostrarPolinomio(){
        //System.out.print("El PoliF2 Organizado es: " );        
        for (int i = 1; i < vector.length; i = i + 2) {
            //System.out.print(" " + vector[i+1] + "X^" + vector[i]+"");
            if(vector[i+1]>0){//positivos
                System.out.print(" + " + vector[i+1] + "X^" + vector[i]);//para coeficientes positivos
            }
            else{//negativos
                System.out.print("" + vector[i+1] + "X^" + vector[i]);//para coeficientes negativos
            }
        }
    }
}
