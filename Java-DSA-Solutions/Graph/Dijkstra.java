import java.util.*;
public class Dijkstra {
    static class Edge { int v; int w; Edge(int v,int w){this.v=v;this.w=w;} }
    public static int[] dijkstra(List<List<Edge>> g, int src){ int n=g.size(); int[] dist=new int[n]; Arrays.fill(dist,Integer.MAX_VALUE); dist[src]=0; PriorityQueue<int[]> pq=new PriorityQueue<>(java.util.Comparator.comparingInt(a->a[0])); pq.add(new int[]{0,src}); while(!pq.isEmpty()){ int[] cur=pq.poll(); int d=cur[0], u=cur[1]; if(d>dist[u]) continue; for(Edge e: g.get(u)) if(dist[e.v]>d+e.w){dist[e.v]=d+e.w; pq.add(new int[]{dist[e.v], e.v});}} return dist; }
    public static void main(String[] args){ System.out.println("Dijkstra example"); }
}
