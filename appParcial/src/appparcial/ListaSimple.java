
package appparcial;

public class ListaSimple {

    class Nodo {

        Object info;
        Nodo sig;
        Nodo ant;
    }

    private Nodo raiz;

    public ListaSimple() {
        raiz = null;
    }

    void insertarInicio(Object x) {
        Nodo nuevo = new Nodo();
        nuevo.info = x;

        if (raiz == null) {
            nuevo.sig = nuevo;
            nuevo.ant = nuevo;
            raiz = nuevo;
        } else {
            Nodo ultimo = raiz.ant;
            nuevo.sig = raiz;
            nuevo.ant = ultimo;
            raiz.ant = nuevo;
            ultimo.sig = nuevo;
            raiz = nuevo;
        }

    }

    void insertarEntre(int pos, Object x) {
        if (pos <= cantidad() + 1) {
            Nodo nuevo = new Nodo();
            nuevo.info = x;

            Nodo reco = raiz;
            for (int f = 1; f <= pos - 2; f++) {
                reco = reco.sig;
            }
            nuevo.sig = reco.sig;
            reco.sig.ant = nuevo;
            reco.sig = nuevo;
            nuevo.ant = reco;
        }
    }

    void insertarFinal(Object x) {
        Nodo nuevo = new Nodo();
        nuevo.info = x;
        if (raiz == null) {
            nuevo.sig = nuevo;
            nuevo.ant = nuevo;
            raiz = nuevo;
        } else {
            Nodo ultimo = raiz.ant;
            nuevo.sig = raiz;
            nuevo.ant = ultimo;
            raiz.ant = nuevo;
            ultimo.sig = nuevo;
        }
    }

    public int cantidad() {
        int cant = 0;
        Nodo reco = raiz;
        do {
            reco = reco.sig;
            cant++;
        } while (reco != raiz);
        return cant;
    }

    public void imprimir() {
        if (raiz != null) {
            Nodo reco = raiz;
            do {
                ((Producto) reco.info).mostrarProducto();

                reco = reco.sig;
            } while (reco != raiz);
            System.out.println();
        }
    }


}
