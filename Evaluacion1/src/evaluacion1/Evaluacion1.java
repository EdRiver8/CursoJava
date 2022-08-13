
package evaluacion1;

import java.util.Random;


public class Evaluacion1 {

    public static void main(String[] args) {
        
       Random r = new Random();
       PoliF1 polf1 = new PoliF1(r.nextInt(5)+5);//el grado se encontrara entre 5 y 10
       int canterminos = r.nextInt(10)-5;//la cantidad de terminos del polf2 va a estar entre 5 y 10
       PoliF2 polf2 = new PoliF2(canterminos);
    }
    
}
