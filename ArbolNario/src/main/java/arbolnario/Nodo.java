
package arbolnario;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Nodo {
    
    private boolean sw;
    private Object dato;
    private Nodo ld;
    private Nodo ll;

    public Nodo() {
        this.sw = false;
        this.dato = null;
        this.ld = null;
        this.ll = null;
    }   

    public Nodo(boolean sw, Object dato) {
        this.sw = sw;
        this.dato = dato;
    }
    
    @Override
    public void finalize(){        
        try {        
            super.finalize();
        } catch (Throwable ex) {
            Logger.getLogger(Nodo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean getSw() {
        return sw;
    }

    public void setSw(boolean sw) {
        this.sw = sw;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getLd() {
        return ld;
    }

    public void setLd(Nodo ld) {
        this.ld = ld;
    }

    public Nodo getLl() {
        return ll;
    }

    public void setLl(Nodo lh) {
        this.ll = lh;
    }

    @Override
    public String toString() {
        return dato.toString();
    }    
    
}

