package com.librarymanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.librarymanagement.model.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{

	List<Book> findByTitleOrAuthor(String title, String author);
}
