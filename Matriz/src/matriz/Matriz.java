
package matriz;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        /*System.out.println("Este programa crea una matriz de datos");
        Scanner sc = new Scanner(System.in);        
        int dato, n, m;//n y me son las dimensiones de la matriz
        System.out.println("Ingrese la cantidad de filas: ");
        n = sc.nextInt();
        System.out.println("Ingrese la cantidad de columnas: ");
        m = sc.nextInt();
        int mat[][] = new int[n][m];//es la forma correcta para crear mat o vec
        System.out.println("Ensayo antes de los paras");
        for (int i = 0; i < n; i++) {//controla flas
           System.out.println("ensayo fuera del ciclo de las j"); 
           for (int j = 0; j < m; j++) {//controla columna
               System.out.println("Ingrese el dato en la posicion: " + i
                + "," + j + ":");//se le dice al usuario q ingrese el dato en la pos especifica
               dato = sc.nextInt();//Guarda el valor ingresado por el usuario en la variable dato
               mat[i][j] = dato;//matriz en pos i,j le llevamos el dato ingresado por el usuario
            }
        }
        System.out.println("");
        //Paras que recorren y muestran lo que hay en la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j]);
                System.out.print(",");
            }
            System.out.println("");
        }*/
        /*System.out.println("Este programa busca el dato mayor en un vector");
        int dato, may, tam;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingese el tamaño del vector: ");
        tam = sc.nextInt();
        int vec[] = new int[tam];
        for (int i = 0; i < tam; i++) {
            System.out.println("Ingrese el dato numero " + (i+1) + ": ");
            dato = sc.nextInt();
            vec[i] = dato;
        }
        may = vec[0];
        for (int i = 0; i < tam; i++) {
            if (vec[i] > may) {
                may = vec[i];
            }
        }
        System.out.println("El dato mayor del vector es: " + may);*/
        
        System.out.println("Este programa busca el dato menor en una matriz");
        int dato, men, n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingese la cantidad de filas: ");
        n = sc.nextInt();
        System.out.println("Ingese la cantidad de columnas: ");
        m = sc.nextInt();
        int mat[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Ingrese el dato de la posicion " 
                        + (i+1) + "," + (j+1) + ": ");
                dato = sc.nextInt();
                mat[i][j] = dato;
            }            
        }
        men = mat[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] < men) {
                    men = mat[i][j];
                }              
            }
        }
        System.out.println("El dato mayor del vector es: " + men);
    }
    
}
