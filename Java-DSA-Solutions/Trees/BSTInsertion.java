public class BSTInsertion {
    static class Node{ int val; Node left,right; Node(int v){val=v;} }
    public static Node insert(Node root, int v){ if(root==null) return new Node(v); if(v<root.val) root.left=insert(root.left,v); else root.right=insert(root.right,v); return root; }
    public static void main(String[] args){ System.out.println("BSTInsertion example"); }
}
