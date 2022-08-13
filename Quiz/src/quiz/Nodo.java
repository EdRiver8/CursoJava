package quiz;

public class Nodo {
    private Object dato;//Objeto para poder guardar cualquier tipo de cosa
    private Nodo liga; //la liga es un tipo nodo, ya que lo q el liga son nodos
    
    public Nodo(Object dato){
        this.dato = dato;
        liga = null;//cada que se crea un nodo, se lleva el dato y la liga es igual a null, se crea en el aire
    }
    public Object getDato(){
        return dato;
    }
    
    public Nodo getLiga(){
        return liga;
    }
    
    public void setDato(Object dato){
        this.dato = dato;
    }
    
    public void setLiga(Nodo liga){
        this.liga = liga;
    }

    @Override
    public String toString() {
        return dato.toString(); //el toString del nodo es igual al toString del dato
    }
    
    
}
