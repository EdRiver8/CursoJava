
package  primerejercicio;

import java.util.Scanner;

public class PrimerEjercicio {


    public static void main(String[] args) {
        /*int x, y, res = 0; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar el primer numero: ");
        x = sc.nextInt();
        System.out.println("Ingresar el segundo numero: ");
        y = sc.nextInt();
        res = x % y;
        System.out.println("El Resultado es: " + res);
        int num, continuar;
        Scanner sc = new Scanner(System.in);               
        do{
            System.out.println("Ingrese un numero: ");
            num = sc.nextInt(); 
            if (num % 2 == 0) {
                 System.out.println("El numero es par");
             } else{
                    System.out.println("El numero es impar");
            }
            System.out.println("Desea provar con otro numero? "
                    + "1 para si, 0 para no");
            continuar = sc.nextInt();
        }while(continuar != 0);*/
        
        
        /*int num1, num2, caso, opcion;
        System.out.println("Este programa realiza las operaciones basicas"
                + " entre dos numeros");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero 1: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el numero 2: ");
        num2 = sc.nextInt();
        do{
            System.out.println("Ingrese la operacion deseada: "
                    +"\n" + "1. Sumar" + "\n" + "2. Restar" + "\n" + 
                    "3. Multiplicar" + "\n" + "4. Dividir");
            caso = sc.nextInt();
            switch(caso){
                case 1: System.out.println("El resultado es: " + (num1 + num2));
                break;
                case 2: System.out.println("El resultado es: " + (num1 - num2));
                break;
                case 3: System.out.println("El resultado es: " + (num1 * num2));
                break;
                case 4: System.out.println("El resultado es: " + (num1 / num2));
                break;
                }
            System.out.println("Desea hacer otra operacion? "
                    + "1 para si, 0 para no");
            //System.out.print("\f");
            //System.out.flush();
            opcion = sc.nextInt();
        }while(opcion != 0);*/
        
        //Se usara un ciclo For, para sumar los numeros del 1 al 10
        /*int resultado = 1;
        for (int i = 2; i <= 100; i++) {
                resultado = resultado + i;
            }
        System.out.println("La sumatoria de los numeros"
                + " del 1 al 100 es: " + resultado);*/
        System.out.println("Este programa ordena el peso de 3 objetos");
        int peso1, peso2, peso3, mayor, menor, medio;
        Scanner sc = new Scanner(System.in);//creamos objeto tipo Scanner llamado sc, que sirve para guardar datos
        System.out.println("Ingrese el peso 1: "); 
        peso1 = sc.nextInt();//se guarda lo q ingresa el usario en peso1
        System.out.println("Ingrese el peso 2: "); 
        peso2 = sc.nextInt();
        System.out.println("Ingrese el peso 3: "); 
        peso3 = sc.nextInt();
        if (peso1 > peso2) {//se compara peso1 contra el dos
            if (peso1 > peso3) {//se comparar peso1 contra el tres
                mayor = peso1;//si se cumple todo es porq el mayor es peso1
                if (peso2 > peso3) {//se comparan peso2 y 3 para hayar el menor y del medio
                    medio = peso2;
                    menor = peso3;
                }else{
                    medio = peso3;
                    menor = peso2;
                }
            }else {
                mayor = peso3;
                menor = peso2;
                medio = peso1;
            }
        }else {
            if (peso2 > peso3) {
                mayor = peso2;
                if (peso1 > peso3) {
                    menor = peso3;
                    medio = peso1;                
                }else{
                    menor = peso1;
                    medio = peso3;
                }
            }else{
                mayor = peso3;
                medio = peso2;
                menor = peso1;
            }
        }
        System.out.println("Los pesos ordenados en forma ascendente son:");
        System.out.println("Menor: " + menor + ", medio: " + medio + " y mayor: " + mayor);
    }
        
}

    
