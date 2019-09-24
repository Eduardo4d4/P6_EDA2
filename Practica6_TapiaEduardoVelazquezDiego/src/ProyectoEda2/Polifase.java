package ProyectoEda2;

////import java.io.BufferedReader;
////import java.io.File;
////import java.io.FileReader;
////import java.util.ArrayList;
////import java.util.Arrays;
import java.util.*;
import java.io.*;

public class Polifase {
    public void inicio(String nombre, int cant){
        FileWriter fwArchivo = null;
        BufferedWriter bwArchivo = null;
        FileWriter fwAux1 = null;
        BufferedWriter bwAux1 = null;
        FileWriter fwAux2 = null;
        BufferedWriter bwAux2 = null;
        FileWriter fwAux3 = null;
        BufferedWriter bwAux3 = null;
        
        Scanner entradaArch = null;
        Scanner entradaAux1 = null;
        Scanner entradaAux2 = null;
        Scanner entradaAux3 = null;
        
        try{
            String cadena;
            File archivoAux1 = new File("C:\\Users\\velaz\\OneDrive\\Documentos\\GitHub\\Proyecto-EDA\\Archivos\\aux1.txt");
            File archivoAux2 = new File("C:\\Users\\velaz\\OneDrive\\Documentos\\GitHub\\Proyecto-EDA\\Archivos\\aux2.txt");
            File archivoAux3 = new File("C:\\Users\\velaz\\OneDrive\\Documentos\\GitHub\\Proyecto-EDA\\Archivos\\aux3.txt");
            if (!archivoAux1.exists()){
                archivoAux1.createNewFile();
            }
            if (!archivoAux2.exists()){
                archivoAux2.createNewFile();
            }
            if (!archivoAux3.exists()){
                archivoAux3.createNewFile();
            }
            entradaAux1 = new Scanner(archivoAux1);
            entradaAux2 = new Scanner(archivoAux2);
            entradaAux3 = new Scanner(archivoAux3);
            fwAux1 = new FileWriter(archivoAux1.getAbsoluteFile(),true);
            bwAux1 = new BufferedWriter(fwAux1);

            fwAux2 = new FileWriter(archivoAux2.getAbsoluteFile(),true);
            bwAux2 = new BufferedWriter(fwAux2);
        
            fwAux3 = new FileWriter(archivoAux3.getAbsoluteFile(),true);
            bwAux3 = new BufferedWriter(fwAux3);
            
            
            FileReader archivo = new FileReader("C:\\Users\\velaz\\OneDrive\\Documentos\\GitHub\\Proyecto-EDA\\Archivos\\"+nombre+".txt");
            BufferedReader bArchivo = new BufferedReader(archivo);
            ArrayList <String> lista = new ArrayList();
            ArrayList <Float> listaF = new ArrayList();
            while((cadena = bArchivo.readLine())!=null){
                lista.addAll(Arrays.asList(cadena.split(",")));  
            }
            for(int n=0; n< lista.size(); n++){
                String s = lista.get(n);
                listaF.add(Float.parseFloat(s));
            }
            boolean edo = true;
            //f en el chat
            int part = cant/8;
            int tata = listaF.size();
            ArrayList <Float> uno = new ArrayList();
            System.out.println("Arr:  " + listaF.size() + "otra:  " + cant);
            for(int i = 0; i<8; i++){
                int cont = 0;
                if(listaF.size()==(part+(cant%8))){
                    uno.addAll(listaF);
                    System.out.println("tam: " + uno.size()+ " \n" +uno);
                    break;
                }
                while(cont<part){
                    uno.add(listaF.remove(0));
                    cont++;
                }
                System.out.println("tam: " + uno.size()+ " \n" +uno);
                uno.clear();
            }
//            for (int i = 0; i !=listaF.size() ; i++) {
//                int part2 =+part;
//                int cont = 0;
//                while(cont<part){
//                    uno.add(listaF.remove(cont));
//                    cont++;
//                }
//                System.out.println(uno);
//                System.out.println("t: " + uno.size());
//                uno.clear();
//            }
            /*int k=0;
            for (int i = 0; i < listaF.size(); i+=part) {
                int part2 =+part;
                ArrayList <Float> uno = new ArrayList();
                for (int j = i; j < part2; j++) {
                    uno.add(k, listaF.get(j));
                    
                    i++;
                    k++;
                }
                System.out.println("tam: " +uno.size());
                System.out.println(uno);
                //uno.clear();
                
                if(edo){
                        
                        
                        
                    edo = false;
                }else{
                        
                    edo=true;
                }
                
            }*/             // pruebas con array y creacion de 1 bloque
            //System.out.println(listaF);
            archivo.close();
            bwAux1.close();
            bwAux2.close();
            bwAux3.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
