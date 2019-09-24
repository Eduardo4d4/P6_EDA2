package ProyectoEda2;
import static ProyectoEda2.Archivos.borrarArchivoDirectorio;
import java.util.Scanner;

public class ProyectoEda2 {

    /**
     * Método principal
     * se crean automaticamente los archivos con 500,750, 1000, 777  
     * 
     * @author Velázquez Rodriguez Diego
     * @author Tapia Sandoval Eduardo Herminio
     */
    public static void main(String[] args) {
        Archivos arch500 = new Archivos("Claves500", 500);
        Archivos arch750 = new Archivos("Claves750", 750);
        Archivos arch1000 = new Archivos("Claves1000", 1000);
        Archivos arch777 = new Archivos("Claves777", 777);
        menu();

    }
    /**
     * Método para seleccionar el tipo de ordenamiento
     * @return true or false
     */
    public static boolean selectionAD(){
        System.out.println("Ingresa 1 para un ordenamiento acendente "
                           +"\nO cualquier otro numero para un ordenamiento decendente");
        int selec=lecturaN();
        if(selec==1){
            return true;
        }else{
            return false;
        }
    }
    /**
     * Método para lectura de numeros enteros
     * @return val int
     */
    public static int lecturaN(){
        Scanner scN = new Scanner(System.in);
        int val = scN.nextInt();
        return val;
    }
    /**
     * Método para lectura de numeros cadenas
     * @return cad String
     */
    public static String lecturaS(){
        Scanner scS = new Scanner(System.in);
        String cad = scS.nextLine();
        return cad;
    }
    /**
     * Método para mostrar el menú de opciones y hacer el llamado a los Algoritmos de ordenamiento
     */
    public static void menu(){
        
        int x=0;
        System.out.println("Seleccione una opcion" 
                            +"\n1)Polifase"
                            +"\n2)Mezcla equilibrada"
                            +"\n3)Método por distribucion"
                            +"\n4)Crear archivo"
                            +"\n5)Lectura de archivos"
                            +"\n6)Salir");
            x = lecturaN();
            switch(x){
                case 1:
                    System.out.println("***POLIFASE***");
                    Polifase pol = new Polifase();
                    lecturaDeArchivos lectPolifase = new lecturaDeArchivos();
                    System.out.println("\nLos archivos disponibles son");
                    lectPolifase.muestraArchivos();
                    System.out.println("\nIngrese el nombre del archivo");
                    String namePolifase = lecturaS();
                    switch(namePolifase){
                        case "Claves500":
                            pol.inicio(namePolifase, 500);
                            menu();
                            break;
                        case "Claves750":
                            pol.inicio(namePolifase, 750);
                            break;
                        case "Claves1000":
                            pol.inicio(namePolifase, 1000);
                            break;
                        case "Claves777":
                            pol.inicio(namePolifase, 777);
                            break;
                            
                    }
                    
//                    selectionAD();
                    break;
                case 2:
                    System.out.println("***MEZCLA EQUILIBRADA***");
                    selectionAD();
                    break;
                case 3:
                    System.out.println("***RADIX***");
                    selectionAD();
                    break;
                case 4:
                    
                    System.out.println("***CREANDO ARCHIVO***"
                                       +"\nIngrese el nombre del archivo");
                    String name = lecturaS();
                    System.out.println( "\nIngresa el numero de claves");
                    int numCl = lecturaN();                
                    Archivos arch = new Archivos(name, numCl);
                    System.out.println("***ARCHIVO CREADO***");
                    menu();
                    break;
                case 5: 
                    System.out.println("***LECTURA DE ARCHIVOS***");
                    lecturaDeArchivos lect = new lecturaDeArchivos();
                    System.out.println("\nLos archivos disponibles son");
                    lect.muestraArchivos();
                    System.out.println("\nIngrese el nombre del archivo");
                    String name1 = lecturaS();
                    lect.muestraContenido(name1,500);
                    menu();
                    break;
                case 6:
                    System.out.println("***SALIR***");
                    borrarArchivoDirectorio();
                    break;
                default:
                    System.out.println("***OPCION NO VALIDA***");
                    menu();
            }
    }
//    public static int desicion(){
//        System.out.println("¿Desea realizar otra vez este proceso?"
//                           +"\n1) SI"
//                           +"\n2)NO y Salir"
//                           +"\n3) regresar al menú");
//        int des = lecturaN();
//        switch(des){
//            case 1:
//                return 1;
//            case 2:
//                break;
//            case 3:
//                menu();
//                break;
//            default:
//                desicion();
//        }
//        return 0;
//    }
}
