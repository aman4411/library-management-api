package com.librarymanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.Getter;

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

	public User(int userId, String name, String address, String book1issue, String book2issue, String book1return,
			String book2return) {
		super();
		this.userId = userId;
		this.name = name;
		this.address = address;
		this.book1issue = book1issue;
		this.book2issue = book2issue;
		this.book1return = book1return;
		this.book2return = book2return;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBook1issue() {
		return book1issue;
	}

	public void setBook1issue(String book1issue) {
		this.book1issue = book1issue;
	}

	public String getBook2issue() {
		return book2issue;
	}

	public void setBook2issue(String book2issue) {
		this.book2issue = book2issue;
	}

	public String getBook1return() {
		return book1return;
	}

	public void setBook1return(String book1return) {
		this.book1return = book1return;
	}

	public String getBook2return() {
		return book2return;
	}

	public void setBook2return(String book2return) {
		this.book2return = book2return;
	}
	
	
	
}
