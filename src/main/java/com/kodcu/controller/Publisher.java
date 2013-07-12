package com.kodcu.controller;

import java.util.List;

public class Publisher {

	private String publisherName;
	private String email;
	private List<Book> publishedBooks;

	public List<Book> getPublishedBooks() {
		return publishedBooks;
	}
	public void setPublishedBooks(List<Book> publishedBooks) {
		this.publishedBooks = publishedBooks;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
