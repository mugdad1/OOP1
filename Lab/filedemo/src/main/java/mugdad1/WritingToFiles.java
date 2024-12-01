package mugdad1;

import java.io.FileWriter;
import java.io.IOException;

public class WritingToFiles {
    public static void main(String[] args) {
        // Write to OutputFile.txt
        try (FileWriter writer = new FileWriter("New Folder/example.txt")) {
            writer.write("hi guys");
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
