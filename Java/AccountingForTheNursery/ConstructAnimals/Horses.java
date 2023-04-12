package ConstructAnimals;

public class Horses extends PackAnimals {
    private String nickname;
    private String breed;
    private int age;

    public Horses(String nickname, String breed, int age) {
        super("Лошадь");
        this.nickname = nickname;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString() {
        return getTitle() + " " + getName() + " кличка " + nickname + " порода " + breed + " возраст " + age;
    }
}
