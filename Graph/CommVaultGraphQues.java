package Graph;
import java.util.*;

public class CommVaultGraphQues {

    public static class Edge
    {
        int src;
        int dest;
        Edge(int src,int dest)
        {
            this.src = src;
            this.dest = dest;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph,int N, int I, int arr[])
    {
        for(int i=0;i<N;i++)
            graph[i] = new ArrayList<>(null);

        for(int i =0;i<N;i+=I)
        {
            for(int j = 0;j<I;j++)
            {
                graph[arr[i]].add(new Edge(arr[i],arr[i++]));
            }
        }
         
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int I=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        ArrayList<Edge>[] graph = new ArrayList[n];

        for(int i=0;i<graph.length;i++)
            graph[i] = new ArrayList<Edge>();
        createGraph(graph,n,I,arr);
    }
    
}
