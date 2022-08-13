package arbolbusquedaavl;


public class Nodo {
    int dato, fe; //factor de equilibrio
    Nodo hijoIzq, hijoDer; // hijo izquierdo y derecho
    
    public Nodo(int d){
        this.dato = d;
        this.fe = 0;//se crean con cero, puesto q no tienen hijos ni padres por el momento
        this.hijoIzq = null;
        this.hijoDer = null;
    }
    
    public int getDato() {
        return dato;
    }

    public Nodo getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(Nodo hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public Nodo getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(Nodo hijoDer) {
        this.hijoDer = hijoDer;
    }
    
}
