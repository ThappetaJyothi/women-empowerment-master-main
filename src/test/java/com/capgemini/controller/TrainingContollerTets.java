package com.capgemini.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

@SpringBootTest
public class TrainingContollerTets {
	@Autowired
	private TrainingCourseController controller;
	@Test
	public void testViewTrainingCourse() {
		HttpStatus expected=controller.viewTrainingCourse(1).getStatusCode();
		HttpStatus actual=HttpStatus.OK;
		assertEquals(expected,actual);
	}
	@Test
	public void testViewTrainingCours() {
		HttpStatus expected=controller.viewTrainingCourse(1).getStatusCode();
		HttpStatus actual=HttpStatus.NOT_FOUND;
		assertNotEquals(expected,actual);
	}
	
	

}
