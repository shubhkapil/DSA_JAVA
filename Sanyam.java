import java.util.*;

public class Sanyam {

    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static int dfs(ArrayList<Edge>[] graph, int[] vis, int i) {
        vis[i] = 1;
        int componentSize = 1; // Initialize component size to 1 (counting the current node)
        for (int j = 0; j < graph[i].size(); j++) {
            Edge e = graph[i].get(j);
            if (vis[e.dest] == -1) {
                componentSize += dfs(graph, vis, e.dest);
            }
        }
        return componentSize;
    }

    public static int solve(int n, int[] from, int[] to) {
        int ans = 0;
        ArrayList<Edge>[] graph = new ArrayList[n+1];

        for (int i = 0; i <= n; i++)
            graph[i] = new ArrayList<>();

        for (int i = 0; i < from.length; i++) {
            graph[from[i]].add(new Edge(from[i], to[i]));
            graph[to[i]].add(new Edge(to[i], from[i])); 
        }

        int[] vis = new int[graph.length];

        for (int i = 0; i < graph.length; i++)
            vis[i] = -1;

        for (int i = 1; i < graph.length; i++) {
            if (vis[i] == -1) {
                int temp = dfs(graph, vis, i);
                ans += Math.ceil(Math.pow(temp,0.5));
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] from = {1, 1,2,3,7};
        int[] to = {2 ,3,4,5,8};
        int nodes = 10;

        int ans = solve(nodes, from, to);
        System.out.println(ans);
    }
}

