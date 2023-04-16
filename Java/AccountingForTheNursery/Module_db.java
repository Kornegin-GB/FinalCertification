import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Module_db {
    public void createFile(String name, String[] data) {
        try (FileWriter fileWriter = new FileWriter(name + ".csv", true)) {
            fileWriter.write(data[0] + " " + data[1] + " " + data[2] + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public List<String[]> readeFile(String name) {
        List<String[]> entry = new ArrayList<>();
        if (!thereIsFile(name)) {
            String[] txt = new String[]{"Файл не существует"};
            entry.add(txt);
            return entry;
        }
        try (FileReader fileReader = new FileReader(name + ".csv")) {
            StringBuilder sb = new StringBuilder();
            int c;
            while ((c = fileReader.read()) != -1) {
                if (c == 10) {
                    entry.add(sb.toString().split(" "));
                    sb.delete(0, sb.length());
                } else {
                    sb.append((char) c);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return entry;
    }

    public boolean thereIsFile(String name) {
        File file = new File(name + ".csv");
        return file.isFile() && file.canRead();
    }
}
