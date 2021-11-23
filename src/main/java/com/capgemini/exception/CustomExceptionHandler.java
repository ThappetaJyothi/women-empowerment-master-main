package com.capgemini.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends  ResponseEntityExceptionHandler {
	private static final Logger LOG = LoggerFactory.getLogger(CustomExceptionHandler.class);
	@ExceptionHandler(TrainingCourseNotFoundException.class)
	public ResponseEntity<Object> handleTrainingCourseNotFoundException(){
		LOG.error("handle training course not found exception");
		HttpHeaders headers=new HttpHeaders();
		headers.add("message","Training course not found");
		return new ResponseEntity<Object>(null, headers, HttpStatus.NOT_FOUND);
	}

}
