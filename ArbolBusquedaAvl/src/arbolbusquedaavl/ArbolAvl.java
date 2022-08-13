
package arbolbusquedaavl;


public class ArbolAvl {
    private Nodo raiz; //punta
    
    public ArbolAvl(){
        raiz = null;
    }
    
    public Nodo obtenerRaiz(){
        return raiz;
    }

    //Buscar un nodo
    public Nodo buscar(int d, Nodo r){ //se necesita el dato y la raiz
        if(r == null){
            return null; // no hay nada en la lista
        }else if(r.dato == d){//si el dato esta en la primera posicion
            return r;
        }else if(r.dato < d){//si es menor hay q buscar la derecha
            return buscar(d, r.hijoDer);//recursivida
        }else{ 
            return buscar(d, r.hijoIzq);//de lo contrario se va por la izquier
        }
    }
    //obtener el factor de equilibrio
    public int obtenerFE (Nodo x){
        if(x == null){
            return -1;//es una hoja
        }else{
            return x.fe;
        }
    }
    //rotacion simple iquierda
    public Nodo rotaIzq(Nodo x){//creo un aux para poder comparar cual lado tiene mas niveles
        Nodo aux = x.hijoIzq;//aux que apunta al hijo izq
          x.hijoIzq = aux.hijoDer;   
          aux.hijoDer = x; 
          //de la libreria math, llamo a max para q regrese el valor maximo
          //entre dos elementos
          //al factor de equilibrio se le suma 1, porq fe = al nivel+1, la altura real
          x.fe = Math.max(obtenerFE(x.hijoIzq), obtenerFE(x.hijoDer))+1;
          aux.fe = Math.max(obtenerFE(aux.hijoIzq), obtenerFE(aux.hijoDer))+1;
          return aux;
    }
    //rotacion simple derecha
     public Nodo rotaDer(Nodo x){//creo un aux para poder comparar cual lado tiene mas niveles
        Nodo aux = x.hijoDer;//aux que apunta al hijo izq
          x.hijoDer = aux.hijoIzq;   
          aux.hijoIzq = x;
          //de la libreria math, llamo a max para q regrese el valor maximo
          //entre dos elementos
          //al factor de equilibrio se le suma 1, porq fe = al nivel+1, la altura real
          x.fe = Math.max(obtenerFE(x.hijoIzq), obtenerFE(x.hijoDer))+1;
          aux.fe = Math.max(obtenerFE(aux.hijoIzq), obtenerFE(aux.hijoDer))+1;
          return aux;
     }
     //doble rotacion izquierda
     public Nodo rotaDobleIzq(Nodo x){
         Nodo aux;
         x.hijoIzq = rotaDer(x.hijoIzq);
         aux = rotaIzq(x);
         return aux;
     }
     //doble rotacion derecha
     public Nodo rotaDobleDere(Nodo x){
         Nodo aux;
         x.hijoDer = rotaIzq(x.hijoDer);
         aux = rotaDer(x);
         return aux;
     }
     //Metodo para insertar AVL
     public Nodo insertarAvl(Nodo nuevo, Nodo subAr){//subarbol es la raiz en un inicio
         Nodo nuevoPadre = subAr;
         if (nuevo.dato < subAr.dato){//compara los datos para saber por donde se inserta
             if(subAr.hijoIzq == null){// si es null es porq no tiene hijo por ese lado
                 subAr.hijoIzq = nuevo;//se le pone como hijo en ese lado
             }else{
                 subAr.hijoIzq = insertarAvl(nuevo, subAr.hijoIzq);// como no esta vacia
                 //es necesario recurrir a la recursividad para que vuelva y compare y se ira a la 
                 //izquierda hasta q encuentre a null y lo ligue
                 if((obtenerFE(subAr.hijoIzq)) - obtenerFE(subAr.hijoDer) == 2){//compara
                     //si pasa esto hay un desbalanceo, no puede ser mayor 2
                     if(nuevo.dato < subAr.hijoIzq.dato){
                         nuevoPadre = rotaIzq(subAr);
                        }else {
                         nuevoPadre = rotaDobleIzq(subAr);
                     }
                 }     
             }
                        
         }else if(nuevo.dato > subAr.dato){
             if(subAr.hijoDer == null){
                 subAr.hijoDer = nuevo;
             }else {
                 subAr.hijoDer = insertarAvl(nuevo, subAr.hijoDer);
                 if((obtenerFE(subAr.hijoDer) - obtenerFE(subAr.hijoIzq) == 2)){
                     if(nuevo.dato > subAr.hijoDer.dato){
                         nuevoPadre = rotaDer(subAr);
                     }else{
                         nuevoPadre = rotaDobleDere(subAr);
                     }
                 }
             }
         }else {
             System.err.println("El dato ya existe");
         }
         //actualizando el FE o altura
         if((subAr.hijoIzq == null) && (subAr.hijoDer != null)){
             subAr.fe = subAr.hijoDer.fe+1;
         }else if((subAr.hijoDer == null) && (subAr.hijoIzq != null)){
             subAr.fe = subAr.hijoIzq.fe+1;
         }else{
             subAr.fe = Math.max(obtenerFE(subAr.hijoIzq), obtenerFE(subAr.hijoDer))+1;
             //se le suma mas 1 por el nivel que tiene de mas
         }
         return nuevoPadre;
     }
     //Metodo insertar dato cualquiera
     public void insertar(int d){
         Nodo nuevo = new Nodo(d);
         if(raiz == null){
             raiz = nuevo;// primer dato del arbol o litas
         }else {
             raiz = insertarAvl(nuevo, raiz);//sino es el primer dato se llama a inserAvl
         }
     }
     //recorridos
     //Inorder
     public void inorden(Nodo r){
         if(r != null){
             inorden(r.hijoIzq);
             System.out.print(r.dato + ", ");
             inorden(r.hijoDer);
         }
     }
     //preorden
     public void preorden(Nodo r){
         if(r != null){
             System.out.print(r.dato + ", ");
             preorden(r.hijoIzq);
             preorden(r.hijoDer);
         }
     }
     //posorden
     public void posorden(Nodo r){
         if(r != null){
             posorden(r.hijoIzq);
             posorden(r.hijoDer);
             System.out.print(r.dato + ", ");
         }
     }
} 
