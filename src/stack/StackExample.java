public class StackExample {
    private int[] data;
    private int top = -1;

    public StackExample(int capacity) {
        data = new int[capacity];
    }

    public void push(int x) {
        if (top == data.length - 1) {
            throw new RuntimeException("Stack overflow");
        }
        data[++top] = x;
    }

    public int pop() {
        if (top == -1) throw new RuntimeException("Stack underflow");
        return data[top--];
    }

    public int peek() {
        if (top == -1) throw new RuntimeException("Stack is empty");
        return data[top];
    }

    public boolean isEmpty() { return top == -1; }

    public static void main(String[] args) {
        StackExample stack = new StackExample(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top: " + stack.peek());
        while (!stack.isEmpty()) {
            System.out.println("Pop: " + stack.pop());
        }
    }
}
