import java.io.File;

public class ReadAndWrite {
    public static void main(String[] args) {
        // Change the path to match your actual system
        File myFile = new File("C:\\Users\\manoj\\OneDrive\\Desktop\\sample.txt");

        try {
            // Create the file if it does not exist
            if (!myFile.exists()) {
                myFile.createNewFile();
                System.out.println("File created at: " + myFile.getAbsolutePath());
            }

            // Check write permission
            if (myFile.canWrite()) {
                System.out.println(myFile.getAbsolutePath() + " can write.");
            } else {
                System.out.println(myFile.getAbsolutePath() + " cannot write.");
            }

            // Check read permission
            if (myFile.canRead()) {
                System.out.println(myFile.getAbsolutePath() + " can read.");
            } else {
                System.out.println(myFile.getAbsolutePath() + " cannot read.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
