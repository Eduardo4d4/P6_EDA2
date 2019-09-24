package ProyectoEda2;
import java.util.*;

public class Insercion{  
    
    public static void insertionSort(ArrayList<Float> array) {  
        int n = array.size();  
        for (int j = 1; j < n; j++) {  
            float key = array.get(j);
            int i = j-1;  
            while ( (i > -1) && ( array.get(i) > key ) ) {  
                array.set(i+1, array.get(i));  
                i--;  
            }  
            array.set(i+1, key);  
        }  
    } 
}