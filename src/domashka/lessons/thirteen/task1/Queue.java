package domashka.lessons.thirteen.task1;

public class Queue<T> {

    private Object[] ints;
    private T element;
    private int size;
    private int top;

    public Queue(int size) {
        this.size = size;
        ints = new Object[size];
        top = 0;
    }

    public void enqueue(T element) {

        if (top < size) {
            ints[top] = element;
            top++;
        }
    }

    public Object dequeue() {

        Object a = ints[0];
        for (int i = 0; i < top-1; i++) {
            ints[i] = ints[i + 1];
        }
        top--;
        return a;
    }

    public Object top() {

        return ints[0];
    }

    public boolean isEmpty() {
        return top == 0;
    }
}
