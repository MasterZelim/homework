package domashka.lessons.ten.student;

public class Aspirant extends Student {

    String dissertation;
    String professor;

    public Aspirant(String firstName, String lastName, int studentNumber, int studyYears, String dissertation, String professor) {
        super(firstName, lastName, studentNumber, studyYears);
        this.dissertation = dissertation;
        this.professor = professor;
    }

    @Override
    public void study() {
        System.out.println("10% - лекции, 20% - преподавание, 70% - научная работа");
    }

    @Override
    public void takeExam() {

    }

    @Override
    public void payFee() {

    }

    public Aspirant(String firstName, String lastName, int studentNumber, int studyYears) {
        super(firstName, lastName, studentNumber, studyYears);
    }

    public String getDissertation() {
        return dissertation;
    }

    public void setDissertation(String dissertation) {
        this.dissertation = dissertation;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", studentNumber = " + studentNumber +
                ", studyYears = " + studyYears +
                ", dissertation = '" + dissertation + '\'' +
                ", professor = '" + professor + '\'' +
                '}';
    }
}
