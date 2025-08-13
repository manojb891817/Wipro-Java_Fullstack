import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandeling {
    public static void main(String[] args) {
        File file = new File("sample.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created at: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists at: " + file.getAbsolutePath());
            }

            // Write content
            try (FileWriter writer = new FileWriter(file)) {
                writer.write("Hello everyone, I hope you all are good.\n");
                writer.write("Have your food and bunk the class today in the afternoon.");
            }

            
            try (FileReader reader = new FileReader(file)) {
                int c;
                while ((c = reader.read()) != -1) {
                    System.out.print((char) c);
                }
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
