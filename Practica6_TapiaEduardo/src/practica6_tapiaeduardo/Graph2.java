package practica6_tapiaeduardo;
import java.util.LinkedList;


public class Graph2 {
    int V;
    LinkedList<Integer> adjArray[];
    Graph2(int v){
        V = v;
        adjArray = new LinkedList[v]; 
        for (int i=0; i<v; ++i)
            adjArray[i] = new LinkedList();
    }
    void addEdge(int v,int w, int z){
        adjArray[v].add(w);
        adjArray[v].add(z);
    }
    void printGraph2(Graph2 graph){
    for(int v = 0; v < graph.V; v++){
        System.out.println("Lista de Adyacencia del vertice "+ v); 
        System.out.println(v);
        for(int n=0; n<graph.adjArray[v].size(); n++){
            int aux = graph.adjArray[v].get(n);
            System.out.print(" -> "+aux);
            n++;
            int aux2 = graph.adjArray[v].get(n);
            System.out.print("[ "+ aux2 + " ]");
        }
        System.out.println("\n");
        }
    } 
}
