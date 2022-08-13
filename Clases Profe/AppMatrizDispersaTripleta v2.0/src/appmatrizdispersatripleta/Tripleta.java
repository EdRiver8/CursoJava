
package appmatrizdispersatripleta;


public class Tripleta {
    private Object matriz[][];
    private Object tripleta[][];
    private int cantDatosUtiles;
    private int cantFilas;
    private int cantCols;

    public Tripleta(Object[][] matriz) {
        this.matriz = matriz;
        cantFilas = matriz.length;
        cantCols = matriz[0].length;
        calcularCantDatosUtiles();
        tripleta = new Object[cantDatosUtiles][3];
        generarTripleta();
        mostrarTripleta();
    }

    public Object[][] getTripleta() {
        return tripleta;
    }

    public int getCantDatosUtiles() {
        return cantDatosUtiles;
    }

    public void setMatriz(Object[][] matriz) {
        this.matriz = matriz;
        cantFilas = matriz.length;
        cantCols = matriz[0].length;
        calcularCantDatosUtiles();
        tripleta = new Object[cantDatosUtiles][3];
        generarTripleta();
        mostrarTripleta();
    }
    
    private void calcularCantDatosUtiles(){
        cantDatosUtiles = 0;
        for (int i = 0; i < cantFilas; i++) {
            for (int j = 0; j < cantCols; j++) {
                if(matriz[i][j] instanceof PolF1)
                    cantDatosUtiles++;
            }
        }
    }
    
    private void generarTripleta(){
        int cont = 0;
        for (int i = 0; i < cantFilas; i++) {
            for (int j = 0; j < cantCols; j++) {
                if(matriz[i][j] instanceof PolF1){
                    tripleta[cont][0] = i;
                    tripleta[cont][1] = j;
                    tripleta[cont][2] = matriz[i][j];
                    cont++;
                }
            }
        }
    }
    
    private void mostrarTripleta(){
        for (int i = 0; i < cantDatosUtiles; i++) {
            System.out.print(tripleta[i][0] + "\t" + tripleta[i][1] + "\t");
            ((PolF1)tripleta[i][2]).mostrarPolF1();
            System.out.println("");
        }
    }
}
