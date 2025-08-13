
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFileByteArray {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\manoj\\OneDrive\\Desktop\\sample.txt";

        try (InputStream fins = new FileInputStream(fileName)) {
            byte[] fileContent = new byte[2 * 1024]; // 2KB buffer
            int readCount;

            while ((readCount = fins.read(fileContent)) > 0) {
                System.out.print(new String(fileContent, 0, readCount));
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
