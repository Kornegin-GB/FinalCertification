package Models;

public class Camels extends PackAnimals {
    public Camels() {
        setTitle("Верблюд");
    }

    @Override
    public String toString() {
        return getPackAnimals() + " - " + getTitle() + ": кличка " + getName() + ", порода " + getBreed() + ", дата рождения " + getDateOfBirth();
    }
}
