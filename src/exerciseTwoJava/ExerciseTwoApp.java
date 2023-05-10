package exerciseTwoJava;

import java.util.ArrayList;
import java.util.List;

public class ExerciseTwoApp {

	public static void main(String[] args) {
		
		//In the main method, create an ArrayList of Book objects. 
		
		List<BookClass>bookList = new ArrayList<>();
		
		//Add at least three books to the ArrayList 
		
		BookClass fictionBook = new BookClass("My Favorite Idiot", "John Jay Jones", 2002);
		BookClass childrensBook = new BookClass("Wheels", "SJ Wonder", 1999);
		BookClass technologyBook = new BookClass("The Secret Life of A Connection String", "Microsoft Dev", 2016);
		
		bookList.add(childrensBook);
		bookList.add(fictionBook);
		bookList.add(technologyBook);
		
		//print the details of each book using the toString() method.
		for(BookClass book : bookList) {
			
			System.out.println(book.toString());
		}
	}

}
