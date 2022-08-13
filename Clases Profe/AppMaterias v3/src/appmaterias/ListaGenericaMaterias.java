// http://www.javaya.com.ar/detalleconcepto.php?codigo=119&inicio=40
package appmaterias;

public class ListaGenericaMaterias {

    class Nodo {
        Materia mat;
        Nodo sig;
    }

    private Nodo raiz;

    public Nodo getRaiz() {
        return raiz;
    } 

    public ListaGenericaMaterias() {
        raiz = null;
    }

    void insertarInicio(Materia x) {
        Nodo nuevo = new Nodo();
        nuevo.mat = x;
        nuevo.sig = raiz;
        raiz = nuevo;
    }

    void insertarEntre(int pos, Materia x) {
        if (pos <= cantidad() + 1) {
            Nodo nuevo = new Nodo();
            nuevo.mat = x;

            Nodo reco = raiz;
            for (int f = 1; f <= pos - 2; f++) {
                reco = reco.sig;
            }
            Nodo siguiente = reco.sig;
            reco.sig = nuevo;
            nuevo.sig = siguiente;
        }
    }

    void insertarFinal(Materia x) {
        Nodo nuevo = new Nodo();
        nuevo.mat = x;        
        Nodo reco = raiz;
        while (reco.sig != null) {
            reco = reco.sig;
        }
        reco.sig = nuevo;
        nuevo.sig = null;
    }

    public Materia extraer(int pos) {
        if (pos <= cantidad()) {
            Materia informacion;
            if (pos == 1) {
                informacion = raiz.mat;
                raiz = raiz.sig;
            } else {
                Nodo reco;
                reco = raiz;
                for (int f = 1; f <= pos - 2; f++) {
                    reco = reco.sig;
                }
                Nodo prox = reco.sig;
                reco.sig = prox.sig;
                informacion = prox.mat;
            }
            return informacion;
        } else {
            return null;
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
            Materia aux = reco1.mat;
            reco1.mat = reco2.mat;
            reco2.mat = aux;
        }
    }

    public Materia mayor() {
        if (!vacia()) {
            Materia matMay = null;
            double may = raiz.mat.getNotaDef();
            Nodo reco = raiz.sig;
            while (reco != null) {
                if (reco.mat.getNotaDef() > may) {
                    matMay = reco.mat;
                }
                reco = reco.sig;
            }
            return matMay;
        } else {
            return null;
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

    public boolean existe(Materia x) {
        Nodo reco = raiz;
        while (reco != null) {
            if (reco.mat == x) {
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
            System.out.print(reco.mat + "\t");
            reco = reco.sig;
        }
        System.out.println();
    }   
    
    public double calcularDefinitiva(){
        double def, suma = 0;
        Nodo reco = raiz;
        while (reco != null) {
            suma += reco.mat.getNotaDef();
            reco = reco.sig;
        }
        def = suma/cantidad();
        return def;
    }
}
