package mugdad1;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        // Create a folder
        File folder = new File("New Folder");
        if (folder.mkdir()) {
            System.out.println("Folder created: " + folder.getAbsolutePath());
        } else {
            System.out.println("Folder already exists or failed to create.");
        }

        // Create a text file inside the folder
        try {
            File file = new File(folder, "example.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Check if the file exists
        File checkFile = new File(folder, "example.txt");
        System.out.println("File exists: " + checkFile.exists());
        System.out.println("Can read: " + checkFile.canRead());
        System.out.println("Can write: " + checkFile.canWrite());
        System.out.println("Absolute path: " + checkFile.getAbsolutePath());
    }
}
