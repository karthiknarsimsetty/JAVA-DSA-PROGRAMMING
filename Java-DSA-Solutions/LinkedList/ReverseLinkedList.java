public class ReverseLinkedList {
    static class Node { int val; Node next; Node(int v){val=v;} }
    public static Node reverse(Node head) {
        Node prev = null, curr = head;
        while (curr != null) { Node next = curr.next; curr.next = prev; prev = curr; curr = next; }
        return prev;
    }
    public static void main(String[] args) { System.out.println("ReverseLinkedList example"); }
}
