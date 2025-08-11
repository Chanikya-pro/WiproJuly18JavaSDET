package IO;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
public class FilterInputStreamEx {

	public static void main(String[] args) {
		// filter streams filter data as they read and write data
		// filters it and pass to on to the underlying streams
		
		FileInputStream fis = null;
		BufferedInputStream filterinput = null;
		try {
			// create file input stream for the file
			fis = new FileInputStream("C://Users//vikram//I am attending the java training cl.txt");
			// wrap file input stream with buffered input stream
			filterinput = new BufferedInputStream(fis);
			// read and print the file content
			int data;
			while((data = filterinput.read()) != -1) {
				System.out.print((char)data);
			}
			fis.close();
			

	}catch(Exception e) {
		System.out.println(e);
	}
	}
}
