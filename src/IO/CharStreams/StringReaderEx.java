package IO.CharStreams;

import java.io.StringReader;
import java.io.IOException;

public class StringReaderEx {
	public static void main(String[] args) throws IOException {
		  String data = "Hello World";

		  try {
		       StringReader reader = new StringReader(data);

		       int ch;
		       while ((ch = reader.read()) != -1) {
		            System.out.print((char) ch); 
		       }

		        reader.close(); 
		     } catch (IOException e) {
		           System.out.println(e);
		        }
	}
}
