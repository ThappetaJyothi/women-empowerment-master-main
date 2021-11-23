package com.capgemini.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
// enum CourseName{
//	SOCIALAWARENESS,
//	EMPOWERINGTHENATION,
//	SEEKINGWOMENSRIGHT,
//	PSYCHOLOGYOFPOLITICALACTIVISM
//}

@Entity
@Table(name="training")
public class TrainingCourse {
	 @Id
	@GeneratedValue//for the generation of primary key
	private int courseId;
	// @Enumerated(EnumType.STRING)
	private String courseName;
	private String CourseDurationn;
	private String courseStatus;
	@Temporal(TemporalType.DATE)
	private Date startingDate;
	@Temporal(TemporalType.DATE)
	private Date endingDate;
	
	public TrainingCourse() {
		super();
	}
	public TrainingCourse( String courseName, String courseDurationn, String courseStatus,Date startingDate,Date endingDate) {
		super();
	
		this.courseName = courseName;
		CourseDurationn = courseDurationn;
		this.courseStatus = courseStatus;
		this.startingDate=startingDate;
		this.endingDate=endingDate;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDurationn() {
		return CourseDurationn;
	}
	public void setCourseDurationn(String courseDurationn) {
		CourseDurationn = courseDurationn;
	}
	public String getCourseStatus() {
		return courseStatus;
	}
	public void setCourseStatus(String courseStatus) {
		this.courseStatus = courseStatus;
	}
	public Date getStartingDate() {
		return startingDate;
	}
	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}
	public Date getEndingDate() {
		return endingDate;
	}
	public void setEndingDate(Date endingDate) {
		this.endingDate = endingDate;
	}
	
	

}
