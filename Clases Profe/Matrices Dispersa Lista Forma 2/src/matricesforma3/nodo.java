package matricesforma3;

public class nodo {
    private nodo ligac;
    private int fila;
    private int dato;
    private int col;
    private nodo ligaf;
    

    public nodo(int fila, int col, int dato) {
        this.ligac = null;
        this.fila = fila;
        this.dato = dato;
        this.col = col;
        this.ligaf = null;
        
    }

    public nodo getLigac() {
        return ligac;
    }

    public void setLigac(nodo ligac) {
        this.ligac = ligac;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public nodo getLigaf() {
        return ligaf;
    }

    public void setLigaf(nodo ligaf) {
        this.ligaf = ligaf;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
    
    public nodo getNodo(){
        return this;
    }
    
    
    
}
