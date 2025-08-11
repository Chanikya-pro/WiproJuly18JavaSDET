package labsession5;

public class Book {
	    private String title;
	    private String author;
	    private String isbn;
	    private boolean isAvailable;

	    public Book(String title, String author, String isbn) {
	        this.title = title;
	        this.author = author;
	        this.isbn = isbn;
	        this.isAvailable = true; // default as available
	    }

	    // Issue the book
	    public void issueBook() {
	        if (isAvailable) {
	            isAvailable = false;
	            System.out.println(title + " has been issued.");
	        } else {
	            System.out.println(title + " is already issued.");
	        }
	    }

	    // Return the book
	    public void returnBook() {
	        if (!isAvailable) {
	            isAvailable = true;
	            System.out.println(title + " has been returned.");
	        } else {
	            System.out.println(title + " was not issued.");
	        }
	    }

	    // Get book information
	    public void getBookInfo() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("ISBN: " + isbn);
	        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
	        System.out.println("---------------------------");
	    }
	}

