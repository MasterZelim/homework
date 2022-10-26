package domashka.lessons.ten.student;

public class Magistr extends Student {
    String groupProject;
    String individualProject;
    String tutor;

    public Magistr(String firstName, String lastName, int studentNumber, int studyYears, String groupProject, String individualProject, String tutor) {
        super(firstName, lastName, studentNumber, studyYears);
        this.groupProject = groupProject;
        this.individualProject = individualProject;
        this.tutor = tutor;
    }

    @Override
    public void study() {
        System.out.println("30% - лекции, 20% - практика, 50% - самостоятельная работа");
    }

    @Override
    public void takeExam() {

    }

    @Override
    public void payFee() {

    }

    public Magistr(String firstName, String lastName, int studentNumber, int studyYears) {
        super(firstName, lastName, studentNumber, studyYears);
    }

    public String getGroupProject() {
        return groupProject;
    }

    public void setGroupProject(String groupProject) {
        this.groupProject = groupProject;
    }

    public String getIndividualProject() {
        return individualProject;
    }

    public void setIndividualProject(String individualProject) {
        this.individualProject = individualProject;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    @Override
    public String toString() {
        return "Magistr{" + "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", studentNumber = " + studentNumber +
                ", studyYears = " + studyYears +
                ", groupProject = '" + groupProject + '\'' +
                ", individualProject = '" + individualProject + '\'' +
                ", tutor = '" + tutor + '\'' +

                '}';
    }
}
