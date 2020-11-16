package entities;

import java.io.Serializable;
import java.util.ArrayList;

/** An association class linking the student and the course
 *  that they have registered
 */
public class CourseRegister implements Serializable{
	
	private Student student;
	private Course course;
	private Index index;
	
	// Status becomes True when course is registered. It becomes false when course is on waitlist
	private Boolean Status;
	
	public static ArrayList<CourseRegister>registeredList;

	public CourseRegister(Student student, Course course, Index index, Boolean status){
		this.setStudent(student);
		this.setCourse(course);
		this.setIndex(index);
		this.setStatus(status);
	}

	//return the student
	
	public Student getStudent() {
		return student;
	}

	
	public void setStudent(Student student) {
		this.student = student;
	}

	
	public Course getCourse() {
		return course;
	}

	
	public void setCourse(Course course) {
		this.course = course;
	}

	
	public Index getIndex() {
		return index;
	}

	
	public void setIndex(Index index) {
		this.index = index;
	}

	
	public Boolean getStatus() {
		return Status;
	}

	public void setStatus(Boolean status) {
		Status = status;
	}
	
}