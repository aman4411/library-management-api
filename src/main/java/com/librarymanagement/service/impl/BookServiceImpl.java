package com.librarymanagement.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.librarymanagement.exception.ResourceNotFoundException;
import com.librarymanagement.model.Book;
import com.librarymanagement.model.User;
import com.librarymanagement.repository.BookRepository;
import com.librarymanagement.service.BookService;
import com.librarymanagement.service.UserService;

@Service
public class BookServiceImpl implements BookService {

	private BookRepository bookRepository;
	private UserService userService;

	public BookServiceImpl(BookRepository bookRepository,UserService userService) {
		super();
		this.bookRepository = bookRepository;
		this.userService = userService;
	}

	@Override
	public Book addBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public User lendBookToUser(int userId, int isbn) {
		User user = userService.findUserById(userId);
		Book book = findBookById(isbn);
		if(book.getStatus().equals("available")) {
			if((user.getBook1issue() == null || user.getBook1issue().isEmpty())) {
				//book1 slot empty
				user.setBook1issue(String.valueOf(isbn));
			}else if((user.getBook2issue() == null || user.getBook2issue().isEmpty())) {
				//book2 slot is empty
				user.setBook2issue(String.valueOf(isbn));
			}else {
				//both slots fill
				return null;
			}
			//update book & user in db
			book.setBorrower(userId);
			book.setStatus("unavailable");
			book.setBorrowDate(new Date());
			bookRepository.save(book);
			User updatedUser = userService.addUser(user);
			return updatedUser;
			
		}else {
			return null;
		}
	}

	@Override
	public Book findBookById(int isbn) {
		return bookRepository.findById(isbn).orElseThrow(() ->
		           new ResourceNotFoundException("Book","Id",isbn));
	}

}
