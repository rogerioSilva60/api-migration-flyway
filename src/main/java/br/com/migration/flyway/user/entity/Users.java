package br.com.migration.flyway.user.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.migration.flyway.contacts.entity.Contacts;
import lombok.Data;

@Data
@Entity
@Table
public class Users implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name = "users_id_seq", sequenceName = "users_id_seq", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_id_seq")
	@Column(columnDefinition = "bigserial")
	private Long id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private Timestamp startCreation = new Timestamp(new Date().getTime());
	
	@Embedded
	private Contacts contacts;
}
