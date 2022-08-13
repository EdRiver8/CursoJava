/*
Una compania paga a sus empleados por semana. los empleados son de cuatro tipos:
1- Asalariados: tienen un salario fijo semanal, sin importar el numero de horas laboradas
2- por horas: reciben un sueldo por hora y pago por tiempo extra, por todas las horas trabajadas
    que excedan las 40 horas semanales.
3- por comision: reciben un porcentaje de sus ventas
4- asalariados por comision: tienen un salario bases mas un porcentaje de ventas.

para este periodo de pago, la compania decidio recompensar a los empleados asalariados por comision,
agregando un 10% a su salario base. la compania desea implementar una app en java que realice sus 
calculos en nomina de forma polimorfica.
 */
public abstract class Empleado {
    String nombre;
    String primerApellido;
    String segundoApellido;
    String cedula;

    public Empleado(String nom, String ape1, String ape2, String cc) {
        nombre = nom;
        primerApellido = ape1;
        segundoApellido = ape2;
        cedula = cc;            
    }
    
    public void setnombre(String nom){
        nombre = nom;
    }
    
    public void setPrimerApellido(String ape1){
        primerApellido = ape1;
    }
    
    public void setSegundoApellido(String ape2){
        segundoApellido = ape2;
    }
    
    public void setCedula(String cc){
        cedula = cc;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getPrimerApellido(){
        return primerApellido;
    }
    
    public String getSegundoApellido(){
        return segundoApellido;
    }
    
    public String getCedula(){
        return cedula;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %s\nNumero de cedula: %s", getNombre(),getPrimerApellido(), getSegundoApellido(), getCedula());
    }
    //metodo abstracto que tiene que ser sobreescrito por las subclases
    public abstract double salario();
    

}
