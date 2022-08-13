
package This;


public class This {
    
    int variable = 5;
    Clase2 obj2 = new Clase2();
    
    public This(){
        this("Edwin");
        System.out.println("Constructor sin parametros");
    }
    
    public This(String nombre){
        System.out.print("Constructor conparametros......");
        System.out.println("El nombre es: " + nombre + "\n\n");
    }
    
    public void metodo(int variable){
        System.out.println("El valor de variable de instancia es: " + variable);
        System.out.println("El valor de variable local es: " + this.variable);
    }
    
    public void metodo2(){
        obj2.metodo(10);
        this.metodo(10);
    }
    
    public void metodo3(This obj){
        
    }
    
    public void metodo4(){
        this.metodo3(this);
    }


    public static void main(String[] args) {
        This obj = new This();
    }
    
}
