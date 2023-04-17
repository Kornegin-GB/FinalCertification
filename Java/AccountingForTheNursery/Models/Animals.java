package Models;

public class Animals {
    private String Pet = "Домашнее животное";
    private String PackAnimals = "Вьючное животное";
    private String title = "Вьючное животное";

    public String getPet() {
        return Pet;
    }

    public String getPackAnimals() {
        return PackAnimals;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
