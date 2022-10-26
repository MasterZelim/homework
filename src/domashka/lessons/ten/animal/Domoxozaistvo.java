package domashka.lessons.ten.animal;

import domashka.lessons.eleven.animal.Animal;
import domashka.lessons.eleven.animal.Cat;
import domashka.lessons.eleven.animal.Cow;
import domashka.lessons.eleven.animal.Dog;

public class Domoxozaistvo {

    public static void main(String[] args) {

        Cat cat = new Cat("Мурка");
        Cow cow = new Cow("Буренка");
        Dog dog = new Dog("Тузик");


        System.out.println(cat);
        voice(cat);
        System.out.println(cow);
        voice(cow);
        System.out.println(dog);
        voice(dog);

    }

    public static void voice(Animal animal){
        animal.voice();
    }
}
