package com.sarsvp.customer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Entity
@Table(name = "People")
@Data
public class People {

	@Id
	private String id;
	
	/*Employee / Customer / ADMin*/
	@Enumerated(EnumType.STRING)
	@Column(nullable = false, name = "type")
	private PeopleType type;
	

	@NotBlank(message = "account id must not be empty")
	@Column(nullable = false, name = "account_id", unique = true)
	private String account_id;
}
