package arbolbinario;

public class Nodo {
    private Object dato;
    private Nodo li;
    private Nodo ld;
    
    public Nodo(){
        dato = null;
        li = null;
        ld = null;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getLi() {
        return li;
    }

    public void setLi(Nodo li) {
        this.li = li;
    }

    public Nodo getLd() {
        return ld;
    }

    public void setLd(Nodo ld) {
        this.ld = ld;
    }

    public String toString() {
        return dato.toString(); // para evitar q imprima la direccion del nodo
    }
    
    
}
