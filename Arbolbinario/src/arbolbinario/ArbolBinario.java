package arbolbinario;

import java.awt.BorderLayout;
import java.util.Scanner;


public class ArbolBinario {
    private Nodo p; // apuntador al primer nodo
    
    public ArbolBinario(){//constructor vacion
        Nodo nodo = new Nodo();//creamos un nuevo nodo de la clase Nodo con 3 partes, li, ld y dato
        p = nodo; //p deja de apuntar a null y apunta al nuevo nodo
        crearArbol(p); //crea un arbol binario basadao en nodo o p
        }

    private void crearArbol(Nodo nodo) {
        String rpta;
        Scanner sc = new Scanner(System.in);//se crea sc como objeto de la clase Scanner
        System.out.println("Ingrese dato.............");
        String dato = sc.nextLine(); // un String dato para capturar lo que ingrese el usuario
        nodo.setDato(dato);
        
        System.out.printf("Va a agregar nodo por la izquierda de %s, <S/N> ? ", dato);
        rpta = sc.nextLine();
        if(rpta.equalsIgnoreCase("S")){
            Nodo otro = new Nodo();
            nodo.setLi(otro);
            crearArbol(otro);//crea arbol por izquierda en caso que el usuario diga q si, lo cual hace de forma recursiva
        }
        
        System.out.printf("Va a agregar nodo por la derecha %s, <S/N> ? ", dato);
        rpta = sc.nextLine();
        if(rpta.equalsIgnoreCase("S")){
            Nodo otro = new Nodo();
            nodo.setLd(otro);
            crearArbol(otro);//crea arbol por izquierda en caso que el usuario diga q si, lo cual hace de forma recursiva
        }
    }
    public void recorridoPreorden(){
        preorden(p); //el recorrido se basa en el punto p, q es el primero del arbol
        System.out.println(); 
   }

    private void preorden(Nodo nodo) {//recibe un nodo
        if(nodo != null){
            System.out.println(nodo + "\t");//primero muestra el dato
            preorden(nodo.getLi());//luego recorre por la izquierda
            preorden(nodo.getLd());//y por ultimo por la derecha
        }
    }
    
    public void recorridoIneorden(){
        inorden(p); //el recorrido se basa en el punto p, q es el primero del arbol
        System.out.println();
    }

    private void inorden(Nodo nodo) {//recibe un nodo
        if(nodo != null){
            inorden(nodo.getLi());//primero recorre por la izquierda
            System.out.println(nodo + "\t");//luego muestra el dato
            inorden(nodo.getLd());//y por ultimo por la derecha
        }
    }
    
    public void recorridoPosorden(){
        postorden(p); //el recorrido se basa en el punto p, q es el primero del arbol
        System.out.println();
    }

    private void postorden(Nodo nodo) {//recibe un nodo
        if(nodo != null){
            postorden(nodo.getLi());//pimero recorre por la izquierda
            postorden (nodo.getLd());//luego por la derecha
            System.out.println(nodo + "\t");//y por ultimo muestra el dato

        }
    }
}
