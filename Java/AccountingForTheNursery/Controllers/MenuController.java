package Controllers;

import Models.*;
import Views.UserMenu;

import java.time.LocalDate;

public class MenuController {
    UserMenu userMenu = new UserMenu();
    private String[] dateAnimals;

    public void controlMainMenu() {
        while (true) {
            userMenu.showMenu(userMenu.mainMenu(), "ГЛАВНОЕ МЕНЮ");
            int number = userMenu.selectingMenuNumber(userMenu.mainMenu());
            switch (number) {
                case 1 -> {
                    System.out.println("\nРаздел записи в справочник");
                    userMenu.showMenu(userMenu.animalMenu(), "МЕНЮ ВЫБОРА СПРАВОЧНИКА");
                    controlAnimalsMenu();
                }
                case 2 -> {
                    System.out.println("\nРаздел чтения справочника");
                    userMenu.showMenu(userMenu.animalMenu(), "МЕНЮ ВЫБОРА СПРАВОЧНИКА");
                    controlAnimalsMenu();
                }
                case 3 -> {
                    System.out.println("\nДанные обо всех животных");
                }
                case 4 -> {
                    System.out.println("\nРаздел добавления изученной команды");
                    userMenu.showMenu(userMenu.animalMenu(), "МЕНЮ ВЫБОРА СПРАВОЧНИКА");
                    controlAnimalsMenu();
                }
                case 5 -> {
                    System.out.println("\nЗавершение программы...");
                    return;
                }
                default -> System.out.println("Нет такого пункта меню\n");
            }
        }
    }

    public void controlAnimalsMenu() {
        while (true) {
            switch (userMenu.selectingMenuNumber(userMenu.animalMenu())) {
                case 1 -> {
                    String title = "dogs";
                    Dogs dogs = new Dogs();
                    dateAnimals = userMenu.enteringDataAnimal();
                    dogs.setName(dateAnimals[0]);
                    dogs.setBreed(dateAnimals[1]);
                    dogs.setDateOfBirth(LocalDate.parse(dateAnimals[2]));
                }
                case 2 -> {
                    String title = "cats";
                    Cats cats = new Cats();
                    dateAnimals = userMenu.enteringDataAnimal();
                    cats.setName(dateAnimals[0]);
                    cats.setBreed(dateAnimals[1]);
                    cats.setDateOfBirth(LocalDate.parse(dateAnimals[2]));
                }
                case 3 -> {
                    String title = "hamsters";
                    Hamsters hamsters = new Hamsters();
                    dateAnimals = userMenu.enteringDataAnimal();
                    hamsters.setName(dateAnimals[0]);
                    hamsters.setBreed(dateAnimals[1]);
                    hamsters.setDateOfBirth(LocalDate.parse(dateAnimals[2]));
                }
                case 4 -> {
                    String title = "horses";
                    Horses horses = new Horses();
                    dateAnimals = userMenu.enteringDataAnimal();
                    horses.setName(dateAnimals[0]);
                    horses.setBreed(dateAnimals[1]);
                    horses.setDateOfBirth(LocalDate.parse(dateAnimals[2]));
                }
                case 5 -> {
                    String title = "camels";
                    Camels camels = new Camels();
                    dateAnimals = userMenu.enteringDataAnimal();
                    camels.setName(dateAnimals[0]);
                    camels.setBreed(dateAnimals[1]);
                    camels.setDateOfBirth(LocalDate.parse(dateAnimals[2]));
                }
                case 6 -> {
                    String title = "donkeys";
                    Donkeys donkeys = new Donkeys();
                    dateAnimals = userMenu.enteringDataAnimal();
                    donkeys.setName(dateAnimals[0]);
                    donkeys.setBreed(dateAnimals[1]);
                    if (dateAnimals != null) {
                        donkeys.setDateOfBirth(LocalDate.parse(dateAnimals[2]));
                    }
                }
                default -> userMenu.showMenu(userMenu.mainMenu(), "ГЛАВНОЕ МЕНЮ");
            }
        }
    }
}
