package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.document.Book;
import com.app.repo.BookRepository;

@Component
public class ConsoleRunner implements CommandLineRunner {
	
	@Autowired
	private BookRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.deleteAll();
		repo.save(new Book("Java", "Nageswara Rao", 250.36));
		repo.save(new Book(".Net", "Prabhkar", 230.36));
		repo.save(new Book("Pyton", "Raja Rao", 280.36));
	  
	}

}
