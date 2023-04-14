package ConstructAnimals;

import java.time.LocalDate;

public class Dogs extends Pets {
    private String nickname;
    private String breed;
    private LocalDate dateOfBirth;

    public Dogs(String nickname, String breed, LocalDate dateOfBirth) {
        super("Собака");
        this.nickname = nickname;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return getTitle() + " " + getName() + " кличка " + nickname + " порода " + breed + " дата рождения " + dateOfBirth;
    }
}
