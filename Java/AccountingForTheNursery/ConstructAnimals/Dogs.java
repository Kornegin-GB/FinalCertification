package ConstructAnimals;

import java.util.Date;

public class Dogs extends Pets {
    private String nickname;
    private String breed;
    private Date dateOfBirth;

    public Dogs(String nickname, String breed, Date dateOfBirth) {
        super("Собака");
        this.nickname = nickname;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return getTitle() + " " + getName() + " кличка " + nickname + " порода " + breed + " возраст " + dateOfBirth;
    }
}
