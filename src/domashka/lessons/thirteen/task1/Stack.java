package domashka.lessons.thirteen.task1;

public class Stack<T> {

    private Object[] ints;
    private T element;
    private int size;
    private int top;

    public Stack(int size) {
        this.size = size;
        ints = new Object[size];
        top = 0;
    }

    public void push(T element) {

        if (top < size) {
            ints[top] = element;
            top++;
        }
    }

    public Object pop() {

        if (!isEmpty()) {
            Object a = ints[top - 1];
            ints[top - 1] = 0;
            top--;
            return a;
        }
        return 0;
    }

    public Object top() {

        if (!isEmpty()) {
            return ints[top - 1];
        }
        return 0;
    }

    public boolean isEmpty() {
        return top == 0;
    }
}
