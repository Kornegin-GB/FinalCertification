import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Modul_db {
    public void createFile(String name, String data) {
        try (FileWriter fileWriter = new FileWriter(name + ".csv", true)) {
            fileWriter.write(data + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void readeFile(String name) {
        File file = new File(name + ".csv");
        if (!file.isFile() && !file.canRead()) {
            System.out.println("Файл не существует");
            return;
        }
        try (FileReader fileReader = new FileReader(name + ".csv")) {
            int c;

            while ((c = fileReader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readeFileAll(String name) {
        File file = new File(name + ".csv");
        if (!file.isFile() && !file.canRead()) {
            //System.out.println("Файл не существует");
            return;
        }
        try (FileReader fileReader = new FileReader(name + ".csv")) {
            int c;

            while ((c = fileReader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
