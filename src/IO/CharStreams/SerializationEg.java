package IO.CharStreams;

import java.io.ObjectOutputStream;
import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;

public class SerializationEg {

	public static void main(String[] args) throws IOException {
		// serialization is  a process of converting objects into bytes
		// write object()
        // creating the Object()
	try {
		Student s1 = new Student (211, "John");
		// creating the output stream writing the object
		FileOutputStream fout = new FileOutputStream("C://Users//vikram//I am attending the java training cl.txt//");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(s1);
        out.flush();
        // closing the stream
        fout.close();
        out.close();
        System.out.println("object is serialized");
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}
}
