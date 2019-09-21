package practica6_TapiaEduardoVelazquezDiego;
import java.util.Iterator; 
import java.util.LinkedList;

public class Graph1 {
    int V;
    LinkedList<Integer> adjArray[];
    int [][] matriz = new int[1000][1000];
    Graph1(int v){
        V = v;
        adjArray = new LinkedList[v]; 
        for (int i=0; i<v; ++i)
            adjArray[i] = new LinkedList(); 
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                matriz[i][j] = 0;
            }
        }
    }
    void addEdge(int v,int w){
        adjArray[v].add(w);
        //adjArray[w].add(v);
    }
    void printGraph(Graph1 graph){
    for(int v = 0; v < graph.V; v++){
        System.out.println("Lista de Adyacencia del vertice "+ v); 
        System.out.println(v);
        for(Integer node: graph.adjArray[v]){
            System.out.print(" -> "+node); 
        }
        System.out.println("\n");
        }
    }
    void imprimirVectores(){
        System.out.println("Los vectores disponibles son:");
        for (int i = 0; i < V; i++) {
            System.out.print("["+ i + "]");
        }
        System.out.println("\n");
    }
    void matrizDeAdyacencia(Graph1 graph, int v){   
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
    void BFS (int s){
        boolean visited[] = new boolean[V];
        LinkedList <Integer> queue = new LinkedList <Integer>();
        
        visited[s] = true;
        queue.add(s);
        
        while(queue.size() != 0){
            s = queue.poll();
            System.out.println(s + " ");
            
            Iterator <Integer> i = adjArray[s].listIterator();
            while (i.hasNext()){
                int n = i.next();
                if (!visited[n]){
                    visited[n] = true;
                    queue.add(n);               
                }
            }
        }
    }
}
