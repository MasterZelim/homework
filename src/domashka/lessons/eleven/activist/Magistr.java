package domashka.lessons.eleven.activist;

public class Magistr implements Activist {

    @Override
    public String activity() {
        return  "Научные работы";
    }

    @Override
    public int stipend() {
        return 10000;
    }

    @Override
    public String meeting() {
        return "Ходить на собрания";
    }
}
