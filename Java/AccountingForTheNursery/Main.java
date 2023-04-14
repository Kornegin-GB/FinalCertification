import ConstructAnimals.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    UserInterface ui = new UserInterface();
    Modul_db md = new Modul_db();
    private Map<String, String> dataAnimals;

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
                    System.out.println("Данные о собаке внесены");
                    md.createFile("dogs", dogs.toString());
                    ui.showMenu(ui.animalsMenuCreate());
                }
                case 2 -> {
                    System.out.println("Введите данные Кошки");
                    dataAnimals = ui.inputDataAnimals();
                    Cats cats = new Cats(
                            dataAnimals.get("nickname"),
                            dataAnimals.get("breed"),
                            LocalDate.parse(dataAnimals.get("dateOfBirth")));
                    System.out.println("Данные о кошке внесены");
                    md.createFile("cats", cats.toString());
                    ui.showMenu(ui.animalsMenuCreate());
                }
                case 3 -> {
                    System.out.println("Введите данные Хомяка");
                    dataAnimals = ui.inputDataAnimals();
                    Hamsters hamsters = new Hamsters(
                            dataAnimals.get("nickname"),
                            dataAnimals.get("breed"),
                            LocalDate.parse(dataAnimals.get("dateOfBirth")));
                    System.out.println("Данные о хомяке внесены");
                    md.createFile("hamsters", hamsters.toString());
                    ui.showMenu(ui.animalsMenuCreate());
                }
                case 4 -> {
                    System.out.println("Введите данные Лошади");
                    dataAnimals = ui.inputDataAnimals();
                    Horses horses = new Horses(
                            dataAnimals.get("nickname"),
                            dataAnimals.get("breed"),
                            LocalDate.parse(dataAnimals.get("dateOfBirth")));
                    System.out.println("Данные о лошади внесены");
                    md.createFile("horses", horses.toString());
                    ui.showMenu(ui.animalsMenuCreate());
                }
                case 5 -> {
                    System.out.println("Введите данные Верблюда");
                    dataAnimals = ui.inputDataAnimals();
                    Camels camels = new Camels(
                            dataAnimals.get("nickname"),
                            dataAnimals.get("breed"),
                            LocalDate.parse(dataAnimals.get("dateOfBirth")));
                    System.out.println("Данные о верблюде внесены");
                    md.createFile("camels", camels.toString());
                    ui.showMenu(ui.animalsMenuCreate());
                }
                case 6 -> {
                    System.out.println("Введите данные Осла");
                    dataAnimals = ui.inputDataAnimals();
                    Donkeys donkeys = new Donkeys(
                            dataAnimals.get("nickname"),
                            dataAnimals.get("breed"),
                            LocalDate.parse(dataAnimals.get("dateOfBirth")));
                    System.out.println("Данные об осле внесены");
                    md.createFile("donkeys", donkeys.toString());
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
            switch (ui.inputUserMenu(ui.animalsMenu())) {
                case 1 -> {
                    System.out.println("Данные о Собаках");
                    md.readeFile("dogs");
                    ui.showMenu(ui.animalsMenu());
                }
                case 2 -> {
                    System.out.println("Данные о Кошках");
                    md.readeFile("cats");
                    ui.showMenu(ui.animalsMenu());
                }
                case 3 -> {
                    System.out.println("Данные о Хомяках");
                    md.readeFile("hamsters");
                    ui.showMenu(ui.animalsMenu());
                }
                case 4 -> {
                    System.out.println("Данные о Лошадях");
                    md.readeFile("horses");
                    ui.showMenu(ui.animalsMenu());
                }
                case 5 -> {
                    System.out.println("Данные о Верблюдах");
                    md.readeFile("camels");
                    ui.showMenu(ui.animalsMenu());
                }
                case 6 -> {
                    System.out.println("Данные о Ослах");
                    md.readeFile("donkeys");
                    ui.showMenu(ui.animalsMenu());
                }
                case 7 -> {
                    System.out.println("Данные о всех животных");
                    List<String> nameFile = new ArrayList<>();
                    nameFile.add("dogs");
                    nameFile.add("cats");
                    nameFile.add("hamsters");
                    nameFile.add("horses");
                    nameFile.add("camels");
                    nameFile.add("donkeys");
                    for (String name : nameFile) {
                        md.readeFileAll(name);
                    }
                    ui.showMenu(ui.animalsMenu());
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
