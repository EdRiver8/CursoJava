
package appmatrizdispersallf2;


public class Nodo {
    private Nodo lc;
    private Nodo lf;
    private int dato;
    private int col;
    private int fila;

    public Nodo(int dato, int col, int fila) {
        this.dato = dato;
        this.col = col;
        this.fila = fila;
        lc = null;
        lf = null;
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

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }  
}
