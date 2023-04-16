import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Класс взаимодействия с пользователем
 */
public class UserInterface {
    /**
     * Вывод в консоль пунктов меню
     */
    public void showMenu(List<String> menu) {
        int i = 0;
        for (String menuItem : menu) {
            i++;
            System.out.println(i + ") " + menuItem);
        }
    }

    /**
     * Список главного меню
     */
    public List<String> mainMenu() {
        List<String> mainMenu = new ArrayList<>();
        mainMenu.add("Создать запись");
        mainMenu.add("Прочитать записи");
        mainMenu.add("Выполняемые команды");
        mainMenu.add("Выход");

        return mainMenu;
    }

    /**
     * Список каталогов при внесении в базу
     */
    public List<String> animalsMenuCreate() {
        List<String> animalsMenu = new ArrayList<>();
        animalsMenu.add("Собаки");
        animalsMenu.add("Кошки");
        animalsMenu.add("Хомяки");
        animalsMenu.add("Лошади");
        animalsMenu.add("Верблюды");
        animalsMenu.add("Ослы");
        animalsMenu.add("НАЗАД");
        return animalsMenu;
    }

    /**
     * Вывод каталогов при всех остальных пунктах главного меню
     */
    public List<String> animalsMenu() {
        List<String> animalsMenu = new ArrayList<>();
        animalsMenu.add("Собаки");
        animalsMenu.add("Кошки");
        animalsMenu.add("Хомяки");
        animalsMenu.add("Лошади");
        animalsMenu.add("Верблюды");
        animalsMenu.add("Ослы");
        animalsMenu.add("Все разделы");
        animalsMenu.add("НАЗАД");
        return animalsMenu;
    }

    /**
     * Метод обработки выбора пунктов меню
     */
    public int inputUserMenu(List<String> menu) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите пункт меню: ");
            int number = input.nextInt();
            if (number >= 1 && number <= menu.size()) {
                return number;
            }
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не цифру");
        }
        return 0;
    }

    /**
     * Метод обработки ввода данных в базу
     */
    public String[] inputDataAnimals() {
        String[] dataAnimals = new String[3];
        Scanner input = new Scanner(System.in);
        System.out.print("Введите кличку: ");
        dataAnimals[0] = input.nextLine();
        System.out.print("Введите породу: ");
        dataAnimals[1] = input.nextLine();
        int dey = 0;
        int month = 0;
        int year = 0;
        while (true) {
            try {
                System.out.print("Введите день рождения: ");
                dey = input.nextInt();
                System.out.print("Введите месяц рождения: ");
                month = input.nextInt();
                System.out.print("Введите год рождения: ");
                year = input.nextInt();
                dataAnimals[2] = LocalDate.of(year, month, dey).toString();
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не цифру");
            }
            return dataAnimals;
        }
    }

    /**
     * Метод вывода содержимого справочника в консоль
     */
    public void outputContentsDirectory(List<String[]> dataDirectory) {
        for (String[] line : dataDirectory) {
            if (line.length == 3) {
                System.out.println(line[0] + " " + line[1] + " " + line[2]);
            }
        }
    }
}
