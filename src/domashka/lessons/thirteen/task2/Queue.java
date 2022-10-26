package domashka.lessons.thirteen.task2;

import java.util.Scanner;

public class Queue {

    private String[] queueHuman;
    private String element;
    private int size;
    private int top;

    public Queue(int size) {
        queueHuman = new String[size];
        this.size = size;
        top = 0;
    }

    public void enqueue(String element) {

        queueHuman[top] = element;
        top++;

    }

    public String dequeue() {

        String temp = queueHuman[0];

        for (int i = 0; i < top-1; i++) {
            queueHuman[i] = queueHuman[i + 1];
        }
        top--;
        return temp;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isFull() {
        return top == size;
    }

}
