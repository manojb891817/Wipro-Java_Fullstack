import java.io.File;

public class CheckFileOrFolder {
    public static void main(String[] args) {
        File my_file_dir = new File("C:\\Users\\admin\\IdeaProjects\\wipro_talent_next");

        if (!my_file_dir.exists()) {
            System.out.println("Path does not exist.");
        } else {
            if (my_file_dir.isDirectory()) {
                System.out.println(my_file_dir.getAbsolutePath() + " is a directory.");
            } else {
                System.out.println(my_file_dir.getAbsolutePath() + " is not a directory.");
            }

            if (my_file_dir.isFile()) {
                System.out.println(my_file_dir.getAbsolutePath() + " is a file.");
            } else {
                System.out.println(my_file_dir.getAbsolutePath() + " is not a file.");
            }
        }
    }
}
