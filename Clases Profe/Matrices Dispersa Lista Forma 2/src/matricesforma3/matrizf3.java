package matricesforma3;

public class matrizf3 {

    private nodo cab;

    public matrizf3() {
        this.cab = null;
    }

    public nodo getCab() {
        return cab;
    }

    public void llenarmatriz3(int f, int c, int dato) {
        nodo n = new nodo(f, c, dato);
        if (cab == null) {
            cab = n;
            n.setLigaf(cab);
            n.setLigac(cab);
        } else {
            nodo q = cab.getLigaf();
            nodo t = cab.getLigac();
            while (q.getLigaf() != cab) {
                q = q.getLigaf();                
            }
            while (t.getLigac() != cab) {
                t = t.getLigac();
            }
            q.setLigaf(n);
            t.setLigac(n);
            n.setLigaf(cab);
            n.setLigac(cab);

        }

    }

    public void mostrar() {
        nodo q = cab.getLigaf();

        while (q != cab) {
            System.out.print("[" + q.getLigaf().toString().substring(q.getNodo().toString().indexOf("@")) + 
                    "-" + q.getFila() + 
                    "-" + q.getDato() + 
                    "-" + q.getCol() + 
                    "-" + q.getNodo().toString().substring(q.getNodo().toString().indexOf("@")) +                     
                    "-" + q.getLigac().toString().substring(q.getNodo().toString().indexOf("@")) + "] - ");
            q = q.getLigaf();
        }
        System.out.println(" ");

    }
}
