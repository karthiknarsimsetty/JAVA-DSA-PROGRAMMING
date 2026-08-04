public class CircularQueue {
    private int[] data; private int head=0, tail=0, size=0;
    public CircularQueue(int k){ data=new int[k]; }
    public boolean enQueue(int v){ if(size==data.length) return false; data[tail]=v; tail=(tail+1)%data.length; size++; return true; }
    public boolean deQueue(){ if(size==0) return false; head=(head+1)%data.length; size--; return true; }
    public static void main(String[] args){ CircularQueue q=new CircularQueue(3); q.enQueue(1); System.out.println(q.deQueue()); }
}
