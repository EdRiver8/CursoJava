
package appmatrizdispl1f1;

public class nodo {
    private nodo l, lf, lc;
    private int f, c, dato; // f = fila, c = columna

    public nodo(int f, int c, int dato) {
        this.f = f;
        this.c = c;
        this.dato = dato;
        l = null;
        lf = null;
        lc = null;
    }

    public nodo getL() {
        return l;
    }

    public void setL(nodo l) {
        this.l = l;
    }

    public nodo getLf() {
        return lf;
    }

    public void setLf(nodo lf) {
        this.lf = lf;
    }

    public nodo getLc() {
        return lc;
    }

    public void setLc(nodo lc) {
        this.lc = lc;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    
    
}
