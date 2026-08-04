import java.util.*;
public class TopologicalSort {
    public static List<Integer> topoSort(List<List<Integer>> g){ int n=g.size(); int[] indeg=new int[n]; for(int u=0;u<n;u++) for(int v:g.get(u)) indeg[v]++; Queue<Integer> q=new ArrayDeque<>(); for(int i=0;i<n;i++) if(indeg[i]==0) q.add(i); List<Integer> res=new ArrayList<>(); while(!q.isEmpty()){ int u=q.poll(); res.add(u); for(int v:g.get(u)){ if(--indeg[v]==0) q.add(v); } } return res; }
    public static void main(String[] args){ System.out.println("TopologicalSort example"); }
}
