package practica6_TapiaEduardoVelazquezDiego;
import java.util.Iterator; 
import java.util.LinkedList;

public class Graph1 {
    int V;
    LinkedList<Integer> adjArray[];
    Graph1(int v){
        V = v;
        adjArray = new LinkedList[v]; 
        for (int i=0; i<v; ++i)
            adjArray[i] = new LinkedList();
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
}
