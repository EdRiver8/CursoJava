
package operaciones;

import java.util.Scanner;

public class Operaciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: "); 
        int n2 = sc.nextInt();
        Operadores op= new Operadores();
        int suma = op.sumar(n1, n2);
        int resta = op.restar(n1,n2);
        int multi = op.multiplicar(n1,n2);
        int div = op.dividir(n1,n2);
        int res = op.residuo(n1,n2);
        op.imprimir(suma, resta, multi, div, res);
    }
    
}
