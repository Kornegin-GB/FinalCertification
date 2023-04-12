package ConstructAnimals;

public class Pets extends Animals {
    private String name;

    public Pets(String name) {
        super("Домашнее животное");
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
