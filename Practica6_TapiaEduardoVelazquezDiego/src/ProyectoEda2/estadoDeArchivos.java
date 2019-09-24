package ProyectoEda2;

import java.util.*;
/**
 * Implemetacion de tablas Hash para almacenar el estado del archivo
 */
public class estadoDeArchivos {
    static Hashtable <String, Integer>  datos = new Hashtable <String,Integer> ();
    /**
     * Método para almacenar el estado del archivo en la tabla hash
     * @param nameFile String
     * @param estado boolean
     */
    public static void datos(String nameFile, boolean estado){
        if(estado){
            datos.put(nameFile, 1);
        }else{
            datos.put(nameFile, 0);
        }    
        //System.out.println("se agrego " + nameFile + "con"+ datos.get(nameFile));
        
    }
    /**
     * Método para mostrar el estado del archivo
     * @param nameFile 
     */
    public static void muestraEstadoDatos(String nameFile){
        System.out.println(nameFile + "esta " + datos.get(nameFile));
        //System.out.println("esta " + ((datos.get(nameFile)==1)?"ordenado":"No ordenado"));
    }
}

/*
    implementacion en un archivo txt o en tablas hash
*/
//        System.out.println("Las el estado del archivo " + nameFile + " es "+ ((datos.get(estado)==1)?"ordenado":"No ordenado"));
//
//        System.out.println("Se remueve un archivo " + datos.remove(nameFile));
//        System.out.println("remueve archivos desordenados" + datos.remove(nameFile, 0));
//
//        
//
//        System.out.println("Los archivos: " + datos.keySet());
//        System.out.println("El tamaño de la tabla es: " + datos.size() + "\n");