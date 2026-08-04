public class BSTSearch {
    static class Node{ int val; Node left,right; Node(int v){val=v;} }
    public static boolean search(Node root, int target){ if(root==null) return false; if(root.val==target) return true; return target<root.val?search(root.left,target):search(root.right,target); }
    public static void main(String[] args){ System.out.println("BSTSearch example"); }
}
