package ConstructAnimals;

public class Dogs extends Pets {
    private String nickname;
    private String breed;
    private int age;

    public Dogs(String nickname, String breed, int age) {
        super("Собака");
        this.nickname = nickname;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString() {
        return getTitle() + " " + getName() + " кличка " + nickname + " порода " + breed + " возраст " + age;
    }
}
