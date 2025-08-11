package IO.CharStreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderEx {

	public static void main(String[] args) throws IOException {
		// write to file using file writer
		
		FileWriter fw = new FileWriter("C://Users//vikram//I am attending the java training cl.txt");
		fw.write("I am the file writer");
		fw.close();
		// reading from file using file reader
		FileReader fr = new FileReader("C://Users//vikram//package lab_session.july_25.map;.txt");
		int i;
		while((i = fr.read()) != -1) {
			System.out.print((char) i);
			
		}
		fr.close();
	}

}
