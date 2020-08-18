package br.com.migration.flyway.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.migration.flyway.book.entity.Books;
import br.com.migration.flyway.book.repository.BookRepository;

@RestController
@RequestMapping("api/book")
public class BookController {
	
	@Autowired
	private BookRepository repository;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Books> save(@RequestBody Books book) {
		Books bookSave = repository.save(book);
		return ResponseEntity.status(HttpStatus.CREATED).body(bookSave);
	}
	
	@GetMapping
	public ResponseEntity<List<Books>> find() {
		List<Books> books = repository.findAll();
		return ResponseEntity.ok(books);
	}
	
	@DeleteMapping
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteAll() {
		repository.deleteAll();
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
