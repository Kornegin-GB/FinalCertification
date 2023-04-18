package Views;

import Models.PackAnimals;
import Models.Pets;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    Pets pets;
    PackAnimals packAnimals;

    public void showMenu(List<String> displayedMenu, String nameMenu) {
        System.out.println("\n" + nameMenu);
        for (int i = 0; i < displayedMenu.size(); i++) {
            System.out.println(i + 1 + ") " + displayedMenu.get(i));
        }
        System.out.println();
    }

    public int selectingMenuNumber() {
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
                if (year > LocalDate.now().getYear()) {
                    System.out.println("Вы ввели год больше текущего");
                    throw new NumberFormatException();
                }
                System.out.print("Введите месяц рождения: ");
                month = Integer.parseInt(scanner.nextLine());

                if (!(month >= 1 && month <= 12)) {
                    System.out.println("Вы ввели месяц больше или меньше, чем месяцев в году");
                    throw new NumberFormatException();
                }
                System.out.print("Введите день рождения: ");
                dey = Integer.parseInt(scanner.nextLine());
                int deys = YearMonth.of(year, month).lengthOfMonth();
                if (!(dey >= 1 && dey <= deys)) {
                    System.out.println("Вы ввели количество дней больше или меньше, чем дней в месяце");
                    throw new NumberFormatException();
                }
                dataAnimals[2] = LocalDate.of(year, month, dey).toString();
                return dataAnimals;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не корректные данные");
            }
        }
    }

    public void showEntry(List<String[]> data, String title) {
        String name = "";
        int i = 1;
        switch (title) {
            case "dogs" -> name = "СОБАКИ";
            case "cats" -> name = "КОШКИ";
            case "hamsters" -> name = "ХОМЯКИ";
            case "horses" -> name = "ЛОШАДИ";
            case "camels" -> name = "ВЕРБЛЮДЫ";
            case "donkeys" -> name = "ОСЛЫ";
        }
        System.out.println("\nЗАПИСИ СПРАВОЧНИКА " + name);
        for (String[] entry : data) {
            if (entry.length == 3) {
                System.out.println(i + ") Кличка: " + entry[0] + ", Порода: " + entry[1] + ", Дата рождения: " + entry[2]);
                i++;
            }
        }
    }

    public void showEntryAll(List<String[]> data) {
        int i = 1;
        for (String[] entry : data) {
            if (entry.length == 3) {
                System.out.println(i + ") Кличка: " + entry[0] + ", Порода: " + entry[1] + ", Дата рождения: " + entry[2]);
                i++;
            }
        }
    }

    public List<String> createListAnimals() {
        List<String> listAnimal = new ArrayList<>();
        listAnimal.add("dogs");
        listAnimal.add("cats");
        listAnimal.add("hamsters");
        listAnimal.add("horses");
        listAnimal.add("camels");
        listAnimal.add("donkeys");
        return listAnimal;
    }
}