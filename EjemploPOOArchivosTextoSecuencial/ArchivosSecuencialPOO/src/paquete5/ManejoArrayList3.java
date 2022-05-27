/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Calificacion;
import paquete1.Profesor;

/**
 *
 * @author reroes
 */
public class ManejoArrayList3 {
    public static void main(String[] args) {
        Calificacion c1 = new Calificacion(5.5, "Computacion");
        Calificacion c2 = new Calificacion(8.5, "Mate");
        Calificacion c3 = new Calificacion(5.9, "A perro");
        
        Profesor prof1 = new Profesor("Joseph Jimenez", "facturado");
        Profesor prof2 = new Profesor("David Jones", "nombramiento");
        Profesor prof3 = new Profesor("Pico Jones", "The best");
        
        c1.establecerProfesor(prof1);
        c2.establecerProfesor(prof2);
        c3.establecerProfesor(prof3);
        
        
        // Arreglo
        Profesor [] profesores = new Profesor[2];
        profesores[0] = prof1;
        profesores[1] = prof2;
        
        for (int i = 0; i < profesores.length; i++) {
            System.out.printf("%s - %s\n", profesores[i].obtenerNombre(),
                    profesores[i].obtenerTipo());
        }
        
        System.out.println("-----------------------------");
        
        // ArrayList
        ArrayList <Calificacion> calificaiones = new ArrayList<>();
        calificaiones.add(c1);
        calificaiones.add(c2);
        calificaiones.add(c3);
      
       for (int i=0;i < calificaiones.size(); i++){
           System.out.printf("%s - %s - %.2f\n", 
                   calificaiones.get(i).obtenerProfesor().obtenerNombre(),
                   calificaiones.get(i).obtenerNombreMateria(),
                   calificaiones.get(i).obtenerNota());
       } 
        
    }
}
