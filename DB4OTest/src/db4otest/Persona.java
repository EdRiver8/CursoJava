
package db4otest;

public class Persona {

    private String nombre;
    private int edad;
    private double peso;
    private double estatura;

    public Persona() {
    }

    public Persona(String nombre, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.estatura = altura;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double altura) {
        this.estatura = altura;
    }

    @Override
    public String toString() {      
        return  nombre + ", Edad: " + edad + ", Peso: " + peso + ", Estatura: " + estatura;    
    }    
}
