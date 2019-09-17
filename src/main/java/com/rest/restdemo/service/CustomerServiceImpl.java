package com.rest.restdemo.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.rest.restdemo.pojo.CreateCustomerRequestDto;
import com.rest.restdemo.pojo.CreateCustomerResponseDto;
import com.rest.restdemo.pojo.DeleteCustomerResponseDto;
import com.rest.restdemo.pojo.GetCustomerResponseDto;
import com.rest.restdemo.pojo.GetCustomersResponseDto;
import com.rest.restdemo.pojo.UpdateCustomerRequestDto;
import com.rest.restdemo.pojo.UpdateCustomerResponseDto;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public GetCustomerResponseDto getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CreateCustomerResponseDto createCustomer(@Valid CreateCustomerRequestDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UpdateCustomerResponseDto updateCustomer(@Valid UpdateCustomerRequestDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DeleteCustomerResponseDto deleteCustomer(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetCustomersResponseDto getCustomers(int pageNumber, int fetchSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
