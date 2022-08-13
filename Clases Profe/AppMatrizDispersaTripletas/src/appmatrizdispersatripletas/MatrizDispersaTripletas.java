
package appmatrizdispersatripletas;


public class MatrizDispersaTripletas {
    private int cantDatosUtiles = 0;
    private int cantFilas;
    private int cantcolumnas;
    private int matrizOriginal[][];
    private int matrizTripletas[][];

    public MatrizDispersaTripletas(int[][] matrizOriginal) {
        this.matrizOriginal = matrizOriginal;
        cantFilas = matrizOriginal.length;
        cantcolumnas = matrizOriginal[0].length;
        calcularDatosUtiles();
        matrizTripletas = new int[cantDatosUtiles][3];
        generarMatrizTripletas();
    }
    
    private void calcularDatosUtiles(){
        int cont = 0;
        for (int i = 0; i < cantFilas; i++) {
            for (int j = 0; j < cantcolumnas; j++) {
                for (int k = 2; k < matrizOriginal[i][j]; k++) {
                    if((matrizOriginal[i][j]%k) == 0)
                        cont++;
                }
                if(cont == 0)
                    cantDatosUtiles++; 
            }
        }
    }
    
    private void generarMatrizTripletas(){
        int cont = 0, contFilas = 0;
        for (int i = 0; i < cantFilas; i++) {
            for (int j = 0; j < cantcolumnas; j++) {
                for (int k = 2; k < matrizOriginal[i][j]; k++) {
                    if((matrizOriginal[i][j]%k) == 0)
                        cont++;
                }
                if(cont == 0){
                    matrizTripletas[contFilas][0] = i;
                    matrizTripletas[contFilas][1] = j;
                    matrizTripletas[contFilas][2] = matrizOriginal[i][j];
                    contFilas++;
                }
            }
        }
    }
    
    public void mostrarMatrizTripletas(){
        for (int i = 0; i < matrizTripletas.length; i++) {
            System.out.print(matrizTripletas[i][0] + "\t");
            System.out.print(matrizTripletas[i][1] + "\t");
            System.out.println(matrizTripletas[i][2]);
        }
    }
}
