package ConstructAnimals;

import java.time.LocalDate;

public class Hamsters extends Pets {
    private String nickname;
    private String breed;
    private LocalDate dateOfBirth;

    public Hamsters(String nickname, String breed, LocalDate dateOfBirth) {
        super("Хомяк");
        this.nickname = nickname;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return getName() + " кличка " + nickname + " порода " + breed + " возраст " + dateOfBirth;
    }
}
