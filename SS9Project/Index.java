package SS9Project;
package entities;

import java.io.Serializable;

import entities.Course;
import entities.Lesson;
import entities.WaitList;
import entities.Schedule;


/*
 * Each Index represent a class for a course.
 *
 * Done by AKSHITA RAVISANKAR, HOO KAH JUN, JEWELLE LIM FONG YEE, LEE YU JIE MELVIN, PUVVADA MEGHANA
 */

public class Index{
	// Index ID for a Course
	private int indexID;
	// Course ID that the index belongs to
	private String courseID;
	// Vacancy left for the index
	private int vacancy;
	// Schedule for the index
	private Schedule schedule;
	// total number of students this index can have
	private String size;
	//number of students who have added this Index to their stars
	private String numberOfStudent;
	//waitlist of this index
	private WaitList waitlist;
	//course this index belongs to
	private Course course;

	//create a new index
	public Index(){
	}
	//get the index number
	public int getIndexID() {
		return indexID;
	}
	//change index number
	public void setIndexID(int indexID) {
		this.indexID = indexID;
	}
	//gets the course code which this Index belongs to.
	public String getCourseID() {
		return courseID;
	}
	//change course code this index belongs to
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	//gets number of empty spaces available for students in this index
	public int getIndexVacancy() {
		return vacancy;
	}
	//changes the number of empty spaces available for students in this index
	public void setIndexVacancy(int vacancy) {
		this.vacancy = vacancy;
	}
	//gets the schedule of lessons this index has
	public Schedule getIndexSchedule() {
		return schedule;
	}
	//changes the schedule of lessons this index has
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	//get the waitlist of this index
	public WaitList getWaitlist() {
		return waitlist;
	}
	//change the waitlist of this index
	public void setWaitlist(WaitList waitlist) {
		this.waitlist = waitlist;
	}
	//get the course this index belongs to
	public Course getCourse() {
		return course;
	}
	//change course of this index
	public void setCourse(Course course) {
		this.course = course;
	}
	//gets number of students who have added this Index to their stars
	public String getNumberOfStudent() {
		return numberOfStudent;
	}
	//changes number of students who have added this Index to their stars
	public void setNumberOfStudent(String numberOfStudent) {
		this.numberOfStudent = numberOfStudent;
	}	
	//gets total number of students this index can have
	public String getSize() {
		return size;
	}
	//changes total number of students this index can have
	public void setSize(String size) {
		this.size = size;
	}

}
