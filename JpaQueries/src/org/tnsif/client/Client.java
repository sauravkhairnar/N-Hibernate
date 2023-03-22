package org.tnsif.client;

import org.tnsif.service.BookService;
import org.tnsif.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		BookService service= new BookServiceImpl();
		
		System.out.println("Total No. of Book:"+service.getBookCount());
		
		//To return all the books 
		System.out.println("All Books"+service.getAllBook());
		
		//To Specific ids the books 
		System.out.println("Books with Specific Ids"+service.getBookByIds(3));

		
		//Price Range 
		System.out.println("Price Range between 300 To 600"+service.getPrice(300.00f, 600.00f));
	
		//Author Name
		System.out.println("Book WIth Specific Author"+service.getBooksAuthor(" The_Vaibhav...?"));
		
		//to return all the books
		
		System.out.println("All Books "+service.getAllBook());
	}
	
	

}
