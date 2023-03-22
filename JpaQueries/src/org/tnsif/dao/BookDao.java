package org.tnsif.dao;

import java.util.List;

import org.tnsif.entity.Book;

//Interface 
public interface BookDao {
	
	//Abstract Method
		
	List<Book>getAllBook();
	List<Book>getBooks(String author);
	List<Book>getPriceRange(Float low, Float high);
	
	Book getBookId(Integer id);
	
	Long getBookCount();
}	
