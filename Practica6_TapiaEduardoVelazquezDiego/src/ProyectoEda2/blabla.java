package ProyectoEda2;

import static ProyectoEda2.Archivos.fichero;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class blabla {
    public void crearListaBloque(File aux1, File aux2, File Final, int inicio, int fin, int inicio2, int fin2){
        LinkedList <Float> L1 = new LinkedList<>();
        LinkedList <Float> L2 = new LinkedList<>();
        LinkedList <Float> L3 = new LinkedList<>();
        L1=leerArchivo(aux1, inicio, fin);
        L2=leerArchivo(aux2, inicio2, fin2);
        while(L1.isEmpty()==false && L2.isEmpty()==false){
            if(L1.get(0) < L2.get(0)){
                L3.add(L1.remove(0));
            }else{
                L3.add(L2.remove(0));
            }
        }
        if(L1.isEmpty()==false){
            L3.addAll(L1);
        }
        if(L2.isEmpty()==false){
            L3.addAll(L2);
        }
        //escribirDatosOrdenados(L3, Final);
    }
    public LinkedList<Float> leerArchivo(File file, int x, int y){
        LinkedList<Float>numeros2 = new LinkedList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String d;
            d = br.readLine();
            String [] numeros = d.split(",");
            for (int t=x; t<y; t++) {
                numeros2.add(Float.valueOf(numeros[t]));
            }
            br.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return numeros2;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    protected void polifase(String nombre, int cant){
        //String bloqueNumeros;
        File archivo = new File("C:\\Users\\velaz\\OneDrive\\Documentos\\GitHub\\Proyecto-EDA\\Archivos\\" + nombre +".txt");
        float clave;
        Scanner entrada = null;
        try{
            entrada = new Scanner(archivo);
            while(entrada.hasNextFloat()){
                clave = entrada.nextFloat();
                if(clave>0){
                    ingresarPositivos(nombre, clave, cant);
                }else{
                    //clave = clave*-100;
                    ingresarNegativos(nombre, clave, cant);
                //System.out.println(clave + " ");
                }
                
            }
            //Proceso("positivos", cant);
        
        } catch (Exception e) {
            System.out.println(e.toString());
        }finally{
            entrada.close();
        }
        
    }
    public void ingresarPositivos(String nombre, float clave, int cant){
        File ficheroP = null;
        FileWriter fwP = null;
        BufferedWriter bwP = null;
        try {
        ficheroP = new File("C:\\Users\\velaz\\OneDrive\\Documentos\\GitHub\\Proyecto-EDA\\Archivos\\positivos.txt");
        if (!ficheroP.exists()){
            ficheroP.createNewFile();
        }
        fwP = new FileWriter(ficheroP.getAbsoluteFile(),true);
        bwP = new BufferedWriter(fwP);
                bwP.write(Conversion(clave));
                bwP.write(",");
        bwP.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        Proceso("positivos", cant);
    }
    public void ingresarNegativos(String nombre, float clave, int cant){
        File ficheroN = null;
        FileWriter fwN = null;
        BufferedWriter bwN = null;
        try {
        ficheroN = new File("C:\\Users\\velaz\\OneDrive\\Documentos\\GitHub\\Proyecto-EDA\\Archivos\\negativos.txt");
        if (!ficheroN.exists())
            ficheroN.createNewFile();
        fwN = new FileWriter(ficheroN.getAbsoluteFile(),true);
        bwN = new BufferedWriter(fwN);
        bwN.write(Conversion(clave));
        bwN.write(",");
        estadoDeArchivos.datos(nombre, false);
        bwN.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public String Conversion(float clave){
        DecimalFormat format1 = new DecimalFormat("0000.00");
        return format1.format(clave);
    }
    public void Proceso(String nombre, int cant){
        int tam;
        if(cant == 777){
            tam = 21;
        }else{
            tam = cant/10;
        }
        try{
        String cadena;
        FileReader archivoOri = new FileReader("C:\\Users\\velaz\\OneDrive\\Documentos\\GitHub\\Proyecto-EDA\\Archivos\\"+ nombre +".txt");//original, positivo o neg
        File archivoAux1 = new File("C:\\Users\\velaz\\OneDrive\\Documentos\\GitHub\\Proyecto-EDA\\Archivos\\aux1.txt");
        File archivoAux2 = new File("C:\\Users\\velaz\\OneDrive\\Documentos\\GitHub\\Proyecto-EDA\\Archivos\\aux2.txt");
        File archivoAux3 = new File("C:\\Users\\velaz\\OneDrive\\Documentos\\GitHub\\Proyecto-EDA\\Archivos\\aux3.txt");
        
        BufferedReader bOri = new BufferedReader(archivoOri);
        
        if (!archivoAux1.exists()){
            archivoAux1.createNewFile();
        }
        if (!archivoAux2.exists()){
            archivoAux2.createNewFile();
        }
        if (!archivoAux3.exists()){
            archivoAux3.createNewFile();
        }
            
        /*entradaOri = new Scanner(archivoOri);
        entradaAux1 = new Scanner(archivoAux1);
        entradaAux2 = new Scanner(archivoAux2);
        entradaAux3 = new Scanner(archivoAux3);*/
        
        //fwOri = new FileWriter(archivoOri.getAbsoluteFile(),true);
        //bwOri = new BufferedWriter(fwOri);
       
        /*fwAux1 = new FileWriter(archivoAux1.getAbsoluteFile(),true);
        bwAux1 = new BufferedWriter(fwAux1);

        fwAux2 = new FileWriter(archivoAux2.getAbsoluteFile(),true);
        bwAux2 = new BufferedWriter(fwAux2);
        
        fwAux3 = new FileWriter(archivoAux3.getAbsoluteFile(),true);
        bwAux3 = new BufferedWriter(fwAux3);*/
        float [] arr=new float[cant]; 
        while((cadena = bOri.readLine())!=null){
            
            //insertionSort(arr);
            
        }

        archivoOri.close();
       
//        entradaOri.close();
//        entradaAux1.close();
//        entradaAux2.close();
//        entradaAux3.close();
        } catch (Exception e) {
            e.printStackTrace();
        }  
    }
    public static void imprimirArreglo(float[] arreglo){
        for(float i:arreglo){  
            System.out.print(i+" ");  
        }
        System.out.println(" ");
    }
    public static void insertionSort(float array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            float key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }
            
   
}
 /*String []cad=new String[cant];
        //while(entradaOri.hasNextFloat()){
            while((cadena = b.readLine())!=null) {            
            String[] cad = cadena.split(",");
            for (int j = 0; j <=cant; j++) {
                    System.out.println(cad[j]+"\n");
                      //claves[j] = Float.parseFloat(cad[j]);
                      //System.out.println(claves[j] + "\n");
                }
            }
            //String [] cad = cadena.split(",");
           
   
                        
                       insertionSort(arr);
                        i++;
                    }
                    if(caso){
                        for (int k = 0; k < tam; k++) {
                            bwAux1.write(Conversion(arr[k]));
                            bwAux1.write(" ");
                        }
                        caso = !caso;
                    }else{
                      for (int k = 0; k < tam; k++) {
                            bwAux2.write(Conversion(arr[k]));
                            bwAux2.write(" ");
                        }  
                    }
                    
                    //}
                    //i=1;
                
                    
                    
                    else{
                    for (int j = 0; j < tam; j++) {
                        float clave = entradaOri.nextFloat();
                        arr[j]=clave;
                        insertionSort(arr);
                        for (int k = 0; k < tam; k++) {
                            bwAux2.write(Conversion(arr[k]));
                        }
                    }
                    i=0;
                }


            //i = i+tam;
        
        
        //}
FileWriter fwOri = null;
        BufferedWriter bwOri = null;
        
        FileWriter fwAux1 = null;
        BufferedWriter bwAux1 = null;
        
        FileWriter fwAux2 = null;
        BufferedWriter bwAux2 = null;
        
        FileWriter fwAux3 = null;
        BufferedWriter bwAux3 = null;
        
        Scanner entradaOri = null;
        Scanner entradaAux1 = null;
        Scanner entradaAux2 = null;
        Scanner entradaAux3 = null;
        //imprimirArreglo(arr);*/
