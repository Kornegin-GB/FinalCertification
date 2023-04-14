import ConstructAnimals.*;

import java.time.LocalDate;
import java.util.Map;

public class Main {
    UserInterface ui = new UserInterface();
    private Map<String, String> dataAnimals;
    private String nickname;
    private String breed;
    private LocalDate dateOfBirth;

    public static void main(String[] args) {
        Main main = new Main();
        main.runMainMenu();
    }

    public void runMainMenu() {
        ui.showMenu(ui.mainMenu());
        while (true) {
            switch (ui.inputUserMenu(ui.mainMenu())) {
                case 1 -> {
                    System.out.println("\nВыберите раздел для создания");
                    runCreateAnimalsMenu();
                }
                case 2 -> {
                    System.out.println("\nВыберите раздел для чтения");
                    runAnimalsMenu();
                }
                case 3 -> {
                    System.out.println("\nВыберите раздел для редактирования");
                    runAnimalsMenu();
                }
                case 4 -> {
                    System.out.println("Завершение программы...");
                    return;
                }
                default -> System.out.println("Вы выбрали не правильный пункт меню");
            }
        }
    }

    public void runCreateAnimalsMenu() {
        ui.showMenu(ui.animalsMenuCreate());
        while (true) {
            switch (ui.inputUserMenu(ui.animalsMenuCreate())) {
                case 1 -> {
                    System.out.println("Введите данные Собаки");
                    dataAnimals = ui.inputDataAnimals();
                    Dogs dogs = new Dogs(
                            dataAnimals.get("nickname"),
                            dataAnimals.get("breed"),
                            LocalDate.parse(dataAnimals.get("dateOfBirth")));
                    System.out.println(dogs);
                    ui.showMenu(ui.animalsMenuCreate());
                }
                case 2 -> {
                    System.out.println("Введите данные Кошки");
                    dataAnimals = ui.inputDataAnimals();
                    Cats cats = new Cats(
                            dataAnimals.get("nickname"),
                            dataAnimals.get("breed"),
                            LocalDate.parse(dataAnimals.get("dateOfBirth")));
                    System.out.println(cats);
                    ui.showMenu(ui.animalsMenuCreate());
                }
                case 3 -> {
                    System.out.println("Введите данные Хомяка");
                    dataAnimals = ui.inputDataAnimals();
                    Hamsters hamsters = new Hamsters(
                            dataAnimals.get("nickname"),
                            dataAnimals.get("breed"),
                            LocalDate.parse(dataAnimals.get("dateOfBirth")));
                    System.out.println(hamsters);
                    ui.showMenu(ui.animalsMenuCreate());
                }
                case 4 -> {
                    System.out.println("Введите данные Лошади");
                    dataAnimals = ui.inputDataAnimals();
                    Horses horses = new Horses(
                            dataAnimals.get("nickname"),
                            dataAnimals.get("breed"),
                            LocalDate.parse(dataAnimals.get("dateOfBirth")));
                    System.out.println(horses);
                    ui.showMenu(ui.animalsMenuCreate());
                }
                case 5 -> {
                    System.out.println("Введите данные Верблюда");
                    dataAnimals = ui.inputDataAnimals();
                    Camels camels = new Camels(
                            dataAnimals.get("nickname"),
                            dataAnimals.get("breed"),
                            LocalDate.parse(dataAnimals.get("dateOfBirth")));
                    System.out.println(camels);
                    ui.showMenu(ui.animalsMenuCreate());
                }
                case 6 -> {
                    System.out.println("Введите данные Осла");
                    dataAnimals = ui.inputDataAnimals();
                    Donkeys donkeys = new Donkeys(
                            dataAnimals.get("nickname"),
                            dataAnimals.get("breed"),
                            LocalDate.parse(dataAnimals.get("dateOfBirth")));
                    System.out.println(donkeys);
                    ui.showMenu(ui.animalsMenuCreate());
                }
                case 7 -> {
                    ui.showMenu(ui.mainMenu());
                    return;
                }
                default -> System.out.println("Вы выбрали не правильный пункт меню");
            }
        }
    }

    public void runAnimalsMenu() {
        ui.showMenu(ui.animalsMenu());
        while (true) {
            switch (ui.inputUserMenu(ui.animalsMenuCreate())) {
                case 1 -> {
                    System.out.println("Данные Собаки");
                    ui.showMenu(ui.animalsMenu());
                }
                case 2 -> {
                    System.out.println("Данные Кошки");
                }
                case 3 -> {
                    System.out.println("Данные Хомяка");
                }
                case 4 -> {
                    System.out.println("Данные Лошади");
                }
                case 5 -> {
                    System.out.println("Данные Верблюда");
                }
                case 6 -> {
                    System.out.println("Данные Осла");
                }
                case 7 -> {
                    System.out.println("Все данные");
                }
                case 8 -> {
                    ui.showMenu(ui.mainMenu());
                    return;
                }
                default -> System.out.println("Вы выбрали не правильный пункт меню");
            }
        }
    }
}
