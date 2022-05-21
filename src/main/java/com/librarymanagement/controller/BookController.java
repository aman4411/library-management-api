package com.librarymanagement.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.librarymanagement.model.Book;
import com.librarymanagement.model.User;
import com.librarymanagement.service.BookService;
import com.librarymanagement.service.UserService;

@RestController
@RequestMapping("/api")
public class BookController {

	private BookService bookService;

	public BookController(BookService bookService, UserService userService) {
		super();
		this.bookService = bookService;
	}

	// add book
	@PostMapping("/book")
	public ResponseEntity<Book> addBook(@RequestBody Book book) {
		Book addedBook = bookService.addBook(book);
		return new ResponseEntity<Book>(addedBook, HttpStatus.CREATED);
	}
	
	//get all books
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	//lend book to user
	@GetMapping("/lendbook/{userId}/{isbn}")
	public ResponseEntity<User> lendBookToUser(@PathVariable("userId") int userId,@PathVariable("isbn") int isbn){
		User user = bookService.lendBookToUser(userId,isbn);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}

}
