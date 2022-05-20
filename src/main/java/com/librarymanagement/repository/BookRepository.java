package com.librarymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.librarymanagement.model.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{

}
