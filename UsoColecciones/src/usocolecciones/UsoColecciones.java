
package usocolecciones;
import java.io.BufferedReader;
import java.io.*;
import java.io.InputStreamReader;
import java.util.*;

public class UsoColecciones {

    public static void main(String[] args) throws IOException {
        Vector<Estudiante> estudiantes = new Vector<Estudiante>();//tipo de datos q contrenda el vector
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        String dato;
        do {
            Estudiante a = new Estudiante();
            System.out.println("Ingrese el nombre: ");
            dato = lector.readLine();
            a.Nombre = dato;
            System.out.println("Ingrese el apellido: ");
            dato = lector.readLine();
            a.Apellidos = dato;
            System.out.println("Ingrese la nota: ");
            dato = lector.readLine();
            a.nota = Integer.parseInt(dato);
            estudiantes.add(a);
            System.out.println("Desea continuar (s/n)? ");
            dato = lector.readLine();
        } while (dato.equals("s"));
        System.out.println("La cantidad de estudiantes es: " + estudiantes.size());
        int indicemayor = 0, indicemenor = 0, mayor = 0, menor = estudiantes.get(1).nota;
        double promedio = 0;
        for (int i = 0; i < estudiantes.size(); i++) {
            Estudiante a = estudiantes.get(i);
            if (a.nota > mayor) {
                mayor = a.nota;
                indicemayor = i;
            }
            if (a.nota < menor) {
                menor = a.nota;
                indicemenor = i;
            }
            promedio += a.nota;
        }
        promedio = promedio / estudiantes.size();
        System.out.println("Nota Mayor = " + mayor + " la tiene el estudiante " + estudiantes.get(indicemayor).Nombre
        + " " + estudiantes.get(indicemayor).Apellidos);
        System.out.println(".................................................................................");
        System.out.println("Nota Menor = " + menor + " la tiene el estudiante " + estudiantes.get(indicemenor).Nombre
        + " " + estudiantes.get(indicemenor).Apellidos);
        System.out.println("..................................................................................");
        System.out.println("El promedio de las notas es: " + promedio);
        System.out.println("..................................................................................");
        lector.readLine();
    }
    
}
