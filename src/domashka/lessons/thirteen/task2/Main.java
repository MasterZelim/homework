package domashka.lessons.thirteen.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Queue queue;
        Scanner scanner;

        while (true) {
            try {
                scanner = new Scanner(System.in);
                System.out.println("Введите размер очереди:");
                if (scanner.hasNextInt()) {
                    int queueSize = scanner.nextInt();
                    queue = new Queue(queueSize);
                    System.out.println("Очередь с размером " + queueSize + " человек создана.");
                    break;
                } else {
                    System.out.println("Вы ввели неправильное значение!");
                }
            } catch (Exception e) {
                System.out.println("Вы ввели неправильное значение!");
            }

        }

        while (true) {

            scanner = new Scanner(System.in);
            System.out.println("Введите in - для добавления в очередь, out - для удаления из очереди, exit - для выхода из программы:");
            String identifier = scanner.nextLine();
            if (identifier.equals("in")) {
                System.out.println("Введите имя:");
                String name = scanner.nextLine();
                if (!queue.isFull()) {
                    queue.enqueue(name);
                } else {
                    System.out.println("В очереди нет места, подождите!");
                }
            } else if (identifier.equals("out")) {

                if (!queue.isEmpty()) {
                    System.out.println(queue.dequeue());
                } else {
                    System.out.println("Очередь пустая!");
                }

            } else if (identifier.equals("exit")) {
                break;
            } else {
                System.out.println("Вы ввели неправильное значение!");
            }

        }
        scanner.close();

    }

}




