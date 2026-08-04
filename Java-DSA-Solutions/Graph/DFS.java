import java.util.*;
public class DFS {
    public static void dfs(List<List<Integer>> g, int u, boolean[] vis){
        vis[u]=true; System.out.print(u+" "); for(int v: g.get(u)) if(!vis[v]) dfs(g,v,vis);
    }
    public static void main(String[] args){ System.out.println("DFS example"); }
}
