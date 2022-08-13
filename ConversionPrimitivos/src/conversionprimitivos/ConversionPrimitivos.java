
package conversionprimitivos;

import javax.swing.JOptionPane;
import javax.swing.text.html.HTMLEditorKit;

public class ConversionPrimitivos { 
     //tambien llamada Casting
     
    public static void main(String[] args) {
//          int a = 1;
//          double b = 2.5;
//          a = (int)b;//se hace un casting pero se pierden datos
//          JOptionPane.showMessageDialog(null, "El valor de a es: " + a);


//            int codigo = 107;
//            char codigoASCII = (char)codigo;
//            JOptionPane.showMessageDialog(null, "El char del codigo es: " + codigoASCII);


            //wraper o variables emboltorio
//            int num = 9;
//            Integer objInt = new Integer(num);//El "Integer" con I mayuscula es la variable de emboltorio
//            double numDou = objInt.doubleValue();//convierte num en un doble
//            short numShort = objInt.shortValue();
//            JOptionPane.showMessageDialog(null, "Numero convertido: " + numDou + " y " + numShort);
//

//            int compara = Integer.compare(8, 9);//tambien esta para los otros tipos de datos
//            if (compara == 0) {
//                System.out.println("Los valores son iguales");
//            }else{
//                System.out.println("Los valores son diferentes");
//            }
//            //System.out.println("El valor de comparacion es: " + compara);


              //numeros a caracteres
              int i = 5;
              byte b = 10;
              short s = 60;
              double d = 25.4;
              float f = 9.63f;
              
              String sI = ""+i;
              String sB = String.valueOf(b);
              String sS = Short.toString(s);
              String sD = Double.toString(d);
              String sF = String.valueOf(f);
              
              //cadenas de caracteres a numeros
              
              String dato = JOptionPane.showInputDialog("Introduzca un numero: ");
              double valor1 = Double.parseDouble(dato);
              double suma = 5.3 + valor1;
              JOptionPane.showMessageDialog(null, "El valor d   e la suma es: " + suma);
    }
    
}
