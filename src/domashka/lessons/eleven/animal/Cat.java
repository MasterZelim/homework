package domashka.lessons.eleven.animal;

public class Cat extends Animal implements Pet {

    public Cat(String nickname) {
        super(nickname);
    }

    @Override
    public void voice() {
        System.out.println("Мяуууу");
    }

    @Override
    public void use() {
        System.out.println("Охота на грызунов, антистресс");
    }

    @Override
    public void place() {
        System.out.println("Дом");
    }

}
