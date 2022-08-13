/*se pidio a 20 estudiantes que calificaran la comida de la cafeteria estudiantil,
en una escala del 1 al 5, en donde 1 significa pesimo y 5 excelente. coloque
las 20 respuestas en un arreglo entero y determine la frecuencia de cada
calificacion.
*/

package encuesta;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Encuesta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de estudiantes encuestados: ");
        int n = sc.nextInt();
        int [] respuestas = new int[n];
        for (int i = 0; i < respuestas.length; i++) {
            System.out.print("Ingrese la calificacion del estudiante #" + (i+1) + ": ");
            respuestas[i] = sc.nextInt();
        }
        //arreglo de contador de frecuencia
        int [] frecuencia = new int [6];
        //para cada respuesta seleccionada, selecciona el elemento de respuesta
        // y usa su valor como indice de frecuencia para determinar el elemento
        //a incrementar
        for (int j = 0; j < respuestas.length; j++) {
            try {
                //ciclo anidado, va sumando uno a uno los elementos en el arreglo
                //frecuencias
                frecuencia[respuestas[j]] += 1; 
            }catch (ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null, "Calificacion Incorrecta: " + respuestas[j]);
            }            
        }
        System.out.printf("%s %10s\n", "Calificacion", "Frecuencia");
        
        for (int calificacion = 1; calificacion < frecuencia.length; calificacion++) {
            System.out.printf("%6d %10d\n", calificacion, frecuencia[calificacion]);
        }
    }
    
}
