
package appmatrizdispl1f1;

public class matrizDispersaL1F1 {
    private nodo cab; //cab = cabeza

    public matrizDispersaL1F1() {
        cab = null;
    }
    
    //generamos las cabezas de las listas que componen la matriz dispersa
    public void generarCabezas(int fs, int cs){//fs = filas, cs = columnas
        cab = new nodo(fs, cs, 0);
        nodo nuevo; //se declaro un nuevo nodo
        nodo ultimo = cab; //ultimo nodo que hay, se hace igual a cabaza en un inicio
        for (int i = 0; i < fs; i++) {
            nuevo = new nodo(i,i,0);
            nuevo.setL(cab);//apunta a la cabeza
            ultimo.setL(nuevo);//ultio apunta al nuevo
            ultimo = nuevo;//ultimo baja a la posicion del nuevo
            nuevo.setLc(nuevo);//inicialmente apunta asi mismo
            nuevo.setLf(nuevo);
        }
    }
    
    public void insertar(int f, int c, int dato){
        nodo p, q, nuevo;
        p = cab.getL();
        //while((p != cab) && (p.getF() != f))
        while((p.getF() != f)){//recorre las cabezas de las listas hasta que sea diferente de la fila
            p = p.getL();//recorre en vertical para las filas
        }
        q = p;//pone los dos nodos en el mismo lugar
        p = p.getLf();//con p recorre y q queda en la cabeza de la litas
        while(p.getLf() != q){//para moverse entre las litas
            p = p.getLf();//recorre en horizontal para las filas
        }
        
        nuevo = new nodo(f, c, dato);
        p.setLf(nuevo);
        nuevo.setLf(q);
        p = cab.getL();
        while(p.getC() != c){
            p = p.getL();//recorre en vertical para las columnas
        }
        q = p;
        p = p.getLc();
        while(p.getLc() != q){
            p = p.getLc();//recorre en horizontal para las columnas
        }
        nuevo.setLc(q);
        p.setLc(nuevo);
    }
    
    public void mostrar(){
        nodo p, q;
        p = cab.getL();
        while(p != cab){// con recorro registros cabezas
            System.out.println("["+p.getF()+"-"+p.getC()+"] - ");
            q = p.getLf();
            while(q != p){//con q recorro horizontal buscando los datos de cada fila
                System.out.println("["+p.getF()+"-"+p.getC()+"-"+q.getDato()+"]");
                q = q.getLf();
            }
            p = p.getL();
            System.out.println(" ");
        }
    }
    
}
