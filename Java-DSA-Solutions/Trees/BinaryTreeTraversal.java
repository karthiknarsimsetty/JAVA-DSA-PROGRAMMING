public class BinaryTreeTraversal {
    static class Node{ int val; Node left,right; Node(int v){val=v;} }
    public static void inorder(Node root){ if(root==null) return; inorder(root.left); System.out.print(root.val+" "); inorder(root.right); }
    public static void main(String[] args){ System.out.println("BinaryTreeTraversal example"); }
}
