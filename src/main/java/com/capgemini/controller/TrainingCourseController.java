package com.capgemini.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.TrainingCourse;
import com.capgemini.service.ITrainingCourseService;



@RestController
public class TrainingCourseController {
	private static final Logger LOG = LoggerFactory.getLogger(TrainingCourseController.class);
	
	@Autowired
	private  ITrainingCourseService itrainingCourseService;
	
	@PostMapping("/trainingcourses")
	public ResponseEntity<TrainingCourse> addTrainingCourse(@RequestBody TrainingCourse trainingCourse){
		System.out.println("training course controller");
		LOG.info("training controller");
		TrainingCourse tc= itrainingCourseService.addTrainingCourse(trainingCourse);
		HttpHeaders  headers=new HttpHeaders();
		headers.add("message"," The course is added to the dataBase");
		ResponseEntity<TrainingCourse> response=new ResponseEntity<TrainingCourse>(tc,headers,HttpStatus.OK);
		return response;
		
		//return itrainingCourseService.addTrainingCourse(trainingCourse);
	}
	@GetMapping("/trainingcourse/{courseID}")
	public ResponseEntity<TrainingCourse> viewTrainingCourse(@PathVariable int courseID){
		LOG.info("courses view by id");
		TrainingCourse tc= itrainingCourseService.viewTrainingCourse(courseID);
		HttpHeaders headers=new HttpHeaders();
		headers.add("message", "The course "+courseID+" is find with details");
		ResponseEntity<TrainingCourse> response=new ResponseEntity<TrainingCourse>(tc,headers,HttpStatus.OK);
		return response;
	}
	
	@DeleteMapping("/deletecourse/{courseID}")
	public ResponseEntity<TrainingCourse> deleteTrainingCourse(@PathVariable int courseID){
		LOG.info("delete by id");
		TrainingCourse tc= itrainingCourseService.deleteTrainingCourse(courseID);
		HttpHeaders headers=new HttpHeaders();
		headers.add("message","course is deleted perfectly");
		ResponseEntity<TrainingCourse> response=new ResponseEntity<TrainingCourse>(tc,headers,HttpStatus.OK);
		return response;
	}
	
	@PostMapping("/update/{courseID}")
	public ResponseEntity<TrainingCourse> updateTrainingCourse(@RequestBody TrainingCourse course) {
		LOG.info("update the course");
		TrainingCourse tc=itrainingCourseService.updateTrainingCourse(course);
		HttpHeaders headers=new HttpHeaders();
		headers.add("message","Course updated sucessfully");
		ResponseEntity<TrainingCourse> response=new ResponseEntity<TrainingCourse>(tc,headers,HttpStatus.OK);
		return response;
		
	}
	@GetMapping("/viewallcourses")
	public List<TrainingCourse> viewAllTrainingCourse() {
		LOG.info("update the course");
		List<TrainingCourse> tc=itrainingCourseService.viewAllTrainingCourse();
		HttpHeaders headers=new HttpHeaders();
		headers.add("message","Here the all courses");
		ResponseEntity<TrainingCourse> response=new ResponseEntity<TrainingCourse>(headers,HttpStatus.OK);
		return tc;
		
	}
	
	

}