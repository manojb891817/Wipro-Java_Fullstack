import java.io.File;
import java.io.IOException;

public class FileAdded {
    public static void main(String[] args) {
        // Change the path to where you want the file created
        File file = new File("C:\\Users\\admin\\Desktop\\test.pdf");

        try {
            if (file.createNewFile()) {
                System.out.println("The file was created successfully.");
            } else {
                System.out.println("The file already exists.");
            }
            System.out.println("File path: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }
    }
}
