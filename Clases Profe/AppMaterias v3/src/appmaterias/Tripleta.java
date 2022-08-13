
package appmaterias;


public class Tripleta {
    private Materia matriz[][];
    private Object tripleta[][];
    private int cantDatosUtiles;
    private int cantFilas;
    private int cantCols;

    public Tripleta(Materia[][] matriz) {
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

    public void setMatriz(Materia[][] matriz) {
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
                if(matriz[i][j].getNotaDef() < 3)
                    cantDatosUtiles++;
            }
        }
    }
    
    private void generarTripleta(){
        int cont = 0;
        for (int i = 0; i < cantFilas; i++) {
            for (int j = 0; j < cantCols; j++) {
                if(matriz[i][j].getNotaDef() < 3){
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
            System.out.print("Estudiante" + (i+1)+ tripleta[i][0] + "\t Area" + tripleta[i][1] + "\t" + ((Materia)tripleta[i][2]).getNomMat() + ", " + ((Materia)tripleta[i][2]).getNotaDef());
            System.out.println("");
        }
    }
}
