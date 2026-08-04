import java.util.*;
public class BFS {
    public static void bfs(java.util.List<List<Integer>> graph, int start){
        boolean[] vis = new boolean[graph.size()]; Queue<Integer> q = new ArrayDeque<>(); q.add(start); vis[start]=true;
        while(!q.isEmpty()){ int u=q.poll(); System.out.print(u+" "); for(int v:graph.get(u)) if(!vis[v]){vis[v]=true; q.add(v);} }
    }
    public static void main(String[] args){ System.out.println("BFS example"); }
}
