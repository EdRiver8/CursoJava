/* Le pedira a un usuario ingresar una cantidad x
de estudiantes para registrarlos en una lista de 
asistencia; la cual tendra los nombres y las edades;
*mostrar cuantos estudiantes son mayores de edad
*Mostrar los estudiantes mayores de edad
*/
package listaasistencia;

import java.util.Scanner;


public class ListaAsistencia {


    public static void main(String[] args) {
        int edad, cant;
        String name, genero;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Personas: ");
        cant = lectura.nextInt();
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese el nombre de la persona: " + (i+1));
            name = lectura.next();
            System.out.println("Ingrese el genero: " );
            genero = lectura.next();
            System.out.println("Ingrese la edad: ");
            edad = lectura.nextInt();
            if (edad >= 18) {
                System.out.println(name + "su " + genero +
                        "y es mayor de edad con: " + edad);
            }else {
                System.out.println(name + "su " + genero +
                        "y es menor de edad con: " + edad);
            }
            
        }
    }
    
}
