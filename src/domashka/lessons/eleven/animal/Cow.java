package domashka.lessons.eleven.animal;

public class Cow extends Animal implements Pet {

    public Cow(String nickname) {
        super(nickname);

    }

    @Override
    public void voice() {
        System.out.println("Муууу");
    }

    @Override
    public void use() {
        System.out.println("Молоко, мясо");
    }

    @Override
    public void place() {
        System.out.println("Двор");
    }
}
