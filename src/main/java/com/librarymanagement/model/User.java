package com.librarymanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@Column(nullable=false)
	private String name;
	
	private String address;
	
	@Column(name="book1_issue")
	private String book1issue;
	
	@Column(name="book2_issue")
	private String book2issue;
	
	@Column(name="book1_return")
	private String book1return;
	
	@Column(name="book2_return")
	private String book2return;
	
}
