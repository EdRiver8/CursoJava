
public class Operaciones {
    
    private double n1;
    private double  n2;

    public Operaciones() {
        this.n1 = 0;
        this.n2 = 0;
    }
    
    public double sumar(double num1, double num2 ){
       n1 = num1;
       n2 = num2;
       double suma = n1 + n2;
       return suma;
    }

    public double restar(double num1, double num2 ){
       n1 = num1;
       n2 = num2;
      double resta = n1 - n2;
      return resta;
    }

    public double multiplicar(double num1, double num2 ){
       n1 = num1;
       n2 = num2;
       double multiplicar   = n1 * n2;
       return multiplicar;  
    }

    public double dividir(double num1, double num2 ){
       n1 = num1;
       n2 = num2;
       double dividir = n1 / n2;
       return dividir;
    } 
       
}
