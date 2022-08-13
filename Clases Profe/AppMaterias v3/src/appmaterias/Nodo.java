
package appmaterias;


public class Nodo {
    private Nodo l;
    private Nodo lc;
    private Nodo lf;
    private int f;
    private int c;
    private Estudiante dato;

    public Nodo(int f, int c, Estudiante dato) {
        this.f = f;
        this.c = c;
        this.dato = dato;
        l = null;
        lc = null;
        lf = null;
    }

    public Nodo getL() {
        return l;
    }

    public void setL(Nodo l) {
        this.l = l;
    }

    public Nodo getLc() {
        return lc;
    }

    public void setLc(Nodo lc) {
        this.lc = lc;
    }

    public Nodo getLf() {
        return lf;
    }

    public void setLf(Nodo lf) {
        this.lf = lf;
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

    public Estudiante getDato() {
        return dato;
    }

    public void setDato(Estudiante dato) {
        this.dato = dato;
    } 
}
