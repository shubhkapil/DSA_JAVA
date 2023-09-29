package Graph;

import java.util.ArrayList;

public class Dijkstra {

    public static class Edge
    {
        int src;
        int dest;
        int wt;
        // Constructor to create a new edge object.
        public Edge(int source, int destination, int weight)
        {
            src = source;
            dest = destination;
            wt = weight;
        }
    } 


    public static void createGraph(ArrayList<Edge>[] graph)
    {
        graph[0].add(new Edge(0,1,2));

        graph[0].add(new Edge(0,2,4));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,7));
        graph[2].add(new Edge(2,4,3));
        graph[3].add(new Edge(3,5,1));
        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));
    }
    public static void dijkstra(ArrayList<Edge>[] graph,int src)
    {
        int[] dist = new int[graph.length];
        boolean[] vis = new boolean[graph.length];
        for(int i=0;i<graph.length;i++)
            if(i!=src) dist[i] = Integer.MAX_VALUE;
        
        //COMPLETE THE FUNCTION................................................
        
        for(int i=0;i<dist.length; i++)
            System.out.print(dist[i]+" ");
    }
    public static void main(String[] args)
    {
        int n = 6;
        ArrayList<Edge>[] graph = new ArrayList[n];
        
        for(int i=0;i<n;i++)
            graph[i] = new ArrayList<Edge>();

        createGraph(graph);

    }
    
}
