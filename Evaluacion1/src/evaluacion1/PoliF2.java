package evaluacion1;


import java.util.Random;


public class PoliF2 {
    private int cantTerminos;
    private int[] vector;

    public PoliF2(int cantTerminos) {//recibe la cantidad de teminos, ya que es forma 2 y en la 
        this.cantTerminos = cantTerminos;//primera posicion guarda la cantidad de terminos del polin
        vector = new int[(cantTerminos * 2) + 1];
        vector[0] = cantTerminos;
        llenarPoliF2Impares();
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
    
    private void llenarPoliF2Impares(){//llena el poliF2 con coeficientes impares
        Random r = new Random();
        int coe = r.nextInt(10)-5;
        for (int i = 1; i < (cantTerminos * 2) + 1; i++) {//avanza el vector en dos para ir
            while(coe % 2 != 0){//buscando los coeficientes buscando los impares entre -5 y 5
            coe = r.nextInt(10)-5;
            }
            vector[i+1] = coe;//lleva el coeficiente impar a la posicion i
            vector[i] = ((cantTerminos*2)+1)-i;//lleva el grado del coeficiente i ordenado
        }        
    }
    
    public void mostrarPolinomio(){
        System.out.print("Los terminos y coeficientes del PoliF2 son: ");
        for (int i = 0; i < vector[0]*2+1; i++) {
            System.out.print(vector[i] + " | ");
        }
        
        System.out.println("\n");
        System.out.print("El PoliF2 Organizado es: " );
        for (int i = 1; i < cantTerminos * 2 + 1; i = i + 2) {
            System.out.print(vector[i+1] + "X^" + vector[i]+"");
        }
    }
}
