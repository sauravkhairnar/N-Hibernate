package org.tnsif.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.tnsif.entity.Book;

public class BookDaoImpl implements BookDao {
	
	private EntityManager em;
	

	public BookDaoImpl() {
		
		em=JPAUtil.getEntityManager();
		
		
	}
	
	//To Retrieve The All Books 

	@Override
	public List<Book> getAllBook() {
		Query query=em.createNamedQuery("Get All Books");
		@SuppressWarnings("unchecked")
		List<Book>book=query.getResultList();
		return book;
		
	}

	//to Retrieve a list of book with Specific Author
	@Override
	public List<Book> getBooks(String author) {
		
		String qStr= "SELECT book FROM Book WHERE book.author=:pAuthor";
		TypedQuery<Book>query=em.createQuery(qStr, Book.class);
		query.setParameter("pAuthor", author);
		List<Book>book=query.getResultList();
		return book;
	}

	//To Retrieve a book with specific range
	@Override
	public List<Book> getPriceRange(Float low, Float high) {
		String qStr="SELECT book FROM Book book WHERE book.price betewwn : plow and phigh";
		TypedQuery<Book>query=em.createQuery(qStr, Book.class);
		query.setParameter("pAuthor", low);
		query.setParameter("pAuthor", high);
		List<Book>book=query.getResultList();
		return book;
	}

	//To Retrieve a Book with Specific id
	@Override
	public Book getBookId(Integer id) {
		Book book=em.find(Book.class, id);
		return book;
	}

	@Override
	public Long getBookCount() {
	String qStr="SELECT COUNT(book.id)  FROM Book book";	
	@SuppressWarnings("unused")
	TypedQuery<Long>query=em.createNamedQuery(qStr, Long.class);
	Long count= query.getSingleResult();
	return count;
	}

}
