
package dec_a_binario;

import java.util.Scanner;


public class Dec_a_Binario {

    public static void main(String[] args) {
        System.out.println("Este programa pasa un numero decimal a binario");
        int num, residuo, exp;
        double binario;
        Scanner sc = new Scanner(System.in);
        do {            
            System.out.println("Ingrese un numero positivo que desee pasar a binario: ");
            num = sc.nextInt();
        } while (num < 0);
        binario = 0;
        exp = 0;
        while ((num / 2) >= 1) {        
            residuo = num % 2;
            num = num / 2;
            binario = binario + residuo * Math.pow(10, exp);
            exp++;
        }
        System.out.println("El numero en binario es: " + binario);
    }
    
}
