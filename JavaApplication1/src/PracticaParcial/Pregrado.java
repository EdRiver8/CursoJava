/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaParcial;

/**
 *
 * @author sala205
 */
public class Pregrado extends Estudiante
{
   double prom;

    public Pregrado(String nombre,double prom) 
    {
        super(nombre);
        this.prom=prom;
    }

    public double getProm() {
        return prom;
    }

    public void setProm(double prom) {
        this.prom = prom;
    }
   
   @Override
    public void mostrarEstudiante()
    {
        System.out.println("Nombre:"+""+nombre);
        System.out.println("Promedio:"+""+getProm());
    }
   
    
}
