
package dianacio;
//Pedir una fecha al usuario para calcular el día de la semana que nació.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class DiaNacio {

    public static void main(String[] args) throws IOException {
        int dia, mes, anio;
        String datomes, datodia, datoanio, fecha;
        System.out.println("Introduzca la fecha de nacimiento en el sigt formato (dd/mm/aaaa): ");
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        fecha = lector.readLine();
        int posicion = fecha.indexOf("/");//retorna el indice de la primer ocurrencia de lo que se pone en el
        datodia = fecha.substring(0, posicion);//retorna el string q hay desde 0 hasta la pos de /
        fecha = fecha.substring(posicion + 1);//actualiza la fecha, quitandole los datos anteriores
        posicion = fecha.indexOf("/");
        datomes = fecha.substring(0, posicion);
        fecha = fecha.substring(posicion + 1);
        datoanio = fecha;
        dia = Integer.parseInt(datodia);
        mes = Integer.parseInt(datomes);
        anio = Integer.parseInt(datoanio);
        if(mes == 1){
            mes = 13;
            anio--;
        }
        if (mes == 2) {
            mes = 14;
            anio--;
        }
        int ope1, ope2, ope3, ope4, ope5, ope6, ope7;
        //multiplico el mes mas 1 por 3 y dividirlo entre 5
        ope1 = ((mes + 1) * 3) / 5;
        //dividir el año entre 4
        ope2 = anio / 4;
        //dividir el año entre 100
        ope3 = anio / 100;
        //dividir el año entre 400
        ope4 = anio / 400;
        //sumar el dia, el doble del mes, el año, el resultado de la ope1, 
        //el resultado de la ope2, menos el resultado de la ope3 mas la ope4 mas 2
        ope5 = dia + (mes * 2) + anio + ope1 + ope2 +ope4 + 2 - ope3;
        //dividir el resultado anterior entre 7
        ope6 = ope5 / 7;
        //restar el numero del paso 5  con el numero del paso 6 por 7
        ope7 = ope5 - (ope6 * 7);
        String resultado = "";
        switch(ope7){
            case 0: resultado = "sabado";
                    break;
            case 1: resultado = "Domingo";
                    break;
            case 2: resultado = "Lunes";
                    break;
            case 3: resultado = "Martes";
                    break;
            case 4: resultado = "Miercoles";
                    break;
            case 5: resultado = "Jueves";
                    break;
            case 6: resultado = "Viernes";
                    break;
        }
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        System.out.println("El dia de la semana de su nacimiento fue: " + resultado);
        System.out.println("-----------------------------------");
        System.out.println("Fin Programa");
        
    }
    
}
