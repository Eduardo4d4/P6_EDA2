package ProyectoEda2;
import java.io.*;
import java.util.*;
/**
 * Lectura de archivos
 */
public class lecturaDeArchivos{

    /**
     * Método para mostrar el contenido de un archivo especificado
     * @param nombre String
     */
    public void muestraContenido(String nombre, int cant) {
        try{ 
        String cadena;
        ArrayList lista = new ArrayList();
        FileReader f = new FileReader("C:\\Users\\velaz\\OneDrive\\Documentos\\GitHub\\Proyecto-EDA\\Archivos\\" + nombre +".txt");
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            //System.out.println(cadena);
            lista.addAll(Arrays.asList(cadena.split(",")));
        }
            System.out.println(lista);
        b.close();
        }catch (Exception e){
            e.printStackTrace();
        }   
    } 
    /**
     * Método para mostrar los archivos disponibles en el directorio
     */
    void muestraArchivos(){
        File f = new File("C:\\Users\\velaz\\OneDrive\\Documentos\\GitHub\\Proyecto-EDA\\Archivos\\");
        File[] ficheros = f.listFiles();
        for (int x=0;x<ficheros.length;x++){
            System.out.println(ficheros[x].getName());
            //estadoDeArchivos.muestraEstadoDatos(ficheros[x].getName());
        }
    }
    
}


 /*
try{
        String cadena;
        FileReader f = new FileReader("C:\\Users\\velaz\\OneDrive\\Documentos\\GitHub\\Proyecto-EDA\\Archivos\\" + nombre +".txt");
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            System.out.println(cadena);
        }
        b.close();
        }catch (Exception e){
            e.printStackTrace();
        } 
*/
 //fields  = line.split(SEPARATOR);

