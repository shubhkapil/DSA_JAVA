package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
 * 
 * Every time you traverse a graph component, everytime when you visit
 * your neighbour, and then visits is corresponding neigbours
 * Increase the value of visited by 1 for the node that is parent
 * This way if we hit the case of loop
 * Then by calcualting the summation of all prev values of visited array
 * we can find the lenght of cycle in a graph
 * thus prooving bipartite
 */

public class Bipartite {
    
    public static class Edge{
        int src, dest;

        Edge(int src,int dest)
        {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void bipartite(ArrayList<Edge>[] graph)
    {
        int vis[] = new int[graph.length];
        for(int i=0;i<graph.length;i++)
            vis[i]=-1; 
        for(int i = 0;i<graph.length;i++)
        {
            if(vis[i]==-1)
            {
                Queue<Integer> q = new LinkedList<>();
                q.add(0);
                while(!q.isEmpty())
                {
                    int curr = q.remove();
                    if(vis[curr]==-1)
                    {
                        System.out.println(curr);
                        vis[curr] = 1;
                        for(int j =0;j<graph[curr].size();j++)
                        {
                            Edge e = graph[curr].get(j);
                            q.add(e.dest);
                        }
                    }
                    // else if()
                    // {

                    // }
                }
            }
        }
        
        
    }
    public static void main(String args[])
    {
        int e=14;
        ArrayList<Edge>[] graph = new ArrayList[e];

        for(int i=0;i<graph.length;i++)
            graph[i] = new ArrayList<>();

        /*

            0---1   4---5
            |   |    \  |
            |   |      6
            3---2
         */

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 2));
        graph[3].add(new Edge(3, 0));

        graph[1].add(new Edge(4, 5));
        graph[1].add(new Edge(5, 4));

        graph[2].add(new Edge(5, 6));
        graph[2].add(new Edge(6, 5));

        graph[3].add(new Edge(4, 6));
        graph[3].add(new Edge(6, 4));

        bipartite(graph);



    } 
    
}
