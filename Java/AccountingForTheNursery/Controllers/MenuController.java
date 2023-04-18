package Controllers;

import Views.UserInterface;

import java.util.ArrayList;
import java.util.List;

public class MenuController {
    UserInterface userInterface = new UserInterface();
    ControlAnimalsCreate controlAnimalsCreate = new ControlAnimalsCreate();
    DataBase dataBase = new DataBase();

    public void controlMainMenu() {
        while (true) {
            userInterface.showMenu(userInterface.mainMenu(), "ГЛАВНОЕ МЕНЮ");
            int number = userInterface.selectingMenuNumber();
            switch (number) {
                case 1 -> {
                    System.out.println("\nРаздел записи в справочник");
                    controlAnimalsMenu(number);
                }
                case 2 -> {
                    System.out.println("\nРаздел чтения справочника");
                    controlAnimalsMenu(number);
                }
                case 3 -> {
                    System.out.println("\nДанные обо всех животных");
                    System.out.println("\nЗАПИСИ ВСЕХ СПРАВОЧНИКОВ");
                    List<String[]> listDirectory = new ArrayList<>();
                    for (String name : userInterface.createListAnimals()) {
                        listDirectory.addAll(dataBase.fileReading(name));
                    }
                    userInterface.showEntryAll(listDirectory);
                }
                case 4 -> {
                    System.out.println("\nРаздел добавления изученной команды");
                    controlAnimalsMenu(number);
                }
                case 5 -> {
                    System.out.println("\nЗавершение программы...");
                    return;
                }
                default -> System.out.println("Нет такого пункта меню\n");
            }
        }
    }

    public void controlAnimalsMenu(int numberMainMenu) {
        while (true) {
            userInterface.showMenu(userInterface.animalMenu(), "МЕНЮ ВЫБОРА СПРАВОЧНИКА");
            int numberMenuAnimals = userInterface.selectingMenuNumber();
            switch (numberMenuAnimals) {
                case 1 -> {
                    String title = "dogs";
                    if (numberMainMenu == 1) {
                        controlAnimalsCreate.createRecordsAnimals(numberMenuAnimals, title);
                    } else if (numberMainMenu == 2) {
                        userInterface.showEntry(dataBase.fileReading(title), title);
                    } else if (numberMainMenu == 4) {
                        //TODO: Реализовать раздел
                    }
                }
                case 2 -> {
                    String title = "cats";
                    if (numberMainMenu == 1) {
                        controlAnimalsCreate.createRecordsAnimals(numberMenuAnimals, title);
                    } else if (numberMainMenu == 2) {
                        userInterface.showEntry(dataBase.fileReading(title), title);
                    } else if (numberMainMenu == 4) {
                        //TODO: Реализовать раздел
                    }
                }
                case 3 -> {
                    String title = "hamsters";
                    if (numberMainMenu == 1) {
                        controlAnimalsCreate.createRecordsAnimals(numberMenuAnimals, title);
                    } else if (numberMainMenu == 2) {
                        userInterface.showEntry(dataBase.fileReading(title), title);
                    } else if (numberMainMenu == 4) {
                        //TODO: Реализовать раздел
                    }
                }
                case 4 -> {
                    String title = "horses";
                    if (numberMainMenu == 1) {
                        controlAnimalsCreate.createRecordsAnimals(numberMenuAnimals, title);
                    } else if (numberMainMenu == 2) {
                        userInterface.showEntry(dataBase.fileReading(title), title);
                    } else if (numberMainMenu == 4) {
                        //TODO: Реализовать раздел
                    }
                }
                case 5 -> {
                    String title = "camels";
                    if (numberMainMenu == 1) {
                        controlAnimalsCreate.createRecordsAnimals(numberMenuAnimals, title);
                    } else if (numberMainMenu == 2) {
                        userInterface.showEntry(dataBase.fileReading(title), title);
                    } else if (numberMainMenu == 4) {
                        //TODO: Реализовать раздел
                    }
                }
                case 6 -> {
                    String title = "donkeys";
                    if (numberMainMenu == 1) {
                        controlAnimalsCreate.createRecordsAnimals(numberMenuAnimals, title);
                    } else if (numberMainMenu == 2) {
                        userInterface.showEntry(dataBase.fileReading(title), title);
                    } else if (numberMainMenu == 4) {
                        //TODO: Реализовать раздел
                    }
                }
                case 7 -> {
                    return;
                }
                default -> System.out.println("Нет такого пункта меню\n");
            }
        }
    }
}
