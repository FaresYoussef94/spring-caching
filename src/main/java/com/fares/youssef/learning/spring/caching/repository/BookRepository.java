package com.fares.youssef.learning.spring.caching.repository;

import com.fares.youssef.learning.spring.caching.model.Book;

public interface BookRepository {

	Book getByIsbn(String isbn);

}
