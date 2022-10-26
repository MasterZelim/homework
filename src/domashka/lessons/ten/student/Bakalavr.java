package domashka.lessons.ten.student;

public class Bakalavr extends Student {

    String curator;
    int currentYear;

    public Bakalavr(String firstName, String lastName, int studentNumber, int studyYears, String curator, int currentYear) {
        super(firstName, lastName, studentNumber, studyYears);
        this.curator = curator;
        this.currentYear = currentYear;
    }

    @Override
    public void study() {
        System.out.println("40% - лекции, 40% - практика, 20% - самостоятельная работа");
    }

    @Override
    public void takeExam() {

    }

    @Override
    public void payFee() {

    }

    public Bakalavr(String firstName, String lastName, int studentNumber, int studyYears) {
        super(firstName, lastName, studentNumber, studyYears);
    }

    public String getCurator() {
        return curator;
    }

    public void setCurator(String curator) {
        this.curator = curator;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    @Override
    public String toString() {
        return "Bakalavr{" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", studentNumber = " + studentNumber +
                ", studyYears = " + studyYears +
                ", curator = '" + curator + '\'' +
                ", currentYear = " + currentYear +
                '}';
    }
}
