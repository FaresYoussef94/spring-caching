package com.fares.youssef.learning.spring.caching.repository;

import org.springframework.stereotype.Component;

import com.fares.youssef.learning.spring.caching.model.Book;

@Component
public class SimpleBookRepositoryImpl implements BookRepository {

	@Override
	public Book getByIsbn(String isbn) {
		simulateSlowService();
		return new Book(isbn, "Some book");
	}

	private void simulateSlowService() {
		try {
			long time = 3000L;
			Thread.sleep(time);
		} catch (InterruptedException e) {
			throw new IllegalStateException(e);
		}
	}

}
