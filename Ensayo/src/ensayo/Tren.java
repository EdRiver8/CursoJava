
package ensayo;

public class Tren {
    int vagones [][] = new int[5][2];
    String maquinista;
    int antiguedad;
    
    public Tren (){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                vagones[i][j] = (i*10);
            } 
        }
        maquinista = "Jhon Doe";
        antiguedad = 0;    
    }
    public Tren (String nombre, int años){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                vagones[i][j] = (i*10);
            } 
        }
        maquinista = nombre;
        antiguedad = años;    
    }
    
    public void llenar(int vagon){
        vagones[vagon][1] = vagones[vagon][0];
        System.out.println("El vagon " + (vagon+1) + " se ha llenanodo");
    }
}
