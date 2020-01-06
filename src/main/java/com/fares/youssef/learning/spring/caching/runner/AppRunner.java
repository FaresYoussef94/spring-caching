package com.fares.youssef.learning.spring.caching.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.fares.youssef.learning.spring.caching.repository.BookRepository;

@Component
public class AppRunner implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(AppRunner.class);

	private final BookRepository bookRepository;

	public AppRunner(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public void run(String... strings) throws Exception {
		LOG.info(".... Fetching books");
		LOG.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
		LOG.info("isbn-4567 -->" + bookRepository.getByIsbn("isbn-4567"));
		LOG.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
		LOG.info("isbn-4567 -->" + bookRepository.getByIsbn("isbn-4567"));
		LOG.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
		LOG.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
	}

}
