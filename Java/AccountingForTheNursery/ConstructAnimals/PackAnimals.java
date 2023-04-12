package ConstructAnimals;

public class PackAnimals extends Animals {
    private String name;

    public PackAnimals(String name) {
        super("Вьючное животное");
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
