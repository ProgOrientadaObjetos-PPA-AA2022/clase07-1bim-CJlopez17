/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Hospital implements Serializable{
    String nombre;
    int numeroCamas;
    double presupuesto;
    String idHospital;
    

    public Hospital(String nombre, int numeroCamas, double presupuesto, String idHos) {
        this.nombre = nombre;
        this.numeroCamas = numeroCamas;
        this.presupuesto = presupuesto;
        this.idHospital = idHos;
    }
    
    public void establecerNombre(String g){
        nombre = g;
    }
    public void establecerNumCamas(int g){
        numeroCamas = g;
    }
    public void establecerPresupuesto(double g){
        presupuesto = g;
    }
    public void establecerIDDoctor(String g){
        idHospital = g;
    }
   
    public String obtenerNombre(){
        return nombre;
    }
    public int obtenerNumCamas(){
        return numeroCamas;
    }
    public double  obtenerPresupuesto(){
        return presupuesto;
    }
    public String obtenerIdDoctor(){
        return idHospital;
    }
    @Override
    public String toString() {
        String cadena = obtenerIdDoctor();
        return cadena; 
    }
}