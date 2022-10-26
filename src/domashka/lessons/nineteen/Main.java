package domashka.lessons.nineteen;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        serializable();
        deserializable();
        studentAvailability("Student.out", 12);

    }

    public static void serializable() {

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student("Иван", "Иванов", 1));
        studentArrayList.add(new Student("Иван", "Иванов", 2));
        studentArrayList.add(new Student("Иван", "Иванов", 3));
        studentArrayList.add(new Student("Иван", "Иванов", 4));
        studentArrayList.add(new Student("Иван", "Иванов", 5));
        studentArrayList.add(new Student("Иван", "Иванов", 6));
        studentArrayList.add(new Student("Иван", "Иванов", 7));
        studentArrayList.add(new Student("Иван", "Иванов", 8));
        studentArrayList.add(new Student("Иван", "Иванов", 9));
        studentArrayList.add(new Student("Иван", "Иванов", 10));

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src\\resources\\Student.out"))) {

            for (Student student : studentArrayList) {

                objectOutputStream.writeObject(student);

            }
            System.out.println("Файл успешно сохранен.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {

            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    public static void deserializable() {

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src\\resources\\Student.out"))) {

            while (true) {
                try {
                    Student student = (Student) objectInputStream.readObject();
                    System.out.printf("Name: %s, Surname: %s, Age: %d \n", student.getName(), student.getSurname(), student.getStudentId());
                } catch (EOFException e) {
                    break;
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void studentAvailability(String fileName, int studentId) {
        boolean temp = true;

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src\\resources\\" + fileName))) {

            while (true) {
                try {
                    Student student = (Student) objectInputStream.readObject();
                    if (student.getStudentId() == studentId) {
                        System.out.printf("Name: %s, Surname: %s, Age: %d \n", student.getName(), student.getSurname(), student.getStudentId());
                        temp = false;
                    }

                } catch (EOFException e) {
                    if (temp) {
                        System.out.println("Нет студента");
                    }
                    break;
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
