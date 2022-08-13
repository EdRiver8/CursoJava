package appmaterias;

public class Materia {

    private String nomMat;
    private double notaDef;
    private ListaGenerica lNotas;

    public Materia(String nomMat) {
        this.nomMat = nomMat;
        lNotas = new ListaGenerica();
    }

    public void setNomMat(String nomMat) {
        this.nomMat = nomMat;
        lNotas = new ListaGenerica();
    }

    public void setNotaDef(double notaDef) {
        this.notaDef = notaDef;
    }

    public String getNomMat() {
        return nomMat;        
    }

    public double getNotaDef() {
        return notaDef;
    }  
    
    public void agragarNota(double nota){
        if(lNotas.vacia())
            lNotas.insertarInicio(nota);
        else
            lNotas.insertarFinal(nota);
    }
    
    public void mostrarNotas(){
        lNotas.imprimir();
    }
    
    public double calcularDefinitiva(){
        notaDef = lNotas.calcularDefinitiva();
        return notaDef;
    }
}
