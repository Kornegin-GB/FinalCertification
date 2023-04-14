package ConstructAnimals;

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
        try (FileReader fileReader = new FileReader(name)) {
            fileReader.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
