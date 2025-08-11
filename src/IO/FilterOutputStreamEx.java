package IO;

import java.io.BufferedOutputStream;
import java.io.*;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

public class FilterOutputStreamEx {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		FilterOutputStream filterOut = null;
		try {
			// create file output stream for the file
			fos = new FileOutputStream("C://Users//vikram//I am attending the java training cl.txt");
			// wrap file input stream with buffered input stream
			filterOut = new BufferedOutputStream(fos);
			// write the data to the file
			String text = "Hi who are you";
			filterOut.write(text.getBytes());

	}catch(Exception e) {
		System.out.println(e);
	}finally {
		filterOut.close();
		fos.close();
	}
	}
}
