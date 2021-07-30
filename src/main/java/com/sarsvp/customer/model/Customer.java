package com.sarsvp.customer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;


@Entity
@Table(name = "Customer")
@Data
public class Customer {

	@Id
	private String id;
	
	@NotBlank(message = "name must not be blank")
	@Column(nullable = false)
	private String name; 
	
	
	@NotBlank(message = "address must not be blank")
	@Column(nullable = false, name = "address_id")
	private String address_id;
	
	@NotBlank(message="must not be blank or null")
	@Pattern(regexp = "\\d+" , message="must be numbers only")
	@Size(min=10, max=10, message="length of phone number must be 10")
	@Column(nullable = false, unique=true)
	private String phone;
	
	@NotBlank(message = "account id must not be empty")
	@Column(nullable = false, name = "account_id", unique = true)
	private String account_id;
	
	
}
