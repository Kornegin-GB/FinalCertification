package Models;

public class Dogs extends Pets {
    public Dogs() {
        setTitle("Собака");
    }

    @Override
    public String toString() {
        return getPet() + " - " + getTitle() + ": кличка" + getName() + " порода " + getBreed() + " дата рождения " + getDateOfBirth();
    }
}
