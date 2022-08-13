
package secuenciacollatz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecuenciaCollatz {

    public static void main(String[] args) throws IOException {
        int num = 1;
        boolean esnum = false;
        String dato;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        do {            
            try {                       
                System.out.println("Ingrese el numero al cual se le calculara Collatz: ");
                dato = lector.readLine();
                num = Integer.parseInt(dato);
                esnum = true;
            } catch (Exception ex) 
            {
                esnum = false;
            }

        } while (esnum == false);
        System.out.println("Secuencia de Collatz para el numero: " + num);
        while(num != 1 && num != 0)
        {
            if(num % 2 == 0)
            {
                num = num / 2;
            }else
            {
                num = num * 3 + 1;
            }
            System.out.println(num);
        }
        System.out.println("Fin Programa");
        
    }
    
}
