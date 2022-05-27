
package paquete5;
public class Ejecutor2 {
    
    public static void main(String[] args) {
      
        String nombreArchivo = "hopital.data";
        String Dcotor_buscar = "11587456";
        Hospital h;
        LecturaArchivosSecuencial lectura = 
                new LecturaArchivosSecuencial(nombreArchivo);
        lectura.establecerIdentificador(Dcotor_buscar);
        lectura.establecerDcotorBuscado();
        h = lectura.obtenerDoctorBuscado();
        if(h!=null){
            System.out.println(h);
        }else{
            System.out.println("Profesor no encontrado");
        }
        
    }
}
