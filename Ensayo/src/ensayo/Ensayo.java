
package ensayo;

public class Ensayo {

    public static void main(String[] args) {
        Tren primero = new Tren(); 
        Tren segundo = new Tren("Juan",30);
        System.out.println(primero.maquinista + ", antiguedad: " + primero.antiguedad);
        System.out.println(segundo.maquinista + ", edad: " +  segundo.antiguedad);
        System.out.println(primero.vagones[2][1]);
    } 
    
}
