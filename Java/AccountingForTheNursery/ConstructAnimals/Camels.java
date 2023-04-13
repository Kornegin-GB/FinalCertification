package ConstructAnimals;

import java.util.Date;

public class Camels extends PackAnimals {
    private String nickname;
    private String breed;
    private Date dateOfBirth;

    public Camels(String nickname, String breed, Date dateOfBirth) {
        super("Верблюд");
        this.nickname = nickname;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return getTitle() + " " + getName() + " кличка " + nickname + " порода " + breed + " возраст " + dateOfBirth;
    }
}
