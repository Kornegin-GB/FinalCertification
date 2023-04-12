package ConstructAnimals;

public class Cats extends Pets {
    private String nickname;
    private String breed;
    private int age;

    public Cats(String nickname, String breed, int age) {
        super("Кошка");
        this.nickname = nickname;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString() {
        return getTitle() + " " + getName() + " кличка " + nickname + " порода " + breed + " возраст " + age;
    }
}
