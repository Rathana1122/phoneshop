package com.phoneshop.phoneshop.exception;

import org.springframework.http.HttpStatus;

public class ResoureNotFoundException extends ApiException{

	
	public ResoureNotFoundException( String resourceName,Integer id) {
		super(HttpStatus.NOT_FOUND, String.format("%s with id = %d not found", resourceName,id));
	}

}
