import java.io.File;
import java.io.FilenameFilter;

public class EndsWithExtension {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\admin\\PycharmProjects\\MyWeb");

        String[] list = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File directory, String name) {
                return name.toLowerCase().endsWith(".py");
            }
        });

        if (list != null) {
            for (String fileName : list) {
                System.out.println(fileName);
            }
        } else {
            System.out.println("Directory not found or not accessible.");
        }
    }
}
