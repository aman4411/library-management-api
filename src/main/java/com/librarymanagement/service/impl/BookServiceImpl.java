package com.librarymanagement.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.librarymanagement.model.Book;
import com.librarymanagement.repository.BookRepository;
import com.librarymanagement.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	private BookRepository bookRepository;

	public BookServiceImpl(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	@Override
	public Book addBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

}
