package practica6_TapiaEduardoVelazquezDiego;

import java.util.Scanner;


public class practica6_TapiaEduardoVelazquezDiego {
    public static void main(String[] args) { 
        System.out.println("*** CREACION DE GRAFOS ***");
        System.out.println("INDIQUE EL TIPO DE GRAFO QUE REALIZARA"
                + "\n1) GRAFO DIRIGIDO"
                + "\n2) GRAFO PONDERADO DIRIGIDO"
                + "\n3) SALIR");
        int opc = lectura();
        while(opc <1 || opc>3){
            System.out.print("*OPCION INCORRECTA, INTENTE DE NUEVO* ");
            opc = lectura();
        }
        switch(opc){
            case 1:
                grafo1();
                break;
            case 2:
                grafo2();
                break;
            case 3:
                System.out.println("*** ADIOS ***");
                break;
        }
    }
    private static void grafo2(){
        System.out.println("Ingrese el numero de vertices");
        int v= lectura();
        Graph2 graph2 = new Graph2(v);
        graph2.imprimirVectores();
        for (int i = 0; i < v; i++) {
            System.out.println("Cuantas arisrtas quiere para el vertice " + i);
            int aristas = lectura();
            for (int j = 0; j < aristas; j++) {
                System.out.println("[Para el vertice " + i + "]");
                System.out.print("Indicque el nodo con el cual hacer la conexion:  ");
                int vert = lectura();
                while(vert<0 || vert>v){
                    System.out.println("Vertice no valido, intente de nuevo");
                    vert = lectura();
                }
                System.out.print("Indique el valor de la arista:   ");
                int val = lectura();
                graph2.addEdge(i, vert, val); 
            }
        }
        graph2.printGraph2(graph2);
        
        
    }
    private static void grafo1(){
        System.out.println("Ingrese el numero de vertices");
        int v= lectura();
        Graph1 graph = new Graph1(v);
        graph.imprimirVectores();
        for (int i = 0; i < v; i++) {
            System.out.println("Cuantas arisrtas quiere para el vertice " + i);
            int aristas = lectura();
            for (int j = 0; j < aristas; j++) {
                System.out.println("[Para el vertice " + i + "]");
                System.out.println("Indicque el nodo con el cual hacer la conexion");
                int vert = lectura();
                while(vert<0 || vert>v){
                    System.out.println("Vertice no valido, intente de nuevo");
                    vert = lectura();
                }
                
                graph.addEdge(i, vert);
                graph.matriz[i][vert] = 1;
            }
        }
        graph.printGraph(graph);
        System.out.println("****Matriz de adyacenia****");
        graph.matrizDeAdyacencia(graph, v);
        
        System.out.println("****Breadth First search****");
        graph.imprimirVectores();
        graph.BFS(0);
    }
    public static int lectura(){
        Scanner sc = new Scanner(System.in);
        int lect = sc.nextInt();
        return lect;
    }
}

