
package appmatrizdispersallf2;

public class MatrizDispersaLLF2 {
    private Nodo cab;
    
    public MatrizDispersaLLF2(){
        cab = null;
    }
    
    public Nodo getCab(){
        return cab;
    }
    
    public void generarMatrizDispersaLLF2(int f, int c, int dato){
        Nodo n = new Nodo(dato, c, f);
        if(cab == null){
            cab = n;
            n.setLc(cab);
            n.setLf(cab);
        } else {
            Nodo q = cab.getLf();
            Nodo t = cab.getLc();
            while(q.getLf() != cab){
                q = q.getLf();
            }
            
            while(t.getLc() != cab){
                t = t.getLc();
            }
            
            q.setLf(n);
            t.setLc(n);
            n.setLf(cab);
            n.setLc(cab);
        }
    }
    
    public void mostrarMatrizDispersaLLF2(){
        Nodo reco = cab;
        
        do{
            System.out.println("["+reco.getLc().toString().substring(reco.getLc().toString().indexOf("@"))+"]"+
                    " ("+reco.getFila()+", "+reco.getCol()+ ", *" + reco.getDato() + "*), <"+
                    reco.toString().substring(reco.toString().indexOf("@"))+"> "+
                    "["+reco.getLf().toString().substring(reco.getLf().toString().indexOf("@"))+"]");
            
            reco = reco.getLf();
        }while(reco != cab);
        System.out.println("");
    }
}
