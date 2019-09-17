package com.rest.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rest.restdemo.pojo.CreateCustomerRequestDto;
import com.rest.restdemo.pojo.CreateCustomerResponseDto;
import com.rest.restdemo.pojo.DeleteCustomerResponseDto;
import com.rest.restdemo.pojo.GetCustomerResponseDto;
import com.rest.restdemo.pojo.GetCustomersResponseDto;
import com.rest.restdemo.pojo.UpdateCustomerRequestDto;
import com.rest.restdemo.pojo.UpdateCustomerResponseDto;
import com.rest.restdemo.service.CustomerService;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping(path="/{customerId}", produces= {MediaType.APPLICATION_JSON_VALUE})
	public GetCustomerResponseDto getCustomerById(@PathVariable("customerId") Long id) {
		return customerService.getById(id);
	}
	
	@PostMapping(produces= {MediaType.APPLICATION_JSON_VALUE})
	public CreateCustomerResponseDto createCustomer(@Valid @RequestBody CreateCustomerRequestDto dto) {
		return customerService.createCustomer(dto);
	}
	
	@PutMapping(path="/{customerId}",produces= {MediaType.APPLICATION_JSON_VALUE})
	public UpdateCustomerResponseDto updateCustomer(@Valid @RequestBody UpdateCustomerRequestDto dto) {
		return customerService.updateCustomer(dto);
	}
	
	@DeleteMapping(path="/{customerId}",produces= {MediaType.APPLICATION_JSON_VALUE})
	public DeleteCustomerResponseDto deleteCustomer(@PathVariable("customerId") Long id) {
		return customerService.deleteCustomer(id);
	}
	
	@GetMapping(produces= {MediaType.APPLICATION_JSON_VALUE})
	public GetCustomersResponseDto getCustomers(@RequestParam(name="pageNumber", defaultValue="0") int pageNumber,
			@RequestParam(name ="fetchSize",defaultValue="10") int fetchSize) {
		return customerService.getCustomers(pageNumber,fetchSize);
	}
	
}
