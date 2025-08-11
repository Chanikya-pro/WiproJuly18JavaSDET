package labsession9;
import java.io.File;

public class ListFilesExample {
    public static void main(String[] args) {
        File folder = new File("C://Users//vikram//Documents"); // change the path as needed

        String[] files = folder.list();

        if (files != null) {
            for (String name : files) {
                System.out.println(name);
            }
        } else {
            System.out.println("Folder not found or empty.");
        }
    }
}


