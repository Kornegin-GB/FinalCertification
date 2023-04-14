package ConstructAnimals;

import java.time.LocalDate;

public class Horses extends PackAnimals {
    private String nickname;
    private String breed;
    private LocalDate dateOfBirth;

    public Horses(String nickname, String breed, LocalDate dateOfBirth) {
        super("Лошадь");
        this.nickname = nickname;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return getName() + " кличка " + nickname + " порода " + breed + " возраст " + dateOfBirth;
    }
}
