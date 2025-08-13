import java.io.File;
import java.io.IOException;

public class GetFileSize {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\manoj\\OneDrive\\Desktop\\sample.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created at: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists at: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
            return;
        }

        System.out.println("File size in bytes: " + file.length());
        System.out.println("File size in KB: " + ((double) file.length() / 1024));
        System.out.println("File size in MB: " + ((double) file.length() / (1024 * 1024)));
    }
}
