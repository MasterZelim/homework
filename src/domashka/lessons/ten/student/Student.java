package domashka.lessons.ten.student;

public class Student {
    String firstName;
    String lastName;
    int studentNumber;
    int studyYears;


    public static void main(String[] args) {

        Bakalavr bakalavr = new Bakalavr("Вася", "Васильев", 1, 4, "Нина Николаевна", 1);
        Bakalavr bakalavr1 = new Bakalavr("Иван", "Иванов", 2, 4, "Сергей Иванов", 2);

        Magistr magistr = new Magistr("Петр", "Петров", 3, 2, "Приложение для автоматизации работы ресторана",
                "Приложение в виде игры для детей", "Андроид разработка");

        Magistr magistr1 = new Magistr("Маша", "Орлова", 4, 2, "Приложение для автоматизации работы ресторана",
                "Приложение раскраска персонажей для детей", "Андроид разработка");


        Aspirant aspirant = new Aspirant("Инна", "Артемьева", 5, 3,
                "Мусульманская дипломатия в раннеисламскую эпоху: зарождение и особенности функционирования (622-661 гг.)", "Профессор истории");

        Aspirant aspirant1 = new Aspirant("Таня", "Павлова", 6, 3,
                "Меловые древесины российского Дальнего Востока", "Профессор биологии");

        System.out.println(bakalavr);
        System.out.println(bakalavr1);
        System.out.println(magistr);
        System.out.println(magistr1);
        System.out.println(aspirant);
        System.out.println(aspirant1);


    }


    public Student(String firstName, String lastName, int studentNumber, int studyYears) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
        this.studyYears = studyYears;
    }

   public  void takeExam(){

    }

   public void payFee (){


    }

    public void study() {
        System.out.println("ученье свет!");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getStudyYears() {
        return studyYears;
    }

    public void setStudyYears(int studyYears) {
        this.studyYears = studyYears;
    }


}
