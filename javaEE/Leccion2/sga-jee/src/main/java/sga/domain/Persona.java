
package sga.domain;

import java.io.Serializable;

public class Persona implements Serializable{
    private static final long serialVersionUID = 1L;
    private int idPersona;
    private String nombre;
    private String apelliido;
    private String email;
    private String telefono;
    
    public Persona(){
        
    }

    public Persona(int idPersona, String nombre, String apelliido, String email, String telefono) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apelliido = apelliido;
        this.email = email;
        this.telefono = telefono;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelliido() {
        return apelliido;
    }

    public void setApelliido(String apelliido) {
        this.apelliido = apelliido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apelliido=" + apelliido + ", email=" + email + ", telefono=" + telefono + '}';
    }


    
    
}
