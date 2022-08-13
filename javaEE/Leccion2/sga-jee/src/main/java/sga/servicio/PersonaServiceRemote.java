
package sga.servicio;

import java.util.List;
import javax.ejb.Remote;
import sga.domain.Persona;

@Remote
public interface PersonaServiceRemote {
    
    public List<Persona> listaPersona();
    public Persona encontrarPersonaId(Persona persona);
    public Persona encontrarPersonaEmail(Persona persona);
    public void registrarPersona(Persona persona);
    
}
