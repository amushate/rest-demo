package com.rest.restdemo.service;

import javax.validation.Valid;

import com.rest.restdemo.pojo.CreateCustomerRequestDto;
import com.rest.restdemo.pojo.CreateCustomerResponseDto;
import com.rest.restdemo.pojo.DeleteCustomerResponseDto;
import com.rest.restdemo.pojo.GetCustomerResponseDto;
import com.rest.restdemo.pojo.GetCustomersResponseDto;
import com.rest.restdemo.pojo.UpdateCustomerRequestDto;
import com.rest.restdemo.pojo.UpdateCustomerResponseDto;

public interface CustomerService {

	GetCustomerResponseDto getById(Long id);

	CreateCustomerResponseDto createCustomer(@Valid CreateCustomerRequestDto dto);

	UpdateCustomerResponseDto updateCustomer(@Valid UpdateCustomerRequestDto dto);

	DeleteCustomerResponseDto deleteCustomer(Long id);

	GetCustomersResponseDto getCustomers(int pageNumber, int fetchSize);

}
