package ConstructAnimals;

import java.time.LocalDate;

public class Cats extends Pets {
    private String nickname;
    private String breed;
    private LocalDate dateOfBirth;

    public Cats(String nickname, String breed, LocalDate dateOfBirth) {
        super("Кошка");
        this.nickname = nickname;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return getName() + " кличка " + nickname + " порода " + breed + " дата рождения " + dateOfBirth;
    }
}
