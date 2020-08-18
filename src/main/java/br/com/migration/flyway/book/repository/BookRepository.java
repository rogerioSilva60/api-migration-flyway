package br.com.migration.flyway.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.migration.flyway.book.entity.Books;

public interface BookRepository extends JpaRepository<Books, Long> {

}
