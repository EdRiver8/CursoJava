
import javax.swing.JOptionPane;


public class Graficos {
    
    public static void main (String [] args){
        String n1 = JOptionPane.showInputDialog("Ingresa el primer numero: ");
        String n2 = JOptionPane.showInputDialog("Ingresa el segundo numero a operar: ");
        
        double num1 = Double.parseDouble(n1);
        double num2 = Double.parseDouble(n2);
        
        Operaciones op = new Operaciones();
        
        double suma = op.sumar(num1, num2);
        double resta = op.restar(num1, num2);
        double mult = op.multiplicar(num1, num2);
        double div = op.dividir(num1, num2);
        
        JOptionPane.showMessageDialog(null, "Suma = " + suma + "\n" + "Resta = " + resta
        + "\n" + "Multiplicacion = " + mult + "\n" + "Division = " + div);
        
    }
}
