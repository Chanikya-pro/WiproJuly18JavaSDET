package labsession9;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileToByteArray {
    public static void main(String[] args) {
        File file = new File("C://Users//vikram//I am attending the java training cl.txt//"); // change to your file path

        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] byteArray = new byte[(int) file.length()];
            fis.read(byteArray);
            fis.close();

            System.out.println("File content in bytes:");
            for (byte b : byteArray) {
                System.out.print(b + " ");
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
