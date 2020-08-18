package br.com.migration.flyway.book.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Books implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "books_id_seq", sequenceName = "books_id_seq", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "books_id_seq")
	@Column(columnDefinition = "bigserial")
	private Long id;
	
	@Column(nullable = false)
	private String description;
	
	@Column(nullable = false)
	private String title;
	
	@Column(columnDefinition = "bigint default 0")
	private Long releaseYear = 0l;
	
	@Column
	private Timestamp startCreation = new Timestamp(new Date().getTime());
}
