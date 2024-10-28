package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.entity.Restuarent_Entity;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class Rest_exception extends RuntimeException {
	
	public Rest_exception(String message) {
		// TODO Auto-generated constructor stub
	
	 super(message);
	}

}
