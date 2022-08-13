package appmaterias;

import java.io.IOException;
import java.util.Random;

public class AppMaterias {

    public static void main(String[] args) throws IOException {
        Random r = new Random();
        Materia arrayMats[][] = new Materia[3][3];
        Materia mat;
        int nota;
        int cantNotas;
        for (int i = 0; i < 3; i++) {
            System.out.println(":::::::: ESTUDIANTE " + (i+1) + ":::::::::::::");
            for (int j = 0; j < 3; j++) {
                System.out.println("---------- AREA " + (j+1) + "-------------");
                mat = new Materia("Mat" + (j + 1));
                cantNotas = r.nextInt(5) + 5;
                System.out.println("Cant. Notas: " + cantNotas);

                for (int k = 0; k < cantNotas; k++) {
                    nota = r.nextInt(6);
                    mat.agragarNota(nota);
                }

                System.out.println("Materia: " + mat.getNomMat());
                System.out.println("Lista de Notas: ");
                mat.mostrarNotas();
                System.out.println("Definitiva: " + mat.calcularDefinitiva());
                arrayMats[i][j] = mat;
                char ch = (char) System.in.read();
            }
            System.out.println("");
        }
        
        Tripleta t = new Tripleta(arrayMats);

    }
}
