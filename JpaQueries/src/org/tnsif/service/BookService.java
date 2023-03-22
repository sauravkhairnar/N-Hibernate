package org.tnsif.service;


import java.util.List;

import org.tnsif.entity.Book;


public interface BookService {
	

	//Abstract Method
		
	List<Book>getAllBook();
	List<Book>getBooksAuthor(String author);
	List<Book>getPrice(Float low, Float high);
	
	Book getBookByIds(Integer id);
	
	Long getBookCount();

}
