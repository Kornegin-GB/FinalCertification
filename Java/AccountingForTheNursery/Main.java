import java.util.ArrayList;
import java.util.List;

public class Main {
    UserInterface ui = new UserInterface();
    Module_db md = new Module_db();
    /**
     * Массив данных о животном
     * (dataAnimals[0] - nickname, dataAnimals[1] - breed, dataAnimals[2] - dateOfBirth)
     */
    private String[] dataAnimals;

    public static void main(String[] args) {
        Main main = new Main();
        main.runMainMenu();
    }

    /**
     * Обработка главного меню
     */
    public void runMainMenu() {
        ui.showMenu(ui.mainMenu());
        while (true) {
            int numberMenu = ui.inputUserMenu(ui.mainMenu());
            switch (numberMenu) {
                case 1 -> {
                    System.out.println("\nВыберите раздел для создания");
                    runCreateAnimalsMenu();
                }
                case 2 -> {
                    System.out.println("\nВыберите раздел для чтения");
                    runAnimalsMenu(numberMenu);
                }
                case 3 -> {
                    System.out.println("\nВыберите раздел для добавления команды");
                    runAnimalsMenu(numberMenu);
                }
                case 4 -> {
                    System.out.println("Завершение программы...");
                    return;
                }
                default -> System.out.println("Вы выбрали не правильный пункт меню");
            }
        }
    }

    /**
     * Метод обработки записи данных в справочник
     */
    public void runCreateAnimalsMenu() {
        while (true) {
            ui.showMenu(ui.animalsMenuCreate());
            switch (ui.inputUserMenu(ui.animalsMenuCreate())) {
                case 1 -> {
                    String name = "dogs";
                    System.out.println("Введите данные о собаке");
                    dataAnimals = ui.inputDataAnimals();
                    System.out.println("Данные о собаке внесены");
                    md.createFile(name, dataAnimals);
                }
                case 2 -> {
                    String name = "cats";
                    System.out.println("Введите данные о кошке");
                    dataAnimals = ui.inputDataAnimals();
                    System.out.println("Данные о кошке внесены");
                    md.createFile(name, dataAnimals);
                }
                case 3 -> {
                    String name = "hamsters";
                    System.out.println("Введите данные о хомяке");
                    dataAnimals = ui.inputDataAnimals();
                    System.out.println("Данные о хомяке внесены");
                    md.createFile(name, dataAnimals);
                }
                case 4 -> {
                    String name = "horses";
                    System.out.println("Введите данные о лошади");
                    dataAnimals = ui.inputDataAnimals();
                    System.out.println("Данные о лошади внесены");
                    md.createFile(name, dataAnimals);
                }
                case 5 -> {
                    String name = "camels";
                    System.out.println("Введите данные о верблюде");
                    dataAnimals = ui.inputDataAnimals();
                    System.out.println("Данные о верблюде внесены");
                    md.createFile(name, dataAnimals);
                }
                case 6 -> {
                    String name = "donkeys";
                    System.out.println("Введите данные об осле");
                    dataAnimals = ui.inputDataAnimals();
                    System.out.println("Данные об осле внесены");
                    md.createFile(name, dataAnimals);
                }
                case 7 -> {
                    ui.showMenu(ui.mainMenu());
                    return;
                }
                default -> System.out.println("Вы выбрали не правильный пункт меню");
            }
        }
    }

    public void runAnimalsMenu(int numberMenu) {
        ui.showMenu(ui.animalsMenu());
        while (true) {
            switch (ui.inputUserMenu(ui.animalsMenu())) {
                case 1 -> {
                    String name = "dogs";
                    System.out.println("Данные о Собаках\n");
                    if (numberMenu == 3 && md.thereIsFile(name)) {
                        //TODO: Реализовать внесение изученных команд
                    } else {
                        ui.outputContentsDirectory(md.readeFile(name));
                        System.out.println();
                        ui.showMenu(ui.animalsMenu());
                    }
                }
                case 2 -> {
                    System.out.println("Данные о Кошках\n");
                    String name = "cats";
                    if (numberMenu == 3 && md.thereIsFile(name)) {
                        //TODO: Реализовать внесение изученных команд
                    } else {
                        ui.outputContentsDirectory(md.readeFile(name));
                        System.out.println();
                        ui.showMenu(ui.animalsMenu());
                    }
                }
                case 3 -> {
                    System.out.println("Данные о Хомяках\n");
                    String name = "hamsters";
                    if (numberMenu == 3 && md.thereIsFile(name)) {
                        //TODO: Реализовать внесение изученных команд
                    } else {
                        ui.outputContentsDirectory(md.readeFile(name));
                        System.out.println();
                        ui.showMenu(ui.animalsMenu());
                    }
                }
                case 4 -> {
                    System.out.println("Данные о Лошадях\n");
                    String name = "horses";
                    if (numberMenu == 3 && md.thereIsFile(name)) {
                        //TODO: Реализовать внесение изученных команд
                    } else {
                        ui.outputContentsDirectory(md.readeFile(name));
                        System.out.println();
                        ui.showMenu(ui.animalsMenu());
                    }
                }
                case 5 -> {
                    System.out.println("Данные о Верблюдах\n");
                    String name = "camels";
                    if (numberMenu == 3 && md.thereIsFile(name)) {
                        //TODO: Реализовать внесение изученных команд
                    } else {
                        ui.outputContentsDirectory(md.readeFile(name));
                        System.out.println();
                        ui.showMenu(ui.animalsMenu());
                    }
                }
                case 6 -> {
                    System.out.println("Данные о Ослах\n");
                    String name = "donkeys";
                    if (numberMenu == 3 && md.thereIsFile(name)) {
                        //TODO: Реализовать внесение изученных команд
                    } else {
                        ui.outputContentsDirectory(md.readeFile(name));
                        System.out.println();
                        ui.showMenu(ui.animalsMenu());
                    }
                }
                case 7 -> {
                    System.out.println("Данные о всех животных\n");
                    List<String> nameFile = new ArrayList<>();
                    nameFile.add("dogs");
                    nameFile.add("cats");
                    nameFile.add("hamsters");
                    nameFile.add("horses");
                    nameFile.add("camels");
                    nameFile.add("donkeys");
                    for (String name : nameFile) {
                        ui.outputContentsDirectory(md.readeFile(name));
                    }
                    System.out.println();
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
