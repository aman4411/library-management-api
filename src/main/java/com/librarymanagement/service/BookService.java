package com.librarymanagement.service;

import java.util.List;

import com.librarymanagement.model.Book;

public interface BookService {
	
	Book addBook(Book book);
	
	List<Book> getAllBooks();
}
