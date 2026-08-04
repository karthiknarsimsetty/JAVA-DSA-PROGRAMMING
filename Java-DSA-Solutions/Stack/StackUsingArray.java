public class StackUsingArray {
    private int[] data; private int top = -1;
    public StackUsingArray(int capacity){ data = new int[capacity]; }
    public void push(int v){ data[++top]=v; }
    public int pop(){ return data[top--]; }
    public boolean isEmpty(){ return top==-1; }
    public static void main(String[] args){ StackUsingArray s=new StackUsingArray(10); s.push(1); System.out.println(s.pop()); }
}
