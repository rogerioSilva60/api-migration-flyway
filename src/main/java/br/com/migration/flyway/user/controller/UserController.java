package br.com.migration.flyway.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.migration.flyway.user.entity.Users;
import br.com.migration.flyway.user.repository.UserRepository;

@RestController
@RequestMapping("api/user")
public class UserController {

	@Autowired
	private UserRepository repository;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Users> save(@RequestBody Users user) {
		Users userSave = repository.save(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(userSave);
	}
	
	@GetMapping
	public ResponseEntity<List<Users>> find() {
		List<Users> users = repository.findAll();
		return ResponseEntity.ok(users);
	}
	
	@DeleteMapping
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete() {
		repository.deleteAll();
	}
}
