package appmaterias;

import java.io.IOException;
import java.util.Random;

public class NewMain {

    public static void main(String[] args) throws IOException {
        Random r = new Random();
        Estudiante arrayEst[][] = new Estudiante[3][3];
        Estudiante est;
        Materia mat;
        double promAcum;
        int cantMats, cantNotas, nota;
        for (int i = 0; i < 3; i++) {
            System.out.println(":::::::: SEMESTRE " + (i + 1) + ":::::::::::::");
            for (int j = 0; j < 3; j++) {
                System.out.println(":::::::: ESTUDIANTE " + (j + 1) + ":::::::::::::");
                est = new Estudiante("Estudiante" + (j + 1), r.nextInt(7) + 19);
                cantMats = r.nextInt(5) + 5;
                System.out.println("Cant. Materias: " + cantMats);

                for (int k = 0; k < cantMats; k++) {
                    System.out.println("---------- MATERIAS " + (k + 1) + "-------------");
                    mat = new Materia("Mat" + (j + 1));
                    cantNotas = r.nextInt(5) + 5;
                    System.out.println("Cant. Notas: " + cantNotas);

                    for (int l = 0; l < cantNotas; l++) {
                        nota = r.nextInt(6);
                        mat.agragarNota(nota);
                    }

                    System.out.println("Materia: " + mat.getNomMat());
                    System.out.println("Lista de Notas: ");
                    mat.mostrarNotas();
                    System.out.println("Definitiva: " + mat.calcularDefinitiva());
                    est.agragarMaterias(mat);
                    char ch = (char) System.in.read();
                }
                System.out.println("Estudiante: " + est.getNombreEst());
                est.calcularPromAcum();
                System.out.println("Promedio Acumulado: " + est.getPromAcumEst());
                arrayEst[i][j] = est;
                char ch = (char) System.in.read();
            }
        }
        
        MatrizDispersaLLF1 mllf2 = new MatrizDispersaLLF1();
        mllf2.generarCabezas(3, 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(arrayEst[i][j].getPromAcumEst() < 2.6)
                    mllf2.insertar(i, j, arrayEst[i][j]);
            }
        }
        
        mllf2.mostrar();
    }
}
