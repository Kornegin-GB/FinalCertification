import ConstructAnimals.*;

import java.util.Date;
import java.util.Scanner;

public class Main {
    private String nickname;
    private String breed;
    private Date dateOfBirth;

    Dogs dogs = new Dogs(nickname, breed, dateOfBirth);
    Cats cats = new Cats(nickname, breed, dateOfBirth);
    Hamsters hamsters = new Hamsters(nickname, breed, dateOfBirth);
    Horses horses = new Horses(nickname, breed, dateOfBirth);
    Camels camels = new Camels(nickname, breed, dateOfBirth);
    Donkeys donkeys = new Donkeys(nickname, breed, dateOfBirth);

    public static void main(String[] args) {

    }

    public void inputAnimals() {
        Scanner input = new Scanner(System.in);
        this.nickname = input.next();
        this.breed = input.next();
        this.dateOfBirth = input.nextLine();
        System.out.println(dogs);
    }
}
