/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaParcial;

import java.util.Random;

/**
 *
 * @author sala205
 */
public class Practica 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Random rd=new Random();
        ListaSimple lista=new ListaSimple();
        ListaSimple[] vector=new ListaSimple[5];
        int metodoEstatico[];
        String nombre,tesis;
        double prom;
        Pregrado pre;
        Posgrado pos;

         for(int i=0;i<5;i++)
        {
            int ale=rd.nextInt(2);
            
            if(ale==0)
            {
                nombre="Estudiante"+rd.nextInt(2);
                prom=rd.nextDouble()*5;
                pre=new Pregrado(nombre,prom);
                lista.insertarFinal(pre);
            }else
            {
                nombre="Estudiante"+rd.nextInt(2);
                tesis="Tesis"+rd.nextInt(2);
                pos=new Posgrado(nombre,tesis);
                lista.insertarFinal(pos);          
            }
           
            vector[i]=lista;
        }
         lista.imprimir();
         metodoEstatico=MetodosEstaticos.vector(lista);
         System.out.println("Estudiantes Pregrado"+metodoEstatico[0]+"Estudiantes Posgrado"+metodoEstatico[1]);
         
         for (int i = 0; i < vector.length; i++) 
         {
            lista=vector[i];
            lista.imprimir();
        }
         
    }
    
}
