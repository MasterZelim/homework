package domashka.lessons.eleven.animal;

public class Dog extends Animal implements Pet {

    public Dog(String nickname) {
        super(nickname);

    }

    @Override
    public void voice() {
        System.out.println("гавгав");
    }

    @Override
    public void use() {
        System.out.println("Охрана, поводырь, поиск");
    }

    @Override
    public void place() {
        System.out.println("Дом, двор");
    }
}
