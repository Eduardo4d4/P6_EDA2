package ProyectoEda2;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class Archivos {
    
    public boolean ordenado;
    static File fichero;
    static FileWriter fw;
    static BufferedWriter bw;
   /**
    * Constructor de objetos, utiliza el método crear() para crear objetos vinvulados a archivos
    * @param nombre String
    * @param n int
    */
    
    public Archivos(String nombre,int n){
        this.ordenado = false;
        crear(nombre, n);
       
    }
    /**
     * Método para crear archivos con un determinado numero de claves
     * @param nombre String
     * @param n int
     */
    public static void crear(String nombre,int n) {
        try {
            //String data = "Hola stackoverflow.com...";
        Archivos.fichero = new File("C:\\Users\\velaz\\OneDrive\\Documentos\\GitHub\\Proyecto-EDA\\Archivos\\",nombre+".txt");
        if (!fichero.exists())
            fichero.createNewFile();
        //Archivos.fw = new FileWriter(fichero.getAbsoluteFile(),true);
        Archivos.fw = new FileWriter(fichero);
        Archivos.bw = new BufferedWriter(fw);
           
            for (int j =0; j< n; j++){
                bw.write(claves());
                bw.write(",");
            }
        //bw.write(data);
        estadoDeArchivos.datos(nombre, false);
        bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    /**
     * Método para generar claves aleatorias con cuatro digitos
     * para la parte entera y dos digitos para la parte decimal
     * @return format1.format(cla) String
     */         
    
    private static String claves(){
        float min = -9999.99f;
        float max = 9999.99f;
        float cla = min + new Random().nextFloat()*(max-min);
        
        DecimalFormat format1 = new DecimalFormat("0000.00");
        
        return format1.format(cla);
    }
    /**
     * Método para eliminar los archivos creados en el programa
     */
    public static void borrarArchivoDirectorio() {

        File directorio = new File("C:\\Users\\velaz\\OneDrive\\Documentos\\GitHub\\Proyecto-EDA\\Archivos\\");
        File f;
        File[] ficheros = directorio.listFiles();
        for (int x=0;x<ficheros.length;x++){
            f = new File("C:\\Users\\velaz\\OneDrive\\Documentos\\GitHub\\Proyecto-EDA\\Archivos\\" +ficheros[x].getName());
            f.delete();
            f.deleteOnExit();
        }
        
    }
}

