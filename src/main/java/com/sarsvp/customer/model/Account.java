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
@Table(name = "account")
@Data
public class Account {

	@Id
	private String id;
	
	@NotBlank(message = "account id must not be blank")
	@Column(name = "account_id", nullable = false)
	private String account_id;
	
	@Enumerated(EnumType.STRING)
	@Column(name="account_type", nullable = false)
	private AccountType type;
	
	@Column(name = "account_balance", nullable = false)
	private Double balance;
}
