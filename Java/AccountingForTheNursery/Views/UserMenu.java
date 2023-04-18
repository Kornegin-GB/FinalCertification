package Views;

import Models.PackAnimals;
import Models.Pets;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UserMenu {
    Pets pets;
    PackAnimals packAnimals;

    public void showMenu(List<String> displayedMenu, String nameMenu) {
        System.out.println("\n" + nameMenu);
        for (int i = 0; i < displayedMenu.size(); i++) {
            System.out.println(i + 1 + ") " + displayedMenu.get(i));
        }
        System.out.println();
    }

    public int selectingMenuNumber(List<String> processedMenu) {
        int numberMenu = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Выберите пункт меню: ");
            numberMenu = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число\n");
            return 0;
        }
        return numberMenu;
    }

    public List<String> mainMenu() {
        List<String> menu = new ArrayList<>();
        menu.add("Внести запись о животном");
        menu.add("Прочитать записи о животных");
        menu.add("Прочитать записи о всех животных");
        menu.add("Добавить изученную команду животному");
        menu.add("Завершить работу");
        return menu;
    }

    public List<String> animalMenu() {
        List<String> menu = new ArrayList<>();
        menu.add("Собака");
        menu.add("Кошка");
        menu.add("Хомяк");
        menu.add("Лошадь");
        menu.add("Верблюд");
        menu.add("Осёл");
        menu.add("НАЗАД");
        return menu;
    }

    public String[] enteringDataAnimal() {
        String[] dataAnimals = new String[3];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кличку: ");
        dataAnimals[0] = scanner.nextLine();
        System.out.print("Введите породу: ");
        dataAnimals[1] = scanner.nextLine();
        int year = 0;
        int month = 0;
        int dey = 0;
        while (true) {
            try {
                System.out.print("Введите год рождения: ");
                year = Integer.parseInt(scanner.nextLine());
                System.out.print("Введите месяц рождения: ");
                month = Integer.parseInt(scanner.nextLine());
                System.out.print("Введите день рождения: ");
                dey = Integer.parseInt(scanner.nextLine());
                dataAnimals[2] = LocalDate.of(year, month, dey).toString();
                System.out.println(dataAnimals[2]);
                return dataAnimals;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не цифру");
            }
        }
    }
}