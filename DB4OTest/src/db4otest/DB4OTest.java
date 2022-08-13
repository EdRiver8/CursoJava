package db4otest;

import com.db4o.*;
import java.io.File;

public class DB4OTest {

    public static void main(String[] args) {
        
        File f = new File ("personas.db4o");        
        //f.delete();                
        ObjectContainer db = Db4oEmbedded.openFile(f.getAbsolutePath());
        
        //crearDB(db);
        mostrarBD(db);
        //consultarPersona(db, null, 37, 0, 0);
        //actualzarPersona(db, "Juanpis", 32, 85, 1.65);
        //deletePersona(db, "Ralph");
        
        db.close();
        
    }
    
    public static void crearDB(ObjectContainer db){           
        
        Persona p1 = new Persona("Chapulin", 37, 75, 1.73);
        Persona p2 = new Persona("Spidy", 38, 80, 1.80);
        Persona p3 = new Persona("Mary", 30, 1.7, 70);
        Persona p4 = new Persona("Juanpis", 35, 82, 1.80);
        Persona p5 = new Persona("Ralph", 37, 75, 1.73);
                
        db.store(p1);
        db.store(p2);
        db.store(p3);
        db.store(p4);
        db.store(p5);
        
    }
    
    private static void mostrarBD (ObjectContainer db){
        Persona p = new Persona(null, 0, 0, 0);
        ObjectSet<Persona> result = db.queryByExample(p);
        while (result.hasNext()){
            System.out.println(result.next());
        }
    }
    
    private static void consultarPersona(ObjectContainer db, String nombre, int edad
        , double peso, double estatura){
        Persona p = new Persona(nombre, edad, peso, estatura); 
        ObjectSet<Persona> result = db.queryByExample(p);
        while (result.hasNext()){
            System.out.println(result.next());
        }
    }
        
    private static void actualzarPersona(ObjectContainer db, String nombre, int edad
        , double peso, double estatura){  
        Persona p = new Persona(nombre, 0, 0, 0); 
        ObjectSet<Persona> result = db.queryByExample(p);
        if(result.hasNext()){
            Persona pA = result.next();
            pA.setEdad(edad);
            pA.setPeso(peso);
            pA.setEstatura(estatura);            
            db.store(pA);
        }
    }
    
    private static void deletePersona(ObjectContainer db, String nombre){
        Persona p = new Persona(nombre,0,0,0);
        ObjectSet<Persona> result = db.queryByExample(p);        
        if (result.hasNext()){
            Persona pDel = result.next();
            db.delete(pDel);
        }        
    }

}

