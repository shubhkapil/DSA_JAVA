package Graph;
import java.util.*;

public class BellmanFord {

    public static class Edge{
        int src,dest,wt;

        Edge(int src,int dest,int wt)
        {
            this.src = src;
            this.dest= dest;
            this.wt  = wt;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph)
    {

        /*
                1
              / |  \
             /  |   \
            0   |     4
             \  |    /
              \ |   /
                2--3
       */
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));
        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));
        graph[4].add(new Edge(4, 1, -1));

    }

    public static void bellmanFord(ArrayList<Edge>[] graph,int src)
    {
        int[] dist = new int[graph.length];
        for(int i=0;i<graph.length;i++)
            if(i!=src) dist[i] = Integer.MAX_VALUE;
            
        int V = graph.length;
        for(int k=0;k<V-1;k++)
        {
            for(int i =0;i<graph.length;i++)
            {
                for(int j=0;j<graph[i].size();j++)
                {
                    Edge e = graph[i].get(j);

                    if(dist[e.src]!=Integer.MAX_VALUE && dist[e.src] + e.wt < dist[e.dest])
                        dist[e.dest] = dist[e.src] + e.wt;
                }
            }
        }

        for(int i=0;i<dist.length;i++)
        {
            if(dist[i]!=Integer.MAX_VALUE) System.out.print(dist[i]+" ");
            else    System.out.print("NA ");
        }
            
    }
    public static void main(String[] args)
    {
    
        int n = 5;
        ArrayList<Edge>[] graph = new ArrayList[n];

        for(int i =0;i<n;i++)
            graph[i] = new ArrayList<Edge>();

        createGraph(graph);

        bellmanFord(graph,4);
    }
    
}
