// http://www.javaya.com.ar/detalleconcepto.php?codigo=119&inicio=40
package appmaterias;

public class ListaGenerica {

    class Nodo {
        double nota;
        //String desc;
        //int porcentaje;
        Nodo sig;
    }

    private Nodo raiz;

    public Nodo getRaiz() {
        return raiz;
    } 

    public ListaGenerica() {
        raiz = null;
    }

    void insertar(int pos, int x) {
        if (pos <= cantidad() + 1) {
            Nodo nuevo = new Nodo();
            nuevo.nota = x;
            if (pos == 1) {
                nuevo.sig = raiz;
                raiz = nuevo;
            } else if (pos == cantidad() + 1) {
                Nodo reco = raiz;
                while (reco.sig != null) {
                    reco = reco.sig;
                }
                reco.sig = nuevo;
                nuevo.sig = null;
            } else {
                Nodo reco = raiz;
                for (int f = 1; f <= pos - 2; f++) {
                    reco = reco.sig;
                }
                Nodo siguiente = reco.sig;
                reco.sig = nuevo;
                nuevo.sig = siguiente;
            }
        }
    }

    void insertarInicio(double x) {
        Nodo nuevo = new Nodo();
        nuevo.nota = x;
        nuevo.sig = raiz;
        raiz = nuevo;
    }

    void insertarEntre(int pos, double x) {
        if (pos <= cantidad() + 1) {
            Nodo nuevo = new Nodo();
            nuevo.nota = x;

            Nodo reco = raiz;
            for (int f = 1; f <= pos - 2; f++) {
                reco = reco.sig;
            }
            Nodo siguiente = reco.sig;
            reco.sig = nuevo;
            nuevo.sig = siguiente;
        }
    }

    void insertarFinal(double x) {
        Nodo nuevo = new Nodo();
        nuevo.nota = x;        
        Nodo reco = raiz;
        while (reco.sig != null) {
            reco = reco.sig;
        }
        reco.sig = nuevo;
        nuevo.sig = null;
    }

    public double extraer(int pos) {
        if (pos <= cantidad()) {
            double informacion;
            if (pos == 1) {
                informacion = raiz.nota;
                raiz = raiz.sig;
            } else {
                Nodo reco;
                reco = raiz;
                for (int f = 1; f <= pos - 2; f++) {
                    reco = reco.sig;
                }
                Nodo prox = reco.sig;
                reco.sig = prox.sig;
                informacion = prox.nota;
            }
            return informacion;
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public void borrar(int pos) {
        if (pos <= cantidad()) {
            if (pos == 1) {
                raiz = raiz.sig;
            } else {
                Nodo reco;
                reco = raiz;
                for (int f = 1; f <= pos - 2; f++) {
                    reco = reco.sig;
                }
                Nodo prox = reco.sig;
                reco.sig = prox.sig;
            }
        }
    }

    public void intercambiar(int pos1, int pos2) {
        if (pos1 <= cantidad() && pos2 <= cantidad()) {
            Nodo reco1 = raiz;
            for (int f = 1; f < pos1; f++) {
                reco1 = reco1.sig;
            }
            Nodo reco2 = raiz;
            for (int f = 1; f < pos2; f++) {
                reco2 = reco2.sig;
            }
            double aux = reco1.nota;
            reco1.nota = reco2.nota;
            reco2.nota = aux;
        }
    }

    public double mayor() {
        if (!vacia()) {
            double may = raiz.nota;
            Nodo reco = raiz.sig;
            while (reco != null) {
                if (reco.nota > may) {
                    may = reco.nota;
                }
                reco = reco.sig;
            }
            return may;
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public double posMayor() {
        if (!vacia()) {
            double may = raiz.nota;
            int x = 1;
            int pos = x;
            Nodo reco = raiz.sig;
            while (reco != null) {
                if (reco.nota > may) {
                    may = reco.nota;
                    pos = x;
                }
                reco = reco.sig;
                x++;
            }
            return pos;
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public int cantidad() {
        int cant = 0;
        Nodo reco = raiz;
        while (reco != null) {
            reco = reco.sig;
            cant++;
        }
        return cant;
    }

    public boolean ordenada() {
        if (cantidad() > 1) {
            Nodo reco1 = raiz;
            Nodo reco2 = raiz.sig;
            while (reco2 != null) {
                if (reco2.nota < reco1.nota) {
                    return false;
                }
                reco2 = reco2.sig;
                reco1 = reco1.sig;
            }
        }
        return true;
    }

    public boolean existe(int x) {
        Nodo reco = raiz;
        while (reco != null) {
            if (reco.nota == x) {
                return true;
            }
            reco = reco.sig;
        }
        return false;
    }

    public boolean vacia() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimir() {
        Nodo reco = raiz;
        while (reco != null) {
            System.out.print(reco.nota + "\t");
            reco = reco.sig;
        }
        System.out.println();
    }   
    
    public double calcularDefinitiva(){
        double def, suma = 0;
        Nodo reco = raiz;
        while (reco != null) {
            suma += reco.nota;
            reco = reco.sig;
        }
        def = suma/cantidad();
        return def;
    }
}
