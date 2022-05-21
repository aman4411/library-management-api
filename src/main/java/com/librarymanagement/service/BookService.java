package com.librarymanagement.service;

import java.util.List;

import com.librarymanagement.model.Book;
import com.librarymanagement.model.User;

public interface BookService {
	
	Book addBook(Book book);
	
	List<Book> getAllBooks();
	
	User lendBookToUser(int userId, int isbn);
	
	Book findBookById(int isbn);
	
	List<Book> returnBook(int userId,int isbn);
}
