
package operaciones;

public class Operadores {

       
       public int sumar(int num1, int num2 ){
           int suma = num1 + num2;
           return suma;
       }
       
       public int restar(int num1, int num2 ){
          int resta = num1 - num2;
          return resta;
       }
              
       public int multiplicar(int num1, int num2 ){
           int multiplicar   = num1 * num2;
           return multiplicar;  
       }
              
       public int dividir(int num1, int num2 ){
           int dividir = num1 / num2;
           return dividir;
       } 
       
       public int residuo (int num1, int num2 ){
           int res = num1 % num2;
           return res;
       }    
       
       public void imprimir(int suma, int resta, int mult, int div, int res){
           System.out.println("El resultado de la suma es: " + suma);
           System.out.println("El resultado de la resta es: " + resta);
           System.out.println("El resultado de la multiplicacion es: " + mult);
           System.out.println("El resultado de la division es: " + div + "," + res);
       }
}
