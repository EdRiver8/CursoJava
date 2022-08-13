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
public class Posgrado extends Estudiante
{
    String nombreTesis;

    public Posgrado(String nombre, String nombreTesis) 
    {
        super(nombre);
        this.nombreTesis=nombreTesis;
    }

    public String getNombreTesis() {
        return nombreTesis;
    }

    public void setNombreTesis(String nombreTesis) {
        this.nombreTesis = nombreTesis;
    }
    
    
    @Override
    public void mostrarEstudiante()
    {
        System.out.println("Nombre"+""+nombre);
        System.out.println("Nombre tesis"+""+getNombreTesis());
    }
    
    
}
