public class QueueExample {
    private int[] data;
    private int head = 0, tail = 0, size = 0;

    public QueueExample(int capacity) {
        data = new int[capacity];
    }

    public void offer(int x) {
        if (size == data.length) throw new RuntimeException("Queue full");
        data[tail] = x;
        tail = (tail + 1) % data.length;
        size++;
    }

    public int poll() {
        if (size == 0) throw new RuntimeException("Queue empty");
        int val = data[head];
        head = (head + 1) % data.length;
        size--;
        return val;
    }

    public boolean isEmpty() { return size == 0; }

    public static void main(String[] args) {
        QueueExample q = new QueueExample(5);
        q.offer(1);
        q.offer(2);
        q.offer(3);
        while (!q.isEmpty()) {
            System.out.println("Poll: " + q.poll());
        }
    }
}
