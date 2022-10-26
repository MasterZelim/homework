package domashka.lessons.nine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int studentNumber;


    public Student(String firstName, String lastName, int studentNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
    }

    public static void main(String[] args) {


        int studentsNumber = 0;
        String firstName;
        String lastName;
        int studentNumber = 0;


        while (true) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Сколько студентов хотите добавить?");
            if (scanner.hasNextInt()) {
                studentsNumber = scanner.nextInt();
                break;
            } else {
                System.out.println("Вы ввели неправильное значение!");
            }

        }
        Student[] studentsArray = new Student[studentsNumber];

        for (int i = 0; i < studentsNumber; i++) {

            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите имя студента:");
                if (scanner.hasNextLine()) {
                    firstName = scanner.nextLine();
                    break;
                } else {
                    System.out.println("Вы ввели неправильное значение!");
                }
            }

            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите фамилию студента:");
                if (scanner.hasNextLine()) {
                    lastName = scanner.nextLine();
                    break;
                } else {
                    System.out.println("Вы ввели неправильное значение!");
                }
            }

            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите номер студента:");
                if (scanner.hasNextInt()) {
                    studentNumber = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Вы ввели неправильное значение!");
                }
            }

            Student student1 = new Student(firstName, lastName, studentNumber);
            try {
                studentsArray[i] = student1;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Выход за пределы массива");
            }
            System.out.println("Студент добавлен!");

        }

    }
}



