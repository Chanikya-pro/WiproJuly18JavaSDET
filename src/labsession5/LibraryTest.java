package labsession5;

public class LibraryTest {

	public static void main(String[] args) {
		 Book book1 = new Book("Java Basics", "James Gosling", "12345");
	     Book book2 = new Book("Python for All", "Guido van Rossum", "67890");

	     book1.getBookInfo();
	     book2.getBookInfo();

	     book1.issueBook();  // Issue Java Basics
	     book1.issueBook();  // Try to re-issue

	     book1.returnBook(); // Return the book
	     book1.returnBook(); // Try to return again

	     book1.getBookInfo(); // Final status
	}
}


