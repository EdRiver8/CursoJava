package quiz;

public class ListaSimple {
    private int contNodos;//cuenta los nodos que hay
    private Nodo p; //apuntador al primero nodo de la lista
    private Nodo u; //apuntador al ultimo nodo de la lista
    
    public ListaSimple(){
        p = null;//lista vacia, se apunta a null el primero y el ultimo
        u = null;
        contNodos = 0;
    }
    
    public int getContNodos(){
        return contNodos;
    }
    
    public Nodo getP(){
        return p;
    }
    
    public Nodo getU(){
        return u;
    }
    
    public boolean estaVacia(){
        return p == null; //doble igual porq se pregunta si lo q hay en p es null
    }//recordar q un igual significa asignacion
    
    public void adicionar(Object dato){
        Nodo nodo = new Nodo(dato); //de la clase nodo, se crea un objeto llamado Nodo
        // que es igual a un nuevo nodo y se le pasa como parametro el dato a adicionar
        //no es lo mismo adicionar a una lista vacia que a una ocupada, ya q en la vacia me cambia el 1ro y ultimo
        //por eso cambian las operaciones}
        if(estaVacia()){
            p = nodo; //el puntero p apunta al 1er elemento
        }else{// se tiene que decir q la liga del ultimo va a ser el nuevo nodo
            u.setLiga(nodo);//la liga del ultimo le asigno la direccion del nuevo nodo
        }
        u = nodo; //este o no vacia el ultimo apuntara al nuevo nodo
        contNodos++;
    }

    @Override
    public String toString() {
        String aux = "";
        Nodo i = p;// i apunta al primer nodo
        int j = 0; //lleva el control de los elementos adicionados
        while(i != null){//para recorrer la lista de nodos
            aux += i.toString() + "\t";//aux le llevo lo q tiene dato
            i = i.getLiga(); //avanzo la liga
            j++;
            if(j % 10 == 0) aux += "\n"; //cada 10 elementos adiciona un salto de linea
        }
        aux += "\nCantidad de nodos: " + contNodos;
        return aux;
    }
    
    public void borrarPos(int pos){//borrar por posicion
        if(estaVacia() || pos > contNodos || pos <1){
            return;
        }
        if(pos==1){
            Nodo aux = p;//para que la punta no se pierda
            p = p.getLiga();
            aux = null;//auxiliar queda vacio y luego con el garbage collector se elimina de la memoria
        }else{
            Nodo i = p;//para recorrer la litsa uso i
            int j = 1;//para ubicar el anterior al que quiero borrar
            while(j<pos-1){//para detenerlo una posicion antes del que se va a borrar
                i = i.getLiga();
                j++;
            }
            Nodo aux = i.getLiga();//el nodo que se desea eliminar queda en aux
            i.setLiga(aux.getLiga());//el que esta antes le asigno la liga de aux que es el q esta despues
            if(pos == contNodos){//se va a borrar el ultimo
                u = i;
            }
            aux = null; //para poder eliminar el nodo
        }
        contNodos--;
    }
    
    public void insertar(Object dato, int pos){ //insertar segun una posicion
        if(estaVacia() || pos > contNodos){
            adicionar(dato);//solo se adicciona el dato y que va al final
            return;
        }
        Nodo nodo = new Nodo (dato);
        if (pos == 1) {
            nodo.setLiga(p);
            p = nodo;  
        }else{
             int cont = 1;
             Nodo i = p;
             while (i != null && cont < pos-1){//pos-1 porq el usuario no sabe que el programa
                 i = i.getLiga();              //comienza a contar desde cero.
                 cont++;
             }
             nodo.setLiga(i.getLiga());
             i.setLiga(nodo);
        }
        contNodos++; 
    }
    
}
