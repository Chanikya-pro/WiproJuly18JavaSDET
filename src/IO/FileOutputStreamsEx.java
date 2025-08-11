package IO;
import java.io.FileOutputStream;
import java.util.*;
public class FileOutputStreamsEx {

	public static void main(String[] args) {
		String data = "I am attending the java training class";
		try {
			FileOutputStream ouput = new FileOutputStream("C://Users//vikram//I am attending the java training cl.txt//");
			byte[] array = data.getBytes();
			
			// write the byte array to the file
			output.write(array);
			output.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
