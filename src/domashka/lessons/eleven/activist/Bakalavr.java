package domashka.lessons.eleven.activist;

public class Bakalavr implements Activist {


    @Override
    public String activity() {
       return  "Cпортивные мероприятия";
    }

    @Override
    public int stipend() {
        return 5000;
    }

    @Override
    public String meeting() {
        return "Ходить на собрания";
    }
}
