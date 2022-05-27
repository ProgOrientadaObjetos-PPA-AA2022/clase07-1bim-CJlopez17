/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Calificacion;
import paquete1.Profesor;
import paquete1.Empresa;

/**
 *
 * @author reroes
 */
public class ManejoArrayList4 {
    public static void main(String[] args) {
        
        Empresa e1 = new Empresa("Apple", "USA");
        Empresa e2 = new Empresa("ILE", "Loja");
        Empresa e3 = new Empresa("Dell", "Korea");
        Empresa e4 = new Empresa("Asus", "USA");
        
        ArrayList <Empresa> empresa = new ArrayList<>();
        empresa.add(e1);
        empresa.add(e2);
        empresa.add(e3);
        empresa.add(e4);
        
        for (int i=0;i < empresa.size(); i++){
           System.out.printf("%s - %s \n", 
                   empresa.get(i).obtenerNombre(),
                   empresa.get(i).obtenerCiudad());
       } 
    }
}
