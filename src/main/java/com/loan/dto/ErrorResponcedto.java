package com.loan.dto;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ErrorResponcedto {

	private String APIPath;
	
	private HttpStatus errorCode;
	
	private String errorMessage;
	
	private LocalDateTime Errortime;
	
	private  String errorDescription;
	
}


