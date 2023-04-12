import ConstructAnimals.Cats;
import ConstructAnimals.Dogs;
import ConstructAnimals.Horses;

public class Main {
    public static void main(String[] args) {
        Dogs dog = new Dogs("Бим", "Далматинец", 1);
        System.out.println(dog);
        Cats cat = new Cats("Барсик", "Британец", 4);
        System.out.println(cat);
        Horses horse = new Horses("Вихорь", "Русак", 2);
        System.out.println(horse);
        System.out.println(horse.getTitle());
        System.out.println(horse.getName());
    }
}
