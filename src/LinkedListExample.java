public class LinkedListExample {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    private Node head;

    public void insertAtEnd(int data) {
        Node node = new Node(data);
        if (head == null) { head = node; return; }
        Node cur = head;
        while (cur.next != null) cur = cur.next;
        cur.next = node;
    }

    public void deleteFirst(int key) {
        if (head == null) return;
        if (head.data == key) { head = head.next; return; }
        Node cur = head;
        while (cur.next != null && cur.next.data != key) cur = cur.next;
        if (cur.next != null) cur.next = cur.next.next;
    }

    public void printList() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " -> ");
            cur = cur.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListExample list = new LinkedListExample();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        System.out.print("List after inserts: ");
        list.printList();
        list.deleteFirst(20);
        System.out.print("List after deleting 20: ");
        list.printList();
    }
}
