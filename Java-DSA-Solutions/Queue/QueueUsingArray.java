public class QueueUsingArray {
    private int[] data; private int head = 0, tail = 0, size = 0;
    public QueueUsingArray(int capacity){ data = new int[capacity]; }
    public void offer(int v){ if(size==data.length) throw new RuntimeException("full"); data[tail]=v; tail=(tail+1)%data.length; size++; }
    public int poll(){ if(size==0) throw new RuntimeException("empty"); int v=data[head]; head=(head+1)%data.length; size--; return v; }
    public static void main(String[] args){ QueueUsingArray q=new QueueUsingArray(5); q.offer(1); System.out.println(q.poll()); }
}
