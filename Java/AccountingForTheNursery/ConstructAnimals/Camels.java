package ConstructAnimals;

import java.time.LocalDate;

public class Camels extends PackAnimals {
    private String nickname;
    private String breed;
    private LocalDate dateOfBirth;

    public Camels(String nickname, String breed, LocalDate dateOfBirth) {
        super("Верблюд");
        this.nickname = nickname;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return getName() + " кличка " + nickname + " порода " + breed + " дата рождения " + dateOfBirth;
    }
}
