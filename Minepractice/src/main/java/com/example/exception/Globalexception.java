package com.example.exception;

import java.util.Date;

import org.apache.logging.log4j.message.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class Globalexception {

	@ExceptionHandler(Idnotfoundexception.class)
	public ResponseEntity<Errormessage>resourcenotfount(Idnotfoundexception idnotfoundexception,WebRequest webRequest){
		
	Errormessage message=new Errormessage(new Date(),idnotfoundexception.getMessage(),webRequest.getDescription(false));
	return new ResponseEntity<>(message,HttpStatus.NOT_FOUND);
}
	@ExceptionHandler(Rest_exception.class)
	public ResponseEntity<Errormessage>jobnotfound(Rest_exception rest_exception,WebRequest webRequest){
		
		Errormessage message=new Errormessage(new Date(),rest_exception.getMessage(),webRequest.getDescription(false));
		return new ResponseEntity<>(message,HttpStatus.NOT_FOUND);
	}
}
	
