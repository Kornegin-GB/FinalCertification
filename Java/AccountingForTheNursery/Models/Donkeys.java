package Models;

public class Donkeys extends PackAnimals {
    public Donkeys() {
        setTitle("Осёл");
    }

    @Override
    public String toString() {
        return getPackAnimals() + " - " + getTitle() + ": кличка" + getName() + " порода " + getBreed() + " дата рождения " + getDateOfBirth();
    }
}
