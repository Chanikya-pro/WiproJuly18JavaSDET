package IO.CharStreams;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.*;
public class DeserializationEg {

	public static void main(String[] args) throws ClassNotFoundException, IOException{  // mam written file not foundexception i wrote class
		//create the stream and read the object
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C://Users//vikram//I am attending the java training cl.txt//"));
        Student s = (Student)in.readObject();
        //printing the object details
        System.out.println(s.id + " "+ s.name);
        in.close();
	}

}
