package com.rest.restdemo.pojo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CreateCustomerRequestDto {

	@NotNull(message = "Provide name")
	@NotBlank(message = "Name cannot be blank")
	private String name;

	@NotNull(message = "Provide name")
	@NotBlank(message = "Name cannot be blank")
	private String nationalId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

}
