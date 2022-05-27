
package paquete6;

public class Hospital {
    String nombre;
    int numeroCamas;
    double presupuesto;

    public Hospital(String nom, int numCamas, double pres) {
        this.nombre = nom;
        this.numeroCamas = numCamas;
        this.presupuesto = pres;
    }
    public void establecerNombre (String c){
        nombre = c; 
    }
    public void establecerNumCamas (int  c){
        numeroCamas = c; 
    }
    public void establecerPresupuesto (double  c){
        presupuesto = c; 
    }
    public String obtenerNombre (){
        return nombre;
    }
    public int obtenerNumCamas (){
        return numeroCamas;
    }
    public double obtenerPresupuesto (){
        return presupuesto;
    }
}

/* 
    Agregar valor de objetos de tipo Hospital a un archivo
    Y leer el archivo
*/
