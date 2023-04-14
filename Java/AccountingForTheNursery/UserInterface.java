import java.time.LocalDate;
import java.util.*;

public class UserInterface {

    public void showMenu(List<String> menu) {
        int i = 0;
        for (String menuItem : menu) {
            i++;
            System.out.println(i + ") " + menuItem);
        }
    }

    public List<String> mainMenu() {
        List<String> mainMenu = new ArrayList<>();
        mainMenu.add("Создать запись");
        mainMenu.add("Прочитать записи");
        mainMenu.add("Редактировать записи");
        mainMenu.add("Выход");

        return mainMenu;
    }

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

    public Map<String, String> inputDataAnimals() {
        Map<String, String> dataAnimals = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Введите кличку: ");
        dataAnimals.put("nickname", input.nextLine());
        System.out.print("Введите породу: ");
        dataAnimals.put("breed", input.nextLine());
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
                dataAnimals.put("dateOfBirth", LocalDate.of(year, month, dey).toString());
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не цифру");
            }
            return dataAnimals;
        }
    }
}
