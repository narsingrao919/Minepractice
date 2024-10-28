package com.example.exception;

import java.util.Date;

import org.springframework.context.annotation.Description;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Errormessage {
	private Date Date;
	private String Errormessage ;
	private String Description;

}
