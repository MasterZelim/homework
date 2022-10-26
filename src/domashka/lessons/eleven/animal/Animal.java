package domashka.lessons.eleven.animal;

public abstract class Animal {

    private String nickname;

    public Animal(String nickname) {
        this.nickname = nickname;

    }

    public abstract void voice();

    @Override
    public String toString() {
        return "Animal{" +
                "nickname='" + nickname + '\'' +
                '}';
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
