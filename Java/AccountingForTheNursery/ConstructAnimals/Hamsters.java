package ConstructAnimals;

import java.util.Date;

public class Hamsters extends Pets {
    private String nickname;
    private String breed;
    private Date dateOfBirth;

    public Hamsters(String nickname, String breed, Date dateOfBirth) {
        super("Хомяк");
        this.nickname = nickname;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return getTitle() + " " + getName() + " кличка " + nickname + " порода " + breed + " возраст " + dateOfBirth;
    }
}
