package ConstructAnimals;

import java.time.LocalDate;

public class Donkeys extends PackAnimals {
    private String nickname;
    private String breed;
    private LocalDate dateOfBirth;

    public Donkeys(String nickname, String breed, LocalDate dateOfBirth) {
        super("Осёл");
        this.nickname = nickname;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return getName() + " кличка " + nickname + " порода " + breed + " возраст " + dateOfBirth;
    }
}
