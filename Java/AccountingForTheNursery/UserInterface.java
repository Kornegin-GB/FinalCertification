import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

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

    public void inputDataAnimals() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите кличку: ");
            String nickname = input.nextLine();
            System.out.print("Введите породу: ");
            String breed = input.nextLine();
            while (true) {
                System.out.print("Введите дату рождения в формате(год-месяц-день): ");
                String date = input.nextLine();

            }
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не цифру");
        }
    }
}
