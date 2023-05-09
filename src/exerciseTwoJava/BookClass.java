package exerciseTwoJava;

public class BookClass {
	//The class should have three private instance variables: 
	//title (String), author (String), and publicationYear (int).
	private String title;
	private String author;
	private int publicationYear;
	
//Create a constructor that accepts the title, author, 
//and publication year as parameters.
	public BookClass(String title, String author, int publicationYear) {
		super();
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
	}
	//Implement getter and setter methods for each instance variable
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	//Implement a toString() method that returns a formatted string 
	//with the book's title, author, and publication year.
	
	@Override
	public String toString() {
		return "BookClass [title=" + title + ", author=" + author + ", publicationYear=" + publicationYear + "]";
	}
	
	
}
