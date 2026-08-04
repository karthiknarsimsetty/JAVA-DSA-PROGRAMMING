public class LowestCommonAncestor {
    static class Node{ int val; Node left,right; Node(int v){val=v;} }
    public static Node lca(Node root, Node p, Node q){ if(root==null) return null; if(root==p||root==q) return root; Node left=lca(root.left,p,q); Node right=lca(root.right,p,q); if(left!=null && right!=null) return root; return left!=null?left:right; }
    public static void main(String[] args){ System.out.println("LowestCommonAncestor example"); }
}
