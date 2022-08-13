
package appmaterias;


public class Estudiante {
    private String nombreEst;
    private int edadEst;
    private double promAcumEst;
    private ListaGenericaMaterias lMats;

    public Estudiante(String nombreEst, int edadEst) {
        this.nombreEst = nombreEst;
        this.edadEst = edadEst;
        lMats = new ListaGenericaMaterias();
    }

    public String getNombreEst() {
        return nombreEst;
    }

    public int getEdadEst() {
        return edadEst;
    }

    public double getPromAcumEst() {
        return promAcumEst;
    }

    public void setNombreEst(String nombreEst) {
        this.nombreEst = nombreEst;
    }

    public void setEdadEst(int edadEst) {
        this.edadEst = edadEst;
    }
       
    public void agragarMaterias(Materia mat){
        if(lMats.vacia())
            lMats.insertarInicio(mat);
        else
            lMats.insertarFinal(mat);
    }
    
    public double calcularPromAcum(){
        promAcumEst = lMats.calcularDefinitiva();
        return promAcumEst;
    }
    
}
