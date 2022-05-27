
package paquete5;
public class Ejecutor {
    
    public static void main(String[] args) {
      
        String nombreArchivo = "hopital.data";
        
        Hospital c1 = new Hospital("Camilo Ponce", 25, 500, "1150187456");
        Hospital c2 = new Hospital("Camilo Ponce", 25, 500, "1154789656");
        Hospital c3 = new Hospital("Camilo Ponce", 25, 500, "0966554724");
        
        String Dcotor_buscar = "1150187456";
        
        Hospital[] lista = {c1, c2, c3};
       
        EscrituraArchivosSecuencial archivo = new 
         EscrituraArchivosSecuencial(nombreArchivo);

        for (int i = 0; i < lista.length; i++) {
            // establecer el valor del atributo registro
            archivo.establecerRegistro(lista[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        LecturaArchivosSecuencial lectura = new LecturaArchivosSecuencial(nombreArchivo);
        lectura.establecerListaHospital();
        System.out.println(lectura);
        
    }
}
