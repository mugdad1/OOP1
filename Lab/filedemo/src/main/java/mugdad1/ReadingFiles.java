package mugdad1;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingFiles {
    public static void main(String[] args) {
        // Read from example.txt in New Folder
        try (FileReader reader = new FileReader("New Folder/example.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
