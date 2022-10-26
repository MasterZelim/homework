package domashka.lessons.nineteen;

import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String surname;
    private int studentId;

    public Student(String name, String surname, int studentId) {
        this.name = name;
        this.surname = surname;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

}
