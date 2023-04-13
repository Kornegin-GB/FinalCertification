package ConstructAnimals;

import java.util.Date;

public class Donkeys extends PackAnimals {
    private String nickname;
    private String breed;
    private Date dateOfBirth;

    public Donkeys(String nickname, String breed, Date dateOfBirth) {
        super("Осёл");
        this.nickname = nickname;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return getTitle() + " " + getName() + " кличка " + nickname + " порода " + breed + " возраст " + dateOfBirth;
    }
}
