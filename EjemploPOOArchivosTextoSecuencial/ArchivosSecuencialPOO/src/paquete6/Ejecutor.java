/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        // nombre del archivo
        String nombreArchivo = "Hospital.txt";
        
        Hospital h1 = new Hospital("Basicod de Catacocha",800,10540.35);
        Hospital h2 = new Hospital("San Pedro",840,19054);
        Hospital h3 = new Hospital("Lopes Yaguna",3200,45000);
        
        ArchivoEscritura archivo = new ArchivoEscritura(nombreArchivo);
        
        Hospital[] lista = {h1, h2, h3};
        
        for (int i = 0; i < lista.length; i++) {
            // establecer el valor del atributo registro
            archivo.establecerRegistro(lista[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }
        
        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        System.out.println(lectura);
    }
}
