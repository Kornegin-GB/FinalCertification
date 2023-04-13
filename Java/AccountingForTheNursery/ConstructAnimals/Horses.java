package ConstructAnimals;

import java.util.Date;

public class Horses extends PackAnimals {
    private String nickname;
    private String breed;
    private Date dateOfBirth;

    public Horses(String nickname, String breed, Date dateOfBirth) {
        super("Лошадь");
        this.nickname = nickname;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return getTitle() + " " + getName() + " кличка " + nickname + " порода " + breed + " возраст " + dateOfBirth;
    }
}
