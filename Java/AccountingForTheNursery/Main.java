public class Main {
    UserInterface ui = new UserInterface();

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
                    ui.inputDataAnimals();
                }
                case 2 -> {
                    System.out.println("Введите данные Кошки");
                }
                case 3 -> {
                    System.out.println("Введите данные Хомяка");
                }
                case 4 -> {
                    System.out.println("Введите данные Лошади");
                }
                case 5 -> {
                    System.out.println("Введите данные Верблюда");
                }
                case 6 -> {
                    System.out.println("Введите данные Осла");
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
                    System.out.println();
                    System.out.println(1);
                }
                case 2 -> System.out.println(2);
                case 3 -> System.out.println(3);
                case 4 -> System.out.println(4);
                case 5 -> System.out.println(5);
                case 6 -> System.out.println(6);
                case 7 -> System.out.println(7);
                case 8 -> {
                    System.out.println(8);
                    ui.showMenu(ui.mainMenu());
                    return;
                }
                default -> System.out.println("Вы выбрали не правильный пункт меню");
            }
        }
    }
}
