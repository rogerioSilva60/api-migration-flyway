package br.com.migration.flyway.contacts.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Contacts {

	@Column
	private String numberFix;
	
	@Column
	private String numberPhone;
}
