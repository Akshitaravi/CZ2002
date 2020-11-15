package SS9Project;
//package entities;

import java.io.Serializable;
import java.util.*;

/*
 * Each course represent a subject for a degree programme. Each course can have multiple indexes.
 *
 * Done by AKSHITA RAVISANKAR, HOO KAH JUN, JEWELLE LIM FONG YEE, LEE YU JIE MELVIN, PUVVADA MEGHANA
 */

//public class Course implements Serializable {
public class Course {

	// Name of course
	private String courseName;

	// Course Identifier (Eg: CE/CZxxxx) unique code of each course.
	private String courseID;

	// List of Index (Class) under the course
	private ArrayList<Index> index;

	// the school the course belongs to
	// private School school;

	// number of academic AUs
	private String noofAU;

	// lesson type of this course: 3 main types
	// 1st: lecture only, 2nd: lecture and tutorial, 3rd: lecture, tutorial and lab
	private String lessonType;

	// creates a course
	// public Course(String courseName, String courseID, ArrayList<Index> index) {
	public Course() {
		super();
	}

	// get name of a course
	public String getCourseName() {
		return courseName;
	}

	// change the name of a course
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	// get course id of a course
	public String getCourseID() {
		return courseID;
	}

	// chanage code id of a course
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}

	// get all the index of the course
	public ArrayList<Index> getCourseIndex() {
		return index;
	}

	// change index of a particular course
	public void setCourseIndex(ArrayList<Index> index) {
		this.index = index;
	}

	// get the number of academic units of a course
	public String getnoofAU() {
		return noofAU;
	}

	// change number of academic units of a course
	public void setnoofAU(String noofAU) {
		this.noofAU = noofAU;
	}

	// get school this course belongs to
	// public School getSchool() {
	// return school;
	// }

	// change school of course
	// public void setSchool(School school) {
	// this.school = school;
	// }

	// get lesson type of course
	public String getLessonType() {
		return lessonType;
	}

	// change lesson type of a course
	public void setLessonType(String lessonType) {
		this.lessonType = lessonType;
	}
}
