public class SinglyLinkedList {
    static class Node { int val; Node next; Node(int v){val=v;} }
    private Node head;
    public void add(int v){ Node n=new Node(v); n.next=head; head=n; }
    public void print(){ Node cur=head; while(cur!=null){ System.out.print(cur.val+" "); cur=cur.next;} System.out.println(); }
    public static void main(String[] args){ SinglyLinkedList l=new SinglyLinkedList(); l.add(1); l.add(2); l.print(); }
}
