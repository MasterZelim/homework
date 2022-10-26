package domashka.lessons.eleven.activist;

public class Aspirat implements Activist{

    @Override
    public String activity() {
        return  "Научные исследования";
    }

    @Override
    public int stipend() {
        return 15000;
    }

    @Override
    public String meeting() {
        return "Ходить на собрания";
    }
}
