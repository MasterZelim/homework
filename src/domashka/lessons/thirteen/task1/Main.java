package domashka.lessons.thirteen.task1;

public class Main {

    public static void main(String[] args) {

        Stack stack = new Stack(6);

        stack.push(1);
        stack.push(2);
        stack.push("n;akds");
        stack.push("sdasd");

        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());

        Queue queue = new Queue(2);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue("asdf");
        queue.enqueue("aswewef");



        System.out.println(queue.top());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.top());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }
}
