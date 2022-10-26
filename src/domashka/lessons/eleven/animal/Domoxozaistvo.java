package domashka.lessons.eleven.animal;

public class Domoxozaistvo {

    public static void main(String[] args) {
        Cat animalCat = new Cat("Мурка");
        Dog animalDog = new Dog("Жучка");
        Cow animalCow = new Cow("Буренка");

        System.out.println(animalCat);
        voice(animalCat);
        use(animalCat);
        place(animalCat);
        System.out.println(animalDog);
        voice(animalDog);
        use(animalDog);
        place(animalDog);
        System.out.println(animalCow);
        voice(animalCow);
        use(animalCow);
        place(animalCow);




    }

    public static  void  voice(Animal animal){
        animal.voice();
    }
    public static void use(Pet pet){
        pet.use();
    }
    public static void place(Pet pet){
        pet.place();
    }

}
